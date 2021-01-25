package com.neuedu.part06;



/**
 * 
 * 职工类
 *
 */

public class Employee {
	
	//先写属性（变量）
	String name;
	int age;
	double sal;
	
	//构造方法
	public Employee(){
		
	}

	
	
	
	//后写行为（方法）
	public String showName(){//获取名字
		System.out.println("员工名字为"+name);
		return name;
	}
	
	/**
	 * 获取年纪
	 * @param 为空
	 * @return age 年龄
	 */
	public int showAge(){//获取年龄
		System.out.println("员工年龄为"+age);
		return age;
	}
	
	/**
	 * 修改姓名
	 * @param _name 预期修改的名字
	 */
	public void updateName(String _name){//修改姓名
		name = _name;
	}
	
	/**
	 * 领取工资
	 * @return sal
	 */
	public double getSal(){//获取工资
		System.out.println("员工工资为"+sal);
		return sal;
	}
	
	

}
