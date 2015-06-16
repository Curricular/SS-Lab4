package cn.edu.fudan.se.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Jimmy on 15/6/16.
 */
public class Schedule implements Serializable {
    private String studentId;
    private String courseId;

    public Schedule() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
