package E;

import java.util.Date;

public class RedditPost {
    private String date;
    private String author;
    private int balance;
    private String title;

    public RedditPost(String author, String date, int balance,String title) {
        this.author = author;
        this.date=date;
        this.balance=balance;
        this.title=title;
    }

    public Cloneable getDate() {
        return new Date();
    }

    public String getAuthor() {
        return author;
    }

    public int getBalance() {
        return balance;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        RedditPost post = new RedditPost("Patrick John", "23/4-2016", 0, "How to fix your car" );
        post.getDate();
        System.out.println(post);
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "date='" + date + '\'' +
                ", author='" + author + '\'' +
                ", balance=" + balance +
                ", title='" + title + '\'' +
                '}';
    }
}
