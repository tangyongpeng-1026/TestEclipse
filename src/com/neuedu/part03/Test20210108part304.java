package com.neuedu.part03;

import java.util.Scanner;

public class Test20210108part304 {

	public static void main(String[] args) {
		//练习1：输入两个数，输出他们的最大公约数 
		
		/*
		Scanner scanner= new Scanner(System.in);
		System.out.println("输入第一个数");
		int first = scanner.nextInt();
		System.out.println("输入第二个数");
		int second = scanner.nextInt();
		int result = 0;
		int min = first>second?second:first;
		for(int i=1; i<=min; i++){
			if(first%i==0 && second%i==0 ){
				result = i;
			}
		}
        System.out.println(result);
        */
        
		
		//练习2：输出所有1000以内水仙花数
        //指一个特殊的三位数，它的各位数字的立方和与其自身相等
        for(int i=1; i<1000; i++){
			if((i/100%10)*(i/100%10)*(i/100%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10) == i ){
				System.out.println(i);
			}
		}
        //练习3：看懂百元百鸡问题
        //母鸡数量为a，公鸡数量为b，小鸡数量为c
        for(int a=1;a<=33;a++){
        	for(int b=1;b<=25;b++){
        		int c =100-a-b;
        		if(a*3+b*4+c*0.5==100){
        			System.out.println("母鸡数量为："+a);
        			System.out.println("公鸡数量为："+b);
        			System.out.println("小鸡数量为："+c);
        		}
        	}
        }
        
       
      
		/* 练习4：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
		 *      第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		 *      以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		 */
        //从第9天往前反推
        int sum=1;
        for(int i=9; i>=1;i--){
        	sum=(sum+1)*2;
        }
        System.out.println(sum);
        
        //练习5：企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
        //20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，
        //高于100万元时，超过100万元的部分按1%提成，在程序中设定一个变量为当月利润，求应发放奖金总数？
        Scanner scanner= new Scanner(System.in);
		System.out.println("请输入您的利润");
		double profit = scanner.nextInt();
		double bonus;
		if (profit<=100000){
			bonus = profit*0.1;
		}
		else if(profit>100000 && profit<=200000){
			bonus =100000*0.1+(profit-100000)*0.075;
		}
		else if(profit>200000 && profit<=400000){
			bonus =100000*0.1+100000*0.075+(profit-200000)*0.05;
		}
		else if(profit>400000 && profit<=600000){
			bonus =100000*0.1+100000*0.075+200000*0.05+(profit-400000)*0.03;
		}
		else if(profit>600000 && profit<=1000000){
			bonus =100000*0.1+100000*0.075+200000*0.05+200000*0.03+(profit-600000)*0.015;
		}
		else{
			bonus =100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(profit-1000000)*0.01;
		}
		 System.out.println(bonus);
  
        //练习6：由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数为4321。
        
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个四位整数");
		int num = sc.nextInt();
		if(num>999 && num<10000){
		 int result;
		 int a=num/1000%10;
		 int b=num/100%10;
		 int c=num/10%10;
		 int d=num%10;
		 result=1000*d+100*c+10*b+a;
		 System.out.println(result);
		}
		else{
			System.out.println("输入的数字有错误");
		}
		

	}

}
