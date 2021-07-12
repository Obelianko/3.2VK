package ru.netology.domain;

public class Post {
    private int OwnerId; //владелец страницы
    private int postId;
    private int postOwnerId;  // владелец поста
    private int likesCount;
    private int likeOwnerId;  // владелец лайка
    private int commentOwnerId; // владелец коммента
    private int commentId;
    private int commentsCount;
    private int postViewersCount;
    private String postName;
    private String postText;
    private int repostsCount;
    private int canDeletePost;
    private int canPinPost;
    private String postDate;
    private int canEditPost;
    private int pinnedPost;
    private int signerId;
    private int markedAsAds;
    private boolean isAddToFavorites;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;
    private LikesInfo likesinfo;
    private RepostInfo repostInfo;
    private PostViewersInfo postViewersInfo;
    private PostContentInfo postContentInfo; //copyright
}
