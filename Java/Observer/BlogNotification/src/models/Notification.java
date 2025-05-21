package models;

public class Notification {
    private String author;
    private String blogTitle;

    public Notification(String author, String blogTitle) {
        this.author = author;
        this.blogTitle = blogTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBlogTitle() {
        return this.blogTitle;
    }

    @Override
    public String toString() {
        return "Author : "+this.author+"\n"+"Title : "+this.blogTitle;
    }
}
