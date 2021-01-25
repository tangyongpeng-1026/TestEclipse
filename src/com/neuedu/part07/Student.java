package com.neuedu.part07;

public class Student {

	private int qizhongkaoshi;
	private int qimokaoshi;
	private int stuNo;
	private String name;
	private char sex;
	private int age;
	
	public Student(int qizhongkaoshi,int qimokaoshi,int stuNo,String name,char sex,int age){
		this.qizhongkaoshi = qizhongkaoshi;
	    this.qimokaoshi = qimokaoshi;
	    this.stuNo=stuNo;
	    this.name=name;
	    this.sex=sex;
	    this.age=age;
	}

	public int getQizhongkaoshi() {
		return qizhongkaoshi;
	}

	public void setQizhongkaoshi(int qizhongkaoshi) {
		this.qizhongkaoshi = qizhongkaoshi;
	}

	public int getQimokaoshi() {
		return qimokaoshi;
	}

	public void setQimokaoshi(int qimokaoshi) {
		this.qimokaoshi = qimokaoshi;
	}
	
	

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex =  sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double allScore(){
		return this.qizhongkaoshi*0.5+this.qimokaoshi*0.5;
	}
	
	
	
	
}

class English extends Student{
	
	private int speech;//ÑÝ½²

	public English(int speech,int qizhongkaoshi,int qimokaoshi,int stuNo,String name,char sex,int age){
		super(qizhongkaoshi, qimokaoshi,stuNo,name,sex,age);
		this.speech=speech;
	}
	
	@Override
	public double allScore(){
		return speech*0.5+getQizhongkaoshi()*0.25+getQimokaoshi()*0.25;
	}
}

class Computer extends Student{

	private int enWrite;
	private int operation;
    
	public Computer(int enWrite,int operation,int qizhongkaoshi,int qimokaoshi,int stuNo,String name,char sex,int age){
		super(qizhongkaoshi, qimokaoshi,stuNo,name,sex,age);
		this.enWrite=enWrite;
		this.operation=operation;
	}

	@Override
	public double allScore() {
		return operation*0.4+enWrite*0.2+getQizhongkaoshi()*0.2+getQimokaoshi()*0.2;		
	}
	
}

class Chinese extends Student{

	private int speech;
	private int works;
    
	public Chinese(int speech,int works,int qizhongkaoshi,int qimokaoshi,int stuNo,String name,char sex,int age){
		super(qizhongkaoshi, qimokaoshi,stuNo,name,sex,age);
		this.speech=speech;
		this.works=works;
	}

	@Override
	public double allScore() {
		return speech*0.35+works*0.35+getQizhongkaoshi()*0.15+getQimokaoshi()*0.15;		
	}
	
}


