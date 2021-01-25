package com.neuedu.part07;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		//定义一个数组
		Student[] students =new  Student[5] ;
		Random random =new Random();
		for(int i=0;i<students.length;i++){
			//根据随机数，动态获取学生对象
			students[i]= getStudentAllInfo(random.nextInt(3));
		}
		
		for(Student item:students){
			System.out.println("学号为"+item.getStuNo()+"  姓名为"+item.getName()+"  性别为"+item.getSex()+"  年龄为"+item.getAge()+"  综合成绩为"+item.allScore());
		}

	}
	
	public static   Student getStudentAllInfo(int type){
		if(type==0){
			return new English(100, 80, 70, 1001, "张三", '男', 18);
		}
		else if(type==1){
			return new Computer(80, 70, 100, 90, 1002, "小红",'女', 19);
		}
		else {
			return new Chinese(60, 70, 30, 50, 1003, "李四", '男', 20);
		}
		
	}
	
	
}
