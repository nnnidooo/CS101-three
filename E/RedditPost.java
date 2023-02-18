package E;

import java.util.Date;

public class RedditPost {
    private Date postDate;//
    private String author;
    private int balance;
    private String title;

    public RedditPost(String author, String title) {
        this.author = author;
        this.postDate = new Date(); //
        this.balance = 1; //
        this.title = title;
    }

    //Getters & setters
    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        RedditPost post = new RedditPost("Patrick John",  "How to fix your car" );
        post.getPostDate();
        System.out.println(post);
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "postDate=" + postDate +
                ", author='" + author + '\'' +
                ", balance=" + balance +
                ", title='" + title + '\'' +
                '}';
    }
}

