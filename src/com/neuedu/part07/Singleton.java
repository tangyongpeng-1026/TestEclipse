package com.neuedu.part07;

public class Singleton {

	//构造方法私有化
	private Singleton(){
		
	}
	
	private static Singleton instance=null;
	
	
	public static Singleton getSingleton(){
		if(instance == null){//懒汉式
			instance =new Singleton();
		}
		return instance;
	}
	
}

//单例模式
class Danli{
	
	//构造方法私有化
	private Danli(){
		
	}
	
	//定义一个自己的实例
	
	private static Danli instance1= new Danli();//饿汉式
	
	//提供了一个供外部访问本class的静态方法
	
	public static Danli getDanli(){
		return instance1;
	}
	
	
}