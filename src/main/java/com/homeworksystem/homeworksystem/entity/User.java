package com.homeworksystem.homeworksystem.entity;

public class User {
    private String name;

	private String account;

	private String password;

    private String department;

    private String class_num;

	private String icon;

	private String intro;

    public User(){

    }

    public User(String name, String account, String password, String department, String class_num, String icon, String intro) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.department = department;
        this.class_num = class_num;
        this.icon = icon;
        this.intro = intro;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntro() {
        return intro;
    }

}
