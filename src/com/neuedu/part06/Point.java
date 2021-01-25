package com.neuedu.part06;

/**
 * 定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造方法Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。
 * 点类
 * 
 *
 */


public class Point {
	
	//先写属性
	int x;
	int y;
	
	//再写构造方法
	
	/**
	 * 构造方法
	 * 无参的
	 */
    Point(){
		
	}
    
    /**
	 * 构造方法
	 * 有参的
	 */
	Point(int x0,int y0){
		this.x=x0;
		this.y=y0;
	}
	
	//后写行为
	public void movePoint(int dx,int dy){
		x= x+dx;
		y= y+dy;
		System.out.println("移动后的坐标为"+x+","+y);
	}
	

}
