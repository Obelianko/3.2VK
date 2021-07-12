package ru.netology.domain;

public class CommentsInfo {
    private int commentId;
    private int commentOwnerId;
    private String commentText;
    private String commentDate;
    private int commentPictureId; // id картинки в посте
    private int commentLikesCount;
    private int commentRepostsCount;
    private boolean canReplyToComment;
    private boolean canDeleteComment;
    private boolean canEditComment;
}
