package com.neuedu.part02;

import java.util.Scanner;

/**
 * java运算符
 * 算数运算符：
 *            +，-，*，/（只取整数部分），%取余（被除数为正就为正）
 *            ++自增，--自减    ++变量   先加后用       --变量   先减后用
 *                        变量++ 先用后加       变量-- 先用后减
 *            +字符串连接：当操作中有一个是String类型，系统会自动将另一个操作
 *                     数转换成字符串类型，然后进行连接            
 * 赋值运算符：+=， -=
 * 关系运算符：>， >=， <， <=， ==（是否等于），!=（不等于）
 *         关系运算结果是布尔型（ture或者false）
 * 逻辑运算符：针对两个布尔型的数进行的布尔运算
 *         && 逻辑与   同真则真，有假则假 
 *         || 逻辑或   有真则真，同假则假
 *         ！     逻辑非   结果取反
 *         以上属于短路运算 （&&判断第一个表达式的值如果为false，则第二个不执行）
 *                    （||判断第一个如果为true，则第二个不执行）
 *         &，|属于非短路（运行慢）           
 * 三目条件运算符（三元表达式）：
 * 如果表达式1为真  则输出表达式2 否则输出表达式3
 * 表达式1？表达式2：表达式3
 *                
 */

public class Test20210107part202 {

	public static void main(String[] args) {
		
        //算数运算符
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(-5%2);
		
		//自增
		int i=0;
		System.out.println(i++ + ++i); //括号里看成0+2
		                               //表达式在运算过程中也会受影响
		                               //拓展题：i++ 是否是线程安全的？
		System.out.println("唐永鹏"+i+ ++i); //（此处+是连接符的意思）
		System.out.println("唐永鹏"+(i+ ++i)); //（可以加括号）
		
		System.out.println(5.0/2);
		
		//赋值运算符
		int x1=3;
		int x2=4;
	    x1= x1+3;
	    x1 +=3;
	    System.out.println(x1);
	    
	    //关系运算符
	    System.out.println(x1>x2);//大于
	    System.out.println(x1==x2);//是否等于
	    System.out.println(x1!=x2);//不等于
	    
	    //逻辑运算符
	    boolean flag = true,flag1 = false;
	    System.out.println(flag&&flag1);//false
	    System.out.println(flag||flag1);//true
	    System.out.println(flag^flag1);//true
	    
	    //三目表达式
	    System.out.println(1>2?3-1:4+1);
	    
	    //控制台输入输出
	    Scanner sc = new Scanner (System.in);
		System.out.print("请输入内容：");
		String nextLine = sc.nextLine();
		System.out.println("由控制台输入的数为："+nextLine);
	}
	
}
