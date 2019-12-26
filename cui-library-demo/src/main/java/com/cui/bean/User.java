package com.cui.bean;


public class User {
    private String username;
    private int role;
    private String password;
    private Integer id;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = username;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


