package com.example.demo.model;

public class Game {
    private int gameId;
    private String name;
    private String developer;
    private String publisher;
    private String platforms;
    private int requiredAge;
    private String categories;
    private int positiveRatings;
    private int negativeRatings;
    private float averagePlaytime;
    private float medianPlaytime;
    private String owners;
    private double price;

    // Getter 和 Setter 方法
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public int getRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(int requiredAge) {
        this.requiredAge = requiredAge;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public int getPositiveRatings() {
        return positiveRatings;
    }

    public void setPositiveRatings(int positiveRatings) {
        this.positiveRatings = positiveRatings;
    }

    public int getNegativeRatings() {
        return negativeRatings;
    }

    public void setNegativeRatings(int negativeRatings) {
        this.negativeRatings = negativeRatings;
    }

    public float getAveragePlaytime() {
        return averagePlaytime;
    }

    public void setAveragePlaytime(float averagePlaytime) {
        this.averagePlaytime = averagePlaytime;
    }

    public float getMedianPlaytime() {
        return medianPlaytime;
    }

    public void setMedianPlaytime(float medianPlaytime) {
        this.medianPlaytime = medianPlaytime;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", platforms='" + platforms + '\'' +
                ", requiredAge=" + requiredAge +
                ", categories='" + categories + '\'' +
                ", positiveRatings=" + positiveRatings +
                ", negativeRatings=" + negativeRatings +
                ", averagePlaytime=" + averagePlaytime +
                ", medianPlaytime=" + medianPlaytime +
                ", owners=" + owners +
                ", price=" + price +
                '}';
    }
}