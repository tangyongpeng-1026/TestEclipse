package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch语句 流程判断
 * 语句结构   switch (表达式){ 表达式结果为预期值
 *                       case 值：
 *                       代码块;
 *                     [ break;]可写可不写  作用是执行到这停止
 *                       case 值：
 *                       代码块;
 *                     [ break;]可写可不写  作用是执行到这停止
 *                     ...
 *                       default：
 *                       代码块;
 *                  }
 * 注意事项： 1.表达式的值必须为byte，short，char，int和String
 *        2.case后面的值必须为常量、定值，  而且不能重复
 *        3.功能代码块部分可以为多行
 *        4.default 相当于 if else中的else
 * 常量：不可变的量，固定值   在定义变量时前面加上final
 * 
 * 
 * 
 * 
 *
 */
public class Test20210107part302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=2;
		switch(i){
		case 1:
			System.out.println(1);
		case 2:
			//走完2的逻辑后停下来
			System.out.println(2);
			break;
		default:
			System.out.println("这是默认值");
		
		}
		//控制台输入一个成绩，输出该成绩的等级，90-100是优，80-89良，70-79中等，60-69及格，60以下不及格
		//用switch写
		//这题的关键在于如何分组，也就是case后面的数
		Scanner scanner = new Scanner (System.in);
		System.out.print("请输入一个成绩：");
		int score = scanner.nextInt();
		switch (score/10){
		    case 10:	
		    case 9:	
		    	System.out.println("优秀");
		    	break;
		    case 8:	
		    	System.out.println("良");
		    	break;
		    case 7:	
		    	System.out.println("中等");
		    	break;
		    case 6:	
		    	System.out.println("及格");
		    	break;	
		    case 5:		
		    case 4:	
		    case 3:
		    case 2:
		    case 1:
		    case 0:	
		    	System.out.println("不及格");
		    	break;
		}
		
		//练习1：给定一个年份，判断是否是闰年（1.能被4整除，但不能被100整除；2.能被400整除）
		    Scanner sc = new Scanner (System.in);
		    System.out.print("请输入一个年份：");
		    int year = sc.nextInt();
		    if(year%4==0 && year%100!=0){
			    System.out.println("是闰年");
		    }
		    else if(year%400==0){
		    	System.out.println("是闰年");
		    }
		    else{
		    	System.out.println("不是闰年");
		    }
		    
		 //练习2 ：输入一个月份，输出与此月份天数相同的月份（用switch写）
		    //1,3,5,7,8,10,12  这是31天
		    //4,6,9,11 这是30天
		    //2 这是28或者29天（判断是否是闰年）
		    System.out.print("请输入月份：");
		    int month = sc.nextInt();
		    switch(month){
		        case 1:
		        case 3:
		        case 5:
		        case 7:
		        case 8:
		        case 10:
		        case 12:
		        	System.out.println("1,3,5,7,8,10,12  这是31天");
		        	break;
		        case 4:
		        case 6:	
		        case 9:	
		        case 11:
		        	System.out.println("4,6,9,11 这是30天");
		        	break;
		        case 2:
		        	 if(year%4==0 && year%100!=0){
		 			    System.out.println("是29天");
		 		    }
		 		    else if(year%400==0){
		 		    	System.out.println("是29天");
		 		    }
		 		    else{
		 		    	System.out.println("是28天");
		 		    }
		        	break;
		    }
		    
		    	
	}

}
