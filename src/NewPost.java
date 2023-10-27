public class NewPost implements Post {
    private String postData = "This is ..";

    @Override
    public String getAllPosts() {
        return postData;
    }
}
