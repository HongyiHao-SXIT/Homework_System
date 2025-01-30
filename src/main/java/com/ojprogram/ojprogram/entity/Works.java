package com.ojprogram.ojprogram.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;

public class Works {
    @TableId(type = IdType.AUTO)

    private int id;

    private String theme;

    private String descriptions;

    private String submit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getSubmit() {
        return submit;
    }

}
