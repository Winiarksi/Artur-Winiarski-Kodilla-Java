package Module_6.Module_6_4;

import java.util.Objects;

public class ForumPost {

    private String postBody;
    private String author;

    public ForumPost(String postBody, String author){
        this.postBody = postBody;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost)) return false;
        ForumPost forumPost = (ForumPost) o;
        return Objects.equals(getPostBody(), forumPost.getPostBody()) &&
                Objects.equals(getAuthor(), forumPost.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }
}
