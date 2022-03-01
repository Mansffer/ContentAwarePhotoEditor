package st235.com.github.sampleapp

val ME = Author(
    avatar = R.drawable.avatar_1,
    name = "Alexander Dadukin"
)

val DR_ACULA = Author(
    avatar = R.drawable.avatar_6,
    name = "Dr. Acula"
)

val MR_ROBOT = Author(
    avatar = R.drawable.avatar_2,
    name = "Mr. Robot"
)

val ELLIOT_SMITH = Author(
    avatar = R.drawable.avatar_3,
    name = "Elliot Smith"
)

val LEGO_ADVENTURES = Author(
    avatar = R.drawable.avatar_5,
    name = "Lego Adventures"
)

val NEIL_FEIMAN = Author(
    avatar = R.drawable.avatar_4,
    name = "Neil Feiman"
)

val FEED_ITEMS = listOf(
    FeedItem(
        id = 1,
        description = "Never measure the height of a mountain until you reach the top. Then you will see how low it was.",
        author = DR_ACULA,
        likes = Likes(
            count = "120K",
            isLiked = false
        ),
        tags = listOf("#mountains", "#night", "#beauty", "#nature"),
        image = R.drawable.mountain_1
    ),
    FeedItem(
        id = 2,
        description = "Somewhere between the bottom of the climb and the summit is the answer to the mystery why we climb.",
        author = ME,
        likes = Likes(
            count = "50K",
            isLiked = true
        ),
        tags = listOf("mountains", "🇫🇷", "France", "snow", "skiing", "hiking", "sport", "climbing"),
        image = R.drawable.mountain_2
    ),
    FeedItem(
        id = 3,
        description = "The ocean makes me feel really small and it makes me put my whole life into perspective.",
        author = ELLIOT_SMITH,
        likes = Likes(
            count = "1.2M",
            isLiked = true
        ),
        tags = listOf("#ocean", "#sand", "#beach"),
        image = R.drawable.ocean_1
    ),
    FeedItem(
        id = 4,
        description = "There's nothing wrong with enjoying looking at the surface of the ocean itself, except that when you finally see what goes on underwater, you realize that you've been missing the whole point of the ocean. Staying on the surface all the time is like going to the circus and staring at the outside of the tent.",
        author = MR_ROBOT,
        likes = Likes(
            count = "99K",
            isLiked = false
        ),
        tags = listOf("#ocean", "#calm", "#staystill"),
        image = R.drawable.ocean_2
    ),
    FeedItem(
        id = 5,
        description = "I go to Paris, I go to London, I go to Rome, and I always say, 'There's no place like New York. It's the most exciting city in the world now.",
        author = DR_ACULA,
        likes = Likes(
            count = "354K",
            isLiked = true
        ),
        tags = listOf("#New-York", "#London", "#Rome", "#Paris"),
        image = R.drawable.city_1
    ),
    FeedItem(
        id = 6,
        description = "Owners of dogs will have noticed that, if you provide them with food and water and shelter and affection, they will think you are God. Whereas owners of cats are compelled to realize that, if you provide them with food and water and affection, they draw the conclusion that they are God.",
        author = ME,
        likes = Likes(
            count = "∞",
            isLiked = true
        ),
        tags = listOf("#cat", "#pets", "#home", "#dogs",  "#food"),
        image = R.drawable.cat_1
    ),
    FeedItem(
        id = 7,
        description = "New York now leads the world's great cities in the number of people around whom you shouldn't make a sudden move.",
        author = Author(
            avatar = R.drawable.avatar_1,
            name = "Alexander Dadukin"
        ),
        likes = Likes(
            count = "6K",
            isLiked = true
        ),
        tags = listOf("#city", "#new-york"),
        image = R.drawable.city_2
    ),
    FeedItem(
        id = 8,
        description = "Cats know how to obtain food without labor, shelter without confinement, and love without penalties.",
        author = Author(
            avatar = R.drawable.avatar_1,
            name = "Alexander Dadukin"
        ),
        likes = Likes(
            count = "611K",
            isLiked = true
        ),
        tags = listOf("#cat", "#love", "❤️"),
        image = R.drawable.cat_2
    ),
    FeedItem(
        id = 9,
        description = "Build, play, destroy, repeat.",
        author = LEGO_ADVENTURES,
        likes = Likes(
            count = "2.3M",
            isLiked = true
        ),
        tags = listOf("#lego", "#peices", "#briks"),
        image = R.drawable.lego_1
    ),
    FeedItem(
        id = 10,
        description = "Cities were always like people, showing their varying personalities to the traveler. Depending on the city and on the traveler, there might begin a mutual love, or dislike, friendship, or enmity.",
        author = NEIL_FEIMAN,
        likes = Likes(
            count = "1.1M",
            isLiked = false
        ),
        tags = listOf("#city", "#stories", "#legend", "#calm", "#vacation", "#love"),
        image = R.drawable.city_3
    ),
    FeedItem(
        id = 11,
        description = "The sound a box of Lego makes is the noise of a child's mind working, looking for the right piece. Shake it, and it's almost creativity in aural form.",
        author = LEGO_ADVENTURES,
        likes = Likes(
            count = "923K",
            isLiked = false
        ),
        tags = listOf("#lego", "#building", "#creativity", "#imagination", "#build", "#rebuild"),
        image = R.drawable.lego_2
    ),
    FeedItem(
        id = 12,
        description = "Life is like a balloon; you must put something into it to get the best possible results.",
        author = MR_ROBOT,
        likes = Likes(
            count = "3.97M",
            isLiked = true
        ),
        tags = listOf("#balloons", "#nature", "#sky"),
        image = R.drawable.balloons_1
    ),
    FeedItem(
        id = 13,
        description = "We buy balloons, we let them go.",
        author = MR_ROBOT,
        likes = Likes(
            count = "412K",
            isLiked = false
        ),
        tags = listOf("#balloons", "#nature", "#sky"),
        image = R.drawable.balloons_2
    ),
    FeedItem(
        id = 14,
        description = "Wow, such a wonderful place!",
        author = ME,
        likes = Likes(
            count = "813K",
            isLiked = true
        ),
        tags = listOf("#tree", "#nature", "#me", "#vacation"),
        image = R.drawable.tree_1
    )
)
