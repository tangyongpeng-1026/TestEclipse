package com.neuedu.part07;

/**
 * 
 * 面向对象的高级特性：继承，封装，多态
 * 1.继承
 * 子类继承父类，可以继承父类（超类）的属性和方法，一般用于子类（派生类）新功能扩展。
 * 一个类只能继承一个父类，一个父类可以有多个子类
 * 
 * extends关键字
 * 写法：在子类名后写extends，再写父类名
 * 
 * 子类实例化时，会先调用父类的构造方法进行实例化，再调用子类自己的构造方法
 * 
 * super关键字
 * 代表当前对象的父类对象
 * super() 代表的是父类构造方法  需要放在子类构造方法的第一句   不能和this()同时存在
 *
 * 面试：子类实例化顺序？
 * 
 * 
 * 包名和类名组成全类名
 * com.neuedu.part07.TestPart701
 * import 导入的包名和类名
 * 注意：
 * 1.java.lang包下的类不需要导入，可以直接使用
 * 2.只能导入其他包的public类
 * 
 * 访问权限修饰符：(范围由大到小)
 * public 公共的 范围最大，都可以使用，也都可以修饰
 * protected 能在当前类和同一包中的类进行使用，还可以在不同包中的子类使用，可以修饰属性和方法
 * default 默认的  只能在当前类和同一包中的类进行使用（不写修饰符的情况）
 * private 私有的  只能在当前类使用，通常用来修饰属性
 * 
 * 类只能用 public修饰 或者 不写（默认）
 * 
 * 构造器方法
 * 由于属性的私有化，需要特定提供读取和赋值的方式，把这种方法称为构造器方法
 * 读取 getter
 * public 返回值类型    get属性名(){ return 属性名; }
 * 赋值 setter
 * public void  set属性名(数据类型 参数值){ 属性名 = 参数值; }
 * 
 * 自动创建构造器的方式：
 * 在指定的类，右键点击source， 选中Generate getterssetters ，选中需要创建的属性，然后确认
 * 
 * ※方法的覆盖（又叫重写）
 *  子类重写父类的方法叫做覆盖
 *  覆盖的规则：
 *  1.需要有相同的方法名
 *  2.需要有完全一致的参数（参数数量，参数类型，参数顺序）
 *  3.返回值类型相同
 *  4.父类被覆盖方法权限小于等于子类方法
 *  
 *  面试题：方法重载和方法覆盖的区别？
 *  重载时同一类中的水平关系，覆盖是父子类中的垂直关系
 *  分别介绍重载的规则和覆盖的规则
 *  
 *  引用数据类型转换
 *  1.向上转型
 *  子类转换成父类，自动转换
 *  需要有子父类继承关系，转换之后会丢失子类扩展的属性和行为
 *  2.向下转型
 *  父类显示的转换成子类，强制转换
 *  只有经历过向上转型，才能向下转型
 *  
 *  instanceof关键字
 *  判断向上转型后的对象 属于哪个类
 *  
 *  右键选Qualified Name，复制全类名
 *  com.neuedu.part07.TestPart701
 *  
 */


public class TestPart701 {

	public static void main(String[] args) {
		
	}

}


class Employee{
	private String name;
	private String birth;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getSalary(){//读取getter方法
		return salary;
	}
	
	public void setSalary(double salary){//设置setter方法
		this.salary=salary;
	}
	
	
	
	
	
	
}
