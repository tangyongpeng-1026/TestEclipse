package com.neuedu.part05;



/**
 * 方法的定义和调用
 *  方法是定义好的，具有独立功能，可重复调用的，为了简化代码存在，在面向对象程序设计中，方法一般用来描述对象的动作行为。
 * 方法的组成
 *  方法头   方法体
 *  [访问权限控制符] [修饰符] 返回值类型   方法名(参数类型   参数名,参数类型   参数名,...) 
 *  {方法体}
 *  
 *  访问权限控制符  可以写public（范围最大）
 *  修饰符   可以写static
 *  返回值类型    如果没有返回值 写void
 *          如果有，写返回值类型
 * 
 *  参数可以是基本数据类型，也可以是引用数据类型
 *   当方法调用传递参数为基本数据类型时，是传值拷贝过程
 *   当方法调用传递参数为引用数据类型时，传的是引用 （String特殊，字符串本身是不可变的）
 *  
 * 参数的类型
 *  方法头中定义带数据类型 形式参数 简称形参
 *  调用时 实际传的值，这种参数叫做实际参数 简称实参
 *  
 *  ※方法的重载
 *   在同一个类中，允许同时存在多个相同方法的情况，叫做方法的重载
 *   方法重载的规则：
 *    1.方法名相同
 *    2.方法的参数不同（参数的个数不同 或者 参数的类型不同）
 *    3.方法的返回值无所谓（可以相同，也可以不相同）
 *    
 *    
 * 递归   
 *  方法自己调自己 
 * 
 */
public class Testpart501 {

	public static void main(String[] args) {
		
		//打印一个5行6列的星号
		outPrint(5, 6);//实参
		//打印一个7行8列的星号
		outPrint(7, 8);
		//求两个数的最大值
		//重载会根据参数的不同，动态选择对应的方法进行
		int result=compare(5, 3);
		System.out.println(result);
		
		String str = "asdasdasdasasd";//是一个特殊的引用数据类型
		System.out.println(str);
		
		

	}
	
	//没有返回值的写法   void
	//在静态方法中，调用的方法也必须是静态的
	//扩展：synchronized 控制线程同步（锁）
	public static void outPrint(int row,int col){//形参
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	//求两个数的最大值
	public static int compare(int num1,int num2){
		return num1>num2?num1:num2;
	}
	
	

}
