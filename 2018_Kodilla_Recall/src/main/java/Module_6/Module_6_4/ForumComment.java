package Module_6.Module_6_4;

import java.util.Objects;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author){
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;
        ForumComment that = (ForumComment) o;
        return Objects.equals(getForumPost(), that.getForumPost()) &&
                Objects.equals(getCommentBody(), that.getCommentBody()) &&
                Objects.equals(getAuthor(), that.getAuthor());
    }

    @Override
    public int hashCode() {

        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }
}