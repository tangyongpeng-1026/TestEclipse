package com.company;
/**
 * ����һ��Ա����,���԰���Ա����id,Ա������,����,�Ա�
 * Created by ttc on 2017/6/30.
 */
public class Emp {
	 private int id;
	    private String name;
	    private int age;
	    private char sex;
	    public  Emp(){

	    }

	    public Emp(int id, String name, int age, char sex) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.sex = sex;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public char getSex() {
	        return sex;
	    }

	    public void setSex(char sex) {
	        this.sex = sex;
	    }
}
