package com.neuedu.part02;

public class Test20210107work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		
		int a=1,b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);//可以给定一个中间变量
		
		//2. 给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		
		int i=879,i1=i%10+i/10%10+i/100%10+i/1000%10;
		System.out.println(i1);
		
		
		//3.华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
		//x1为华氏度，x2为摄氏度,x3为转换后的华氏度，x4为转换后的摄氏度
		float x1=15F;
		float x2=50F;
		float x3=x2*9/5+32;
		float x4=(x1-32)*5/9;
		System.out.println("转变后的华氏度"+x3);
		System.out.println("转变后的摄氏度"+x4);
		
		//4.给定一个任意的大写字母A~Z，转换为小写字母。
		char c='\u0041';
		char c1=(char) (c+32);
		System.out.println(c1);
		   //或者
		char n='A';
		int m=n;
		System.out.println((char)(m+32));
		
		
	}

}
