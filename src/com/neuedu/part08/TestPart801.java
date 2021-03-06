package com.neuedu.part08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理
 * 什么是异常？
 * 程序运行过程中发生的非正常现象（错误）
 * 异常的分支种类：
 * Throwable→ Error 错误→ 栈溢出，堆溢出问题，这种问题不属于异常处理范围内
 *          → Exception→ RuntimeException 运行时异常（也叫非检查性异常）
 *                     → IOException 编译时异常（也叫检查性异常）（在程序运行之前编译过程中需要处理的异常）
 * 
 * 异常会中断程序方法的运行，所以需要处理,处理之后不影响后续程序执行
 * 
 * 异常的处理：
 * 1.使用try/catch 进行处理
 * try{需要异常处理的代码}catch(需要捕获的异常类型){写如果捕获到了对应异常，该走的代码逻辑}
 * 如果代码发生异常，会判断异常属于哪个异常类型，执行对应的代码
 * 注意：try/catch 是一个整体，不能单独写，catch可以写多个
 *     try中含多行代码时，发生多处异常，此时第一个异常发生且被捕获的处理,且不会再回try了
 *     catch中的异常可以有多个，用|相隔，只能一个引用名
 *     如果catch中有Exception异常类型，必须放在最后
 *     try/catch是可以嵌套的
 * finally{}子句   当try/catch进行异常处理时，把一定要执行的代码放在finally子句中进行执行，放在最后
 * 一般用来关闭流
 * 注意：try/finally 可以省略catch
 * 
 * 2.throws关键字   异常向上抛，向调用存在异常的方法的地方抛
 *   在方法头后面   大括号前面   写throws关键字 加异常类型
 * 注意：
 *     抛出多个异常，异常类型之间用逗号（,）相隔
 *     抛出的异常需要调用的地方处理，不处理就再抛出    
 * 
 * 3.throw关键字   创建异常
 * 自己处理完的异常，还要往上抛
 * 注意：
 *     throw子句后代码没机会执行
 *     
 * 不要使用try/catch分支 进行正常的业务场景处理    
 *
 */
public class TestPart801 {

	public static void main(String[] args) {
		
		int i=1;
		String string =null;
		int[] arr= new int[4];
		
		
		try{
			System.out.println(i/0);
			string.equals("111");
			arr[4]=0;
		}catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("发生了正常的异常");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("发生了意料之外的异常");
		}
		

		System.out.println("hello world");
		System.out.println(i);

	}

}



