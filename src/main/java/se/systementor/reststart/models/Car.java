package se.systementor.reststart.models;

import java.time.LocalDateTime;

public class Car {
    private LocalDateTime created;
    private LocalDateTime lastModified;
    private LocalDateTime auctionStarting;
    private LocalDateTime auctionEnding;
    private String regno;
    private String manufacturer;
    private String model;
    private int year;
    private int mil;
    private int startingPrice;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMil() {
        return mil;
    }

    public void setMil(int mil) {
        this.mil = mil;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }

    public LocalDateTime getAuctionStarting() {
        return auctionStarting;
    }

    public void setAuctionStarting(LocalDateTime auctionStarting) {
        this.auctionStarting = auctionStarting;
    }

    public LocalDateTime getAuctionEnding() {
        return auctionEnding;
    }

    public void setAuctionEnding(LocalDateTime auctionEnding) {
        this.auctionEnding = auctionEnding;
    }
}
