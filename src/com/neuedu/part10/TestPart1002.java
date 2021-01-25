package com.neuedu.part10;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 泛型：
 *  在使用集合定义时放任意类型的场景，可以用泛型定义
 *  使用集合时，由于如果不加限制什么类型都可以放，取出来使用不方便所以要是用泛型
 * 泛型特点：
 *  限制存放的类型，不需要强制转换
 * 注意：定义集合时，构造器的泛型，在1.7版本可以省略（<>钻石操作符），不然需要和前面声明的泛型保持一致
 * 
 * 自定义泛型类：
 *  可以实现多个泛型的定义
 *  注意：当一个类 继承带有泛型的类时，如果在父类上标明了泛型标识，那么子类必须实现泛型功能
 *                         如果父类不标，那么子类可以标，可以不标
 * 
 * Map接口
 *  Map是以键/值对 存放成对数据的数据组，K代表Key键，V代表value值
 *    put(key,value) 方法存值（赋值）
 *    size() 取长度
 *    get(key) 根据key获取value
 * HashMap集合
 *    遍历的两种方式： 1.keySet()
 *               2.entrySet()
 * 
 * 所有集合都有的forEach方法        
 * 1. list.forEach(item -> {});
 * 2. set.forEach(item -> {});
 * 3. map.forEach((k,v) -> {});      
 *
 */
public class TestPart1002 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(10);
		System.out.println(a);
		
		HashMap<Integer, Integer> hashMap = new HashMap();
		hashMap.put(1, 11);
		hashMap.put(2, 22);
		hashMap.put(3, 33);
		hashMap.put(4, 44);
		hashMap.put(4, 45);
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		
		//遍历
		//1.根据key拿value
		Set<Integer> keySet = hashMap.keySet();//拿所有的key的集合
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()){
			Integer key = iterator.next();//拿到每一个key
			Integer value = hashMap.get(key);//拿到每一个value
			System.out.println("key:"+key+"  value:"+value);
		}
		
		//2.通过entry集合遍历
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()){
			Entry<Integer, Integer> entry = iterator2.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
		//扩展：如何不根据key去查value?
		
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
		}
		
		//lamdba表达式
		a.forEach(Item ->{//list
			System.out.println(Item);
		});
		hashMap.keySet().forEach(Item ->{//set
			System.out.println(Item+","+hashMap.get(Item));
		});
		hashMap.forEach((k,v)->{//map
			System.out.println(k+" , "+v);		
		});
		
		//编写一个程序，创建一个　HashMap对象，用于存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。
		//输出所有储户的当前余额。
		
		HashMap<Integer, BankerInfo> hashMap2 = new HashMap();
		hashMap2.put(1,new BankerInfo(101, "张三", 100.00));
		hashMap2.put(2,new BankerInfo(102, "李四", 200.00));
		hashMap2.put(3,new BankerInfo(103, "王五", 300.00));

		Scanner scanner =new Scanner(System.in);
		System.out.println("欢迎使用该系统，1查询所有人信息，2查询个人信息，3退出");
		
		while(true){
			String type =scanner.next();
			if("1".equals(type)){
				Iterator<Entry<Integer, BankerInfo>> iterator3 = hashMap2.entrySet().iterator();
				while(iterator3.hasNext()){
					Entry<Integer, BankerInfo> next = iterator3.next();
					System.out.println("用户编号："+next.getValue().getNo()+" 姓名："+next.getValue().getName()+"余额："+next.getValue().getBalance());
				}
			}
			else if("2".equals(type)){
				System.out.println("请输入要查询人的编号");
				String type2 =scanner.next();
				BankerInfo bankerInfo = hashMap2.get(Integer.parseInt(type2));
				System.out.println("用户编号："+bankerInfo.getNo()+" 姓名："+bankerInfo.getName()+"余额："+bankerInfo.getBalance());
			}
			else if("3".equals(type)){
				System.out.println("您已退出");
				break;
			}
			else{
				System.out.println("没有此选项，请重新输入");	
			}
		}
        
		
		//保证线程安全（同步）
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		//保证线程安全（同步）
		new ConcurrentHashMap<>();//1.7采用分段锁进行线程安全管理， 1.8开始使用CAS锁

	}

}

/*
class Generic<T> {
	
	private final static int sucType = 200;
	private final static String suc = "success";
	private T t;
	
	public Generic(T t){
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static Generic success(){
		return null;
	}
	
}

class Result<T> extends Generic<T>{

	public Result(T t) {
		super(t);
	}
	
}

*/

class BankerInfo{
	
	private int no;
	
	private String name;
	
	private double balance;
	
	public BankerInfo(int no,String name,double balance){
		this.no=no;
		this.name=name;
		this.balance=balance;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
