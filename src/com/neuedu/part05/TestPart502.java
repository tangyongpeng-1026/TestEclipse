package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		
		//��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5��
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
	
	//��׳�
	public static int factorial(int n){
		int result = 1;
		for(int i=2;i<=n;i++){
			result =result*i;
		}
		return result;
	}
	
	//�õݹ鷨��׳�
	public static int factorial2(int n){
		if(n==2){
			return 2;
		}
		else{
			return n*factorial2(n-1);
		}
	}
	
	//����쳲��������е� ��16λ
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
	
	//дһ�����������ܣ�����һ��һά��int ���飬��������,
	//Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�
	

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
