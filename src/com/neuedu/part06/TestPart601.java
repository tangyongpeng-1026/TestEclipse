package com.neuedu.part06;

/**
 * 面向对象基础
 * 类是一个模板，把相似的一类特定种类的对象归成一个类，可以通过类定义这一类对象的属性和行为
 * 
 * 类的结构
 * [public][abstract|final]class 类名[extends父类][implements接口列表]
 *  {  
 *       属性声明及初始化；
 *       方法声明及方法体；
 *  }
 * 
 * 写类的创建过程
 * 先写属性：定义之后属性名变蓝色，类中的方法里都可以使用（属性有默认值）(String类型是null，int类型是0)
 * 属性是全局可用，全局变量，不需要初始化就可以使用
 * 方法中的变量，只在对应作用域内可用，是局部变量，想使用必须初始化
 * 
 * 对象：类的实际存在的个体（实例）
 * 实例化
 * 
 * 垃圾回收机制
 * 程序运行过程中，由一个低优先级的线程（gc）进行处理，人为控制不了，但是可以做提醒操作
 * 一旦运行了该线程，会寻找没有引用的对象，调用该对象的finalize()方法，执行垃圾回收机制进行回收
 * 
 * object类  是所有类默认继承的父类
 * 
 * 构造方法
 * 是一种特殊的方法，用来初始化类的属性，方法名要与类名相同
 * [访问控制符] 类名 [(参数列表)]{
 *       //方法体   
 * }
 * 构造方法的作用：
 * 1.可以通过构造方法完成对象的实例化
 * 2.通过有参的构造方法完成对象属性的初始化
 * 
 * 注意：1.构造方法可以重载
 *     2.当存在有参的构造方法时，默认无参的构造方法就不在了，如果需要用无参，则需要定义出来
 *     
 *  this关键字
 *  this代表当前对象，不做区分时可以省略
 *  在方法中可以理解为 调用当前方法的对象
 *  
 *  this() 可以再构造器中使用，可以调用另一个构造方法
 *  一般用于无参构造调用有参构造   创建默认值
 *  注意：必须放在构造方法的第一句话
 *  
 *  匿名对象
 *  在创建对象时，不定义对象的引用句柄，只是为了调用方法或
 */


public class TestPart601 {

	public static void main(String[] args) {
		
		// 类名       类对象名                         构造器
		Employee epl = new Employee();//创建一个对象
		epl.age=20;
		epl.name="张三";
		//通过引用去操作对应对象的属性和方法
		System.out.println(epl.showAge());
		System.out.println(epl.showName());
		
		Employee epl2 = new Employee();
		
		//垃圾回收机制提醒操作（知道就行，不用背）
		System.gc();
		System.runFinalization();
		
		//
		Student a1 = new Student();
		a1.name ="zs";
		a1.age = 18;
		a1.grade = 70;
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.grade);
		
		
		
		
		
	}

}
