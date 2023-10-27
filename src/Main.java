public class Main {
    public static void main(String[] args) {
        Post post = new NewPost();
//        PrintPost printPost = new PrintPost(post);
        PrintPost printPost = new PrintNoLnPost(post);
        printPost.print();
        printPost.print();

    }
}