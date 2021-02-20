package com.mstf.book1.pojo.vo;

import com.mstf.book1.pojo.User;

public class UserVo extends User {

    private int id;
    private String userName;
    private String userPwd;
    private String userSex;
    private String userPhone;
    private String userAddress;
    private String userEmail;

    public UserVo() {
    }

    public UserVo(int id, String userName, String userPwd, String userSex, String userPhone, String userAddress, String userEmail) {
        super(id, userName, userPwd, userSex, userPhone, userAddress, userEmail);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserPwd() {
        return userPwd;
    }

    @Override
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String getUserSex() {
        return userSex;
    }

    @Override
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String getUserPhone() {
        return userPhone;
    }

    @Override
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String getUserAddress() {
        return userAddress;
    }

    @Override
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "UserVo{}";
    }
}
