public class PrintNoLnPost implements PrintPost {
    private Post post;

    public PrintNoLnPost(Post post) {
        this.post = post;
    }

    @Override
    public void print(Post post) {
        System.out.print(post.getAllPosts());
    }
}
