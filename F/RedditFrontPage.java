package F;
import E.RedditPost;
import java.util.ArrayList;
import java.util.Scanner;

public class RedditFrontPage {

  private ArrayList<RedditPost> posts;

    public RedditFrontPage(){
       this.posts = new ArrayList<>();
    }

    public void deletePost(int index) {
            posts.remove(index);
    }

    //Getters & Setters
    public ArrayList<RedditPost> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<RedditPost> posts) {
        this.posts = posts;
    }

}
