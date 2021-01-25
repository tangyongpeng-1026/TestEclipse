package com.neuedu.part07;

public class Players {

	private static String name;
	private static int age;
	private static String sex;
	private static int count =0;//创建一个对象，count会从0加到11
	private static int num =11;//最多创建11个对象
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Players.count = count;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Players.num = num;
	}
	
	private Players(){//无参的构造方法
		count++;
	}
	
	private Players(String name,int age,String sex){//有参的构造方法
		this.name=name;
		this.age=age;
		this.sex=sex;
		count++;
	}
	
	public static Players createNewPlayer(){//创建一个父类的方法
		if(count<num){
			return new Players();
		}
		else{
			return null;
		}

	}
	
	
	
}
