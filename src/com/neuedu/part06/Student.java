package com.neuedu.part06;
/**
 * 
 * 同学类
 *
 */
public class Student {
	
	//先写属性
	String name;
	int age;
	double grade;

	//后写方法
	/**
	 * 获取学生名字
	 * @return
	 */
	public String studentName(){
		return name;
	}
	
	/**
	 * 获取学生年龄
	 * @return
	 */
	public int studentAge(){
		return age;
	}
	
	/**
	 * 获取学生成绩
	 * @return
	 */
	public double studentGrade(){
		return grade;
	}
  
}
