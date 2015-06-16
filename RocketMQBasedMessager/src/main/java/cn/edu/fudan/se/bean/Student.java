package cn.edu.fudan.se.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Jimmy on 15/6/16.
 */
public class Student implements Serializable {
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    private String studentId;
    private String name;
    private int gender;
    private String schoolName;

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
