package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		
		//编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
		int factorial=factorial(5);
		System.out.println(factorial);
		
		int factorial2=factorial2(4);
		System.out.println(factorial2);
		
		int number=number(16);
		System.out.println(number);
		
		
		int[] arr = {8,9,12,1,5};
		input(arr);
		for(int item:arr){
		System.out.println(item);
			}

	}
	
	//算阶乘
	public static int factorial(int n){
		int result = 1;
		for(int i=2;i<=n;i++){
			result =result*i;
		}
		return result;
	}
	
	//用递归法算阶乘
	public static int factorial2(int n){
		if(n==2){
			return 2;
		}
		else{
			return n*factorial2(n-1);
		}
	}
	
	//计算斐波那契数列的 第16位
	//1,1,2,3,5,8,13,21......
	public static int number(int n){
		if(n==1){
			return 1;
		}
		else if(n==2){
			return 1;
		}
		else{
			return number(n-1)+number(n-2);
		}
	}
	
	//写一个方法，功能：定义一个一维的int 数组，长度任意,
	//然后将它们按从小到大的顺序输出（使用冒泡排序）。
	

	public static void input(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int k=0;k<arr.length-i-1;k++){
			int temp;
			if(arr[k+1]<arr[k]){
				temp=arr[k+1];
				arr[k+1]=arr[k];
				arr[k]=temp;
			}
		}
	}
  }
	

}
