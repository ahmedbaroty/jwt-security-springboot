package com.baroty.jwtsecurity.model;

public class JwtUser {
    private String userName;
    private Integer id;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}