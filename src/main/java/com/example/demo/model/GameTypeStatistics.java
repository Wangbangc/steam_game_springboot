package com.example.demo.model;

public class GameTypeStatistics {
    private String category;
    private int gameCount;
    private double averagePlaytime;
    private double medianPlaytime;
    private double averagePrice;


    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public double getAveragePlaytime() {
        return averagePlaytime;
    }

    public void setAveragePlaytime(double averagePlaytime) {
        this.averagePlaytime = averagePlaytime;
    }

    public double getMedianPlaytime() {
        return medianPlaytime;
    }

    public void setMedianPlaytime(double medianPlaytime) {
        this.medianPlaytime = medianPlaytime;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }
}
