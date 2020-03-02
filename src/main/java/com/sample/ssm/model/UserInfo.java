package com.sample.ssm.model;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2020/3/2
 */
public class UserInfo {
    private Integer userId;
    private String userName;
    private String userpassword;


    public Integer getUserId() {
        System.out.println(userId);
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return userpassword;
    }

    public void setPassword(String password) {
        this.userpassword = password;
    }
    @Override
    public String toString() {
        return "UserInfo{\n" +
                "userId=" + userId +
                ", \nuserName='" + userName + '\'' +",password='\n"+userpassword+
                '}';
    }


}
