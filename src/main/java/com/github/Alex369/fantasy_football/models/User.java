package com.github.Alex369.fantasy_football.models;

public class User {

    private Long id;
    private String username;
    private String email;
    private String password;

    public User(Long id, String username, String email, String password){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
