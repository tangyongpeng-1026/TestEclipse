package com.neuedu.part03;

import java.util.Scanner;

/**
 * 流程控制语句
 * 1.条件语句：在程序运行过程中，根据条件是否成立选择执行代码的过程。
 * if语句   if（表达式）{执行语句块;}  其中表达式结果只能为true或者false，如果表达式为真进入语句块执行。
 * if语句的二选一模式   if（）{} else{} if语句可以不写大括号，前提是只有一行代码需要执行
 * if语句的多选一模式   if（）{} else if(){} else if(){} else{}
 * 
 * 
 *
 */
public class Test20210107part301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //从控制台输入一个数，判断这个数是奇数还是偶数 
		Scanner sc = new Scanner (System.in);
		System.out.print("请输入一个数：");
		int number = sc.nextInt();
		if(number%2==0){
			System.out.println(number+"是偶数");
		}
		else{
			System.out.println(number+"是奇数");
		}
		
		//控制台输入一个成绩，输出该成绩的等级，90-100是优，80-89良，70-79中等，60-69及格，60以下不及格
		Scanner scanner = new Scanner (System.in);
		System.out.print("请输入一个成绩：");
		int score = scanner.nextInt();
		//判断输入的数是否合法
		if(score<0 || score>100){
			System.out.println("输入错误，请重新输入（剩余次数0）");
			score = scanner.nextInt();
			if(score<0 || score>100){
				System.out.println("频繁错误，输入结束");
				//return 结束当前方法运行
				return;
			}
		}
		
		if(score>=90){
			System.out.println("优秀");
		}
		else if(score>=80 && score<90){
			System.out.println("良");
		}
		else if(score>=70 && score<80){
			System.out.println("中等");
        }
		else if(score>=60 && score<70){
			System.out.println("及格");
        }
		else {
			System.out.println("不及格");
        }
		
	}
}
		
