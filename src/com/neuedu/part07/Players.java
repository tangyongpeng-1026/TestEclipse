package com.neuedu.part07;

public class Players {

	private static String name;
	private static int age;
	private static String sex;
	private static int count =0;//����һ������count���0�ӵ�11
	private static int num =11;//��ഴ��11������
	
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
	
	private Players(){//�޲εĹ��췽��
		count++;
	}
	
	private Players(String name,int age,String sex){//�вεĹ��췽��
		this.name=name;
		this.age=age;
		this.sex=sex;
		count++;
	}
	
	public static Players createNewPlayer(){//����һ������ķ���
		if(count<num){
			return new Players();
		}
		else{
			return null;
		}

	}
	
	
	
}
