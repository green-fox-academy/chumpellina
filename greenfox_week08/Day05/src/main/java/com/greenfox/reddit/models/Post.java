package com.greenfox.reddit.models;

public class Post {
    private int rank;
    private String link;
    private String title;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post(String link, String title) {
        this.link = link;
        this.title = title;
    }

    public Post() {
    }
}
