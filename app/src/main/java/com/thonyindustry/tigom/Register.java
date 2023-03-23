package com.thonyindustry.tigom;

public class Register {

    private Integer accountId;

    private int statusid;

    private String username;

    private String password;

    public int getStatusid() {
        return statusid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setStatusid(int statusid) {
        this.statusid = statusid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
