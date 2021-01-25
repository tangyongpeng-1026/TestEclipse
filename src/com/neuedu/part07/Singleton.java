package com.neuedu.part07;

public class Singleton {

	//���췽��˽�л�
	private Singleton(){
		
	}
	
	private static Singleton instance=null;
	
	
	public static Singleton getSingleton(){
		if(instance == null){//����ʽ
			instance =new Singleton();
		}
		return instance;
	}
	
}

//����ģʽ
class Danli{
	
	//���췽��˽�л�
	private Danli(){
		
	}
	
	//����һ���Լ���ʵ��
	
	private static Danli instance1= new Danli();//����ʽ
	
	//�ṩ��һ�����ⲿ���ʱ�class�ľ�̬����
	
	public static Danli getDanli(){
		return instance1;
	}
	
	
}