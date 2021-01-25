package com.neuedu.part07;

/**
 * 编写一个方法，输出大于某个正整数n的最小质数
 */

public class HomeWork2 {

	public static void main(String[] args) {
		//首先有一个正整数n，然后n++，然后判断得到的新数是否是质数
		printZuiXiaoZhiShu(20);
		printZuiXiaoZhiShu(50);
		printZuiXiaoZhiShu(100);
		printZuiXiaoZhiShu(200);
		printZuiXiaoZhiShu(1000);
	}
	
	//这个方法是打印最小质数的
	public static void printZuiXiaoZhiShu(int n){
		while (true){
			n++;
			boolean flag =isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}
	
	//定义一个专门的方法判断某个数字是否是质数
	//这个方法的形参是：被判断的数字num
	//这个方法的返回值类型是true表示是质数，false表示不是质数
	public static boolean isZhiShu(int num){
		for(int i=2;i<num;i++){
			if(num%i == 0){//质数只能被1和自身整除
				return false;
			}
		}
		return true;
	}

	
	
}
