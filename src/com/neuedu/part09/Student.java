package com.neuedu.part09;

public class Student {

	private String stuName;
	private int age;
	private String stuNO;
	private int score;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuNO() {
		return stuNO;
	}
	public void setStuNO(String stuNO) {
		this.stuNO = stuNO;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void study(){
		System.out.println(this.stuName+"ÕýÔÚÑ§Ï°");
	}
	
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", age=" + age + ", stuNO=" + stuNO + ", score=" + score + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
			Student s = (Student)obj;
			if(this.getStuName().equals(s.getStuName()) && this.getAge()==s.getAge()){
				return true;
			}
		return false;
	}
	

	
}
