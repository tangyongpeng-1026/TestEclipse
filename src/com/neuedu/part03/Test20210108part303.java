package com.neuedu.part03;
/**
 * 循环
 * 1.while(表达式){代码块} 
 *   如果表达式结果为真  就执行代码块，不满足条件时循环停止。
 * 2.do...while   do{代码块}while(表达式)
 *   do...while 循环会默认先执行一次代码块，然后计算表达式，如果表达式结果为真  就再次执行代码块，不满足条件时循环停止。
 *   do...while使用场景很少
 * 3.for(表达式1;表达式2;表达式3){代码块}
 *    表达式1：初始化变量，只执行一次
 *    表达式2：循环判断条件结果为布尔型
 *    表达式3：变量变化
 *    （表达式可以不写，分号必须写）
 * 循环是可以嵌套的
 * 4.循环的中断
 *    break 关键字可以中断，  中断当前循环
 * 5.continue语句
 * 
 * 
 * 手动整理代码格式ctrl+shift+f
 *
 * debug模式 先加断点，F6执行代码，F8结束当前断点
 */
public class Test20210108part303 {
         public static void main(String[] args) {
		
		//死循环：永远不会停止的循环
		int a=1;
		int b=2;
		while(a<b){
			System.out.println("执行了循环");
			a++;
		}
        
		//输出1到100的和
		int i=1;
		int sum=0;
		while(i<=100){
			//考虑什么停止循环
			sum +=i; //sum=sum+i
			i++;
		}
		 System.out.println(sum);
		
		 
		//先将sum和i初始化
		sum=0;
		i=1;
		do{
			sum +=i; //sum=sum+i
			i++;
		}
		while(i<=100);
		System.out.println(sum); 
		 
		//练习：输出1-1000的奇数和
		int j=1;
		int sums=0;
		while(j<=1000){
			//判断奇数
			if(j%2 != 0){
				sums +=j;
			}
			j++;	
		}
		 System.out.println(sums);
		 
         sums=0;
		 for(int k=1;k<=1000;k++){
			 //表达式可以省略
			 if(k%2 != 0){
					sums +=k;
		    }		 
		}
		 System.out.println("1-1000的奇数和为"+sums);
		 
		 //输出5行7列的*号
		 for(int o=1;o<=5;o++){
			 System.out.println("*******");
		 }
		 
		 //循环的中断
		 //判断一个数是否为质数
		 int num = 103;
		 for(int g=2;g<num;g++){
			 if(num%g == 0){
				 System.out.println("不是质数");
				 break;
			 }
		 }
		         System.out.println("是质数");
		         
		 //一百万 3年 每年的4%的利率 （复利）三年之后的本息一共多少？
		 double money = 1000000;
		 for(int year=1;year<=3;year++){
			 money *=(1+0.04);//money=money*(1+0.04)
		 }
		         System.out.println(money);
		 
		 //输出5行7列的*号
	     for(int h=1;h<=5;h++){
		         for(int f=1;f<=7;f++){
			     System.out.print("*");
		         }
		         System.out.print('\n');
	     } 
	     
	     //输出1+1/2+1/3....1/100的和
         double result=0;
	     for(double x=1;x<=100;x++){
	    	 result += (1/x);
	     }
	             System.out.println(result); 
	     
	     //输出99乘法表
	     for(int hang=1;hang<=9;hang++){
	    	 for(int lie=1;lie<=hang;lie++){
	    		 System.out.print(hang+"*"+lie+"="+(hang*lie)+'\t');
	    	 }
	    	 System.out.println(); 
	     }
	     
	     //1+2+3+4+....判断累加多少次能超过666
	     sum=0;
	     int count=0;//次数
	     i=1;//数值
	     while(true){
	    	 count++;
	    	 sum+=i;
	    	 if(sum>666){
	    		 break;
	    	 }
	    	 i++;
	     }
	     System.out.println(count+" "+sum); 
	     
	     //编写一个程序，找出大于200的最小质数
	     //标记法
	     i = 200;
	     while(true){
	    	 count=0;//标记（标记变化i就不是质数，标记不变还等于0，那么i就是质数）
	    	 i++;
	    	 for(int g=2;g<i;g++){
				 if(i%g == 0){
					 count++;
					 break;
				 }
			 }
	    	 if(count==0){
	    		 System.out.println(i+"是质数");
		    	 break;
	    	 }
	     }
	     // 
	     i = 200;
	     boolean flag=true;
	     while(true){
	    	 flag=true;//标记初始化
	    	 i++;
	    	 for(int g=2;g<i;g++){
				 if(i%g == 0){
					 flag=false;
					 break;
				 }
			 }
	    	 if(flag){
	    		 System.out.println(i+"是质数");
		    	 break;
	    	 }
	     }
	     
	     //continue跳出本次循环
	     for (int g = 1 ; g < 20 ; g++){
	    	 if((g%2) == 0){
	    		 continue;
	    	 }
	    	 System.out.print(g+" ");
	     }
	     
	     //指定循环位置跳出 ：在目标位置创建名称（label）标识符加冒号，在跳出关键字后面加标识符名称
	     inner:for (int g = 1 ; g < 20 ; g++){
	    	 if((g%2) == 0){
	    		 continue inner;
	    	 }
	    	 System.out.println(g+" ");
	     }
	     
	     //continue lable是指定循环开始
	     //break lable是指定循环终止
	     
	     //扩展：常用设计模式中的策略模式，解决else if过多问题
	     
	             
  }
}
	