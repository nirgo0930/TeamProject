package com.example.stopwaiting.dto;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private Long studentCode;
    private String tel;
    private String token;

    public UserInfo() {
    }

    public UserInfo(String name, Long studentCode, String tel) {
        this.name = name;
        this.studentCode = studentCode;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Long studentCode) {
        this.studentCode = studentCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
