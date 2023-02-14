package C;

import java.util.ArrayList;

public class Article {

    private String author;
    private String title;


    public Article(String author, String title) {
        this.author=author;
        this.title=title;

    }

    @Override
    public String toString() {
        return "Article{" +
                "Author='" + author + '\'' +
                ", Title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article("Chris Jakobsen","Hvorfor får man SU i DK?"));
        articles.add(new Article("Helle Nielsen","Sådan får du en naturlig glød"));
        articles.add(new Article("Tom Frydegaard","Hvorfor fuldtids-arbejde nedslider en"));
        articles.add(new Article("Katrine Hansen","Hvorfor vi skal have flere almenboliger"));
        articles.add(new Article("Dean Morgan","Why you should invest in crypto"));

        System.out.println(articles);
    }
}