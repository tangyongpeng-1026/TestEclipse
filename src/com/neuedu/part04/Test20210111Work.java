package com.neuedu.part04;

public class Test20210111Work {


	public static void main(String[] args) {
		
/*1.  ������ά����a[3][4]��a[0].length��ֵӦ�õ���       (D)

        A.0

        B.2

        C.3

        D.4

2.    ���жԳ���Ϊ 4 ������ a �Ķ����У���ȷ����         (C)

        A.int[4] a=new int[];

        B.int a[]=new int[5];

        C.int a[]={2,4,2,1};

        D.int[4] a=new int[4];

3.    ������ά����a[3][4]��a.length��ֵӦ�õ���   (C)

        A.0

        B.2

        C.3

        D.4


4.   ���й��������ʹ�ã�����ȷ����   (C)

        A.���鳤�ȶ���󲻿����޸�;

        B.������ֻ�ܴ��ͬ��������;

        C.�����±귶Χ��0��ʼ������鳤��; (�����鳤��-1)

        D.�����п��Դ����ͨ����Ҳ���Դ����;
        
        */
		
/*		//д����������н����
		public class ClassX {
		  public static void main(String[] args) {
		         int a[]={45,18,98,56,304};
		         for(int i=a.length-1;i>=0;i--)
		               System.out.println(a[i]);
		 }
	 }
		 304,56,98,18,45
		//д����������н����

		public class ABC {
		   public static void main(String[] args) {
		          int i,j;
		          int a[]={9,27,10,1,49};
		          for(i=0;i<a.length-1;i++){
		                 int k=i;
		                 for(j=i;j<a.length;j++)
		                        if(a[j]>a[k]) k=j;
		                 int temp=a[i];
		                 a[i]=a[k];
		                 a[k]=temp;            
		          }
		         for(i=0;i<a.length;i++)
		                System.out.println(a[i]+"");
		          System.out.println();
		   }
		}
		49,27,10,9,1
		*/
		
		//��ϰ1������һ����9��������1,6,2,3,9,4,5,7,8�������飬������Ȼ����������������ֵ��
		int[] arr = {1,6,2,3,9,4,5,7,8};
		for(int i=0;i<arr.length-1;i++){
			for(int k=0;k<arr.length-i-1;k++){
				if(arr[k+1]<arr[k]){// <��������   >���ǽ���
					int temp;
					temp=arr[k+1];
					arr[k+1]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//��ϰ2����һ����8��������18��25��7��36��13��2��89��63�����������ҳ����������������±ꡣ
		int[] arr2 ={18,25,7,36,13,2,89,63};
		int max =arr2[0];
		int min =arr2[0];
		int num =arr2[0];
		for(int i=1;i<arr2.length;i++){
			if(arr2[i]>max){
				max = arr2[i];
				num=i;
			}
		}
		System.out.println("���ֵ��"+max+" �����±���"+num);
		
		
		//��ϰ3����һ�������е�Ԫ�������š�
		int a[]={45,18,98,56,304};
        for(int i=a.length-1;i>=0;i--)
              System.out.print(a[i]+" ");
		
	}
	
	

}
