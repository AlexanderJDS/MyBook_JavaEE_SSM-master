package com.mstf.book1.pojo;

public class User {

    private int id;
    private String userName;
    private String userPwd;
    private String userSex;
    private String userPhone;
    private String userAddress;
    private String userEmail;

    public User() {
    }

    public User(int id, String userName, String userPwd, String userSex, String userPhone, String userAddress, String userEmail) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
