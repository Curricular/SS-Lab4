package cn.edu.fudan.se.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Jimmy on 15/6/16.
 */
public class Time implements Serializable {
    private int weekday;
    private int period;

    public Time() {
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
