package com.homeworksystem.homeworksystem.entity;

public class HomeWork {

    private String workId;

    private String title;

    private String manager;

    private int grade;

    public HomeWork() {
    }

    public HomeWork(String workId, String title, String manager) {
        this.workId = workId;
        this.title = title;
        this.manager = manager;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeWork homeWork = (HomeWork) o;
        return workId.equals(homeWork.workId) &&
                title.equals(homeWork.title) &&
                manager.equals(homeWork.manager);
    }

    @Override
    public int hashCode() {
        int result = workId.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + manager.hashCode();
        return result;
    }
}    
