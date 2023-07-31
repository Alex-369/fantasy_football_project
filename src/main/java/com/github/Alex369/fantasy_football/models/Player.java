package com.github.Alex369.fantasy_football.models;

public class Player {
    private Long id;
    private String name;
    private int age;
    private String nationality;
    private String position;
    private double price;
    private int points;
    private int tourPoints;
    private String photo;

    public Player(Long id, String name, int age, String nationality, String position, double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.price = price;
    }

    public Player(Long id, String name, int age, String nationality, String position, double price, String photo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.price = price;
        this.photo = photo;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTourPoints() {
        return tourPoints;
    }

    public void setTourPoints(int tourPoints) {
        this.tourPoints = tourPoints;
    }
}
