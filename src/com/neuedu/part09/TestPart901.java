package com.neuedu.part09;

/**
 *1. java 常用API
 *   java.awt  java绘制图形工具
 *   java.io   java跟磁盘文件操作
 *   java.lang java基础类
 *   java.math 
 *   java.net  网络通信，基于TCP/IP协议
 *   面试：1.了解http/https的区别？
 *       2.TCP/IP协议特点
 *   java.sql  java与关系型数据库交互的工具类
 *   java.util java常用工具类，包括集合、日期
 * 
 *2. Object 所有类的父类
 *   输出一个对象时，默认会调用它的toString方法
 *   常用的3个   toString() , .equals() , hashCode()
 * 
 *3. 包装类
 *   为了让基本数据类型，也能具备面向对象的特性，提供了包装类的概念 
 *   类继承Comparable 接口，实现里面的compareTo方法 可以作为对象比较工具，返回值是int
 *   基本类型 和包装类的转换
 *   对应的关系下，  基本数据类型转换成包装类，通过new对象
 *             包装类转换成基本数据类型，通过引用.XXXValue();
 *   其中还含有自动装箱和自动拆箱的概念
 *   
 *   字符串和包装类的转换： 包装类转换成字符串，调用对应的toString()
 *                  字符串转换成包装类，两种：  1.都可以调用包装类的构造器转换
 *                                    2.可以通过包装类.valueOf(需要转换的字符串)
 *   字符串和基本数据类型转换：  字符串转换成基本数据类型：通过对应的包装类调用各自的parseXXX（参数是对应字符串）方法，如果字符串不符合转换条件会报（NumberFormatException）异常             
 *                     基本数据类型转换成字符串：
 *                     
 *                 
 *
 */
public class TestPart901 {

	public static void main(String[] args) {
		// 创建一个学生类对象
		Student student = new Student();
		student.setStuName("张三");
		student.setAge(20);
		student.setStuNO("1001");
		student.setScore(95);
		
		Student student2 = new Student();
		student2.setStuName("张三");
		student2.setAge(20);
		student2.setStuNO("1002");
		student2.setScore(80);
		
		boolean b =student.equals(student2);
		System.out.println(b);
		
		String string =new String("123123");
		System.out.println(string);
		
		Integer integer = new Integer(10);
		

	}

}
