package com.company;
/**
 * 定义一个员工每天考勤的类,包括员工姓名,还有签到时间和签退时间
 * Created by ttc on 2017/6/30.
 */
public class KaoqinRecord {
	private String name;
    private String stratTime;
    private String endTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStratTime() {
        return stratTime;
    }

    public void setStratTime(String stratTime) {
        this.stratTime = stratTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
