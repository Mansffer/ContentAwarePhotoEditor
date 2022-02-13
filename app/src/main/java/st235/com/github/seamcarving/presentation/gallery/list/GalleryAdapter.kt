package st235.com.github.seamcarving.presentation.gallery.list

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import st235.com.github.seamcarving.R
import st235.com.github.seamcarving.interactors.models.ImageInfo
import st235.com.github.seamcarving.interactors.models.ImageSize
import st235.com.github.seamcarving.presentation.components.AspectRatioFrameLayout

class GalleryAdapter(
    private val onItemClickListener: (item: ImageInfo) -> Unit
): RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    private val aspectRatioHash = mutableMapOf<String, Float>()
    private val asyncListDiffer = AsyncListDiffer<ImageInfo>(this, ItemCallback())

    private val items: List<ImageInfo>
    get() {
        return asyncListDiffer.currentList
    }

    fun setItems(items: List<ImageInfo>) {
        asyncListDiffer.submitList(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_gallery_list_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.setAspectRatio(item.size)
        holder.loadImage(item.uri)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position)
            return
        }

        payloads.filterIsInstance<Payload>().forEach { payload ->
            payload.value?.let {
                holder.loadImage(payload.value)
            }

            payload.size?.let {
                holder.setAspectRatio(payload.size)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val aspectRatioLayout: AspectRatioFrameLayout = itemView.findViewById(R.id.aspect_ratio_layout)
        val imageView: ImageView = itemView.findViewById(R.id.image_view)

        init {
            itemView.setOnClickListener {
                val item = items[adapterPosition]
                onItemClickListener(item)
            }
        }

        fun setAspectRatio(imageSize: ImageSize) {
            aspectRatioLayout.setAspectRatio(imageSize.width, imageSize.height)
        }

        fun loadImage(imageUri: Uri) {
            Glide.with(itemView.context)
                .load(imageUri)
                .into(imageView)
        }

    }

    private data class Payload(
        val id: String?,
        val name: String?,
        val description: String?,
        val size: ImageSize?,
        val value: Uri?
    )

    private class ItemCallback: DiffUtil.ItemCallback<ImageInfo>() {

        override fun areItemsTheSame(oldItem: ImageInfo, newItem: ImageInfo): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: ImageInfo, newItem: ImageInfo): Boolean =
            oldItem == newItem

        override fun getChangePayload(oldItem: ImageInfo, newItem: ImageInfo): Payload {
            return Payload(
                id = newItem.id.takeIf { newItem.id != oldItem.id },
                name = newItem.name.takeIf { newItem.name != oldItem.name },
                description = newItem.description.takeIf { newItem.description != oldItem.description },
                size = newItem.size.takeIf { newItem.size != oldItem.size },
                value = newItem.uri.takeIf { newItem.id != oldItem.id }
            )
        }
    }

}
