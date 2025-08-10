package org.example;

public class Sayings {
    private int id;
    private String saying;
    private String author;
    public Sayings(int id, String saying, String author){
        this.id = id;
        this.saying = saying;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getSaying() {
        return saying;
    }

    public String getAuthor() {
        return author;
    }
}
