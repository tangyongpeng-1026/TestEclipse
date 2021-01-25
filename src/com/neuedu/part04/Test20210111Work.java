package com.neuedu.part04;

public class Test20210111Work {


	public static void main(String[] args) {
		
/*1.  创建二维数组a[3][4]后，a[0].length的值应该等于       (D)

        A.0

        B.2

        C.3

        D.4

2.    下列对长度为 4 的数组 a 的定义中，正确的是         (C)

        A.int[4] a=new int[];

        B.int a[]=new int[5];

        C.int a[]={2,4,2,1};

        D.int[4] a=new int[4];

3.    创建二维数组a[3][4]后，a.length的值应该等于   (C)

        A.0

        B.2

        C.3

        D.4


4.   下列关于数组的使用，不正确的是   (C)

        A.数组长度定义后不可以修改;

        B.数组中只能存放同类型数据;

        C.数组下标范围从0开始最大到数组长度; (到数组长度-1)

        D.数组中可以存放普通数据也可以存对象;
        
        */
		
/*		//写出程序的运行结果。
		public class ClassX {
		  public static void main(String[] args) {
		         int a[]={45,18,98,56,304};
		         for(int i=a.length-1;i>=0;i--)
		               System.out.println(a[i]);
		 }
	 }
		 304,56,98,18,45
		//写出程序的运行结果。

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
		
		//练习1：给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。
		int[] arr = {1,6,2,3,9,4,5,7,8};
		for(int i=0;i<arr.length-1;i++){
			for(int k=0;k<arr.length-i-1;k++){
				if(arr[k+1]<arr[k]){// <就是升序   >就是降序
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
		//练习2：在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
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
		System.out.println("最大值是"+max+" 它的下标是"+num);
		
		
		//练习3：将一个数组中的元素逆序存放。
		int a[]={45,18,98,56,304};
        for(int i=a.length-1;i>=0;i--)
              System.out.print(a[i]+" ");
		
	}
	
	

}
