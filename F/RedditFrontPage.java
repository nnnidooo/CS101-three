package F;


import java.util.ArrayList;

public class RedditFrontPage {

  private ArrayList<RedditFrontPage> posts;

    public RedditFrontPage(){
       this.posts = new ArrayList<>();
    }

    public void deletePost(int index) {
        posts.remove(index);
    }

    //Getters & Setters
    public ArrayList<RedditFrontPage> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<RedditFrontPage> posts) {
        this.posts = posts;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "RedditFrontPage{" +
                "posts=" + posts +
                '}';
    }
}
