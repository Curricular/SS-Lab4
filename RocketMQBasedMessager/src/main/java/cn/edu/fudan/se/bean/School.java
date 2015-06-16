package cn.edu.fudan.se.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Jimmy on 15/6/16.
 */
public class School implements Serializable {
    private String schoolName;
    private String creditRequirement;

    public School() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCreditRequirement() {
        return creditRequirement;
    }

    public void setCreditRequirement(String creditRequirement) {
        this.creditRequirement = creditRequirement;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
