package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * 集合
 *   集合是变长的，只能放引用数据类型的 数据集（可以放不同类型）
 * List集合
 * 
 *   ArrayList：线性结构，底层是个数组，默认长度是10
 *    注意：集合不能指定超过当前size-1的位置进行赋值
 *     集合获取长度 ，调用size()方法
 *     添加数据 add()
 *     获取数据 get(index)
 *     变更数据 set()
 *     addAll 将另一个集合的所有元素添加进来
 *     clear() 清空集合数据
 *     remove(index) 指定下标位置删除
 *     isEmpty() 判断集合是否有元素
 *    
 *    迭代器
 *     继承了collection 接口的集合类都存在的方法
 *     通过对应集合引用调用iterator() 方法， 返回一个迭代器对象，
 *     迭代器对象方法
 *       hasNext() 判断有没有下一个元素
 *       next() 返回下一个元素，并移动元素判断位置
 *       
 *   LinkedList 内部数据存储结构和ArrayList 不同
 *              底层是一个链表（可以针对首尾数据进行处理）
 *          addFirst() 在首部插入数据
 *          addLast()  在尾部插入数据
 *          removeFirst() 删除首部数据
 *          removeLast()  删除尾部数据
 * 
 * 面试题：ArrayList和LinkedList的区别？
 *      1.数据结构不同
 *      2.频繁操作集合数据时，  有查询操作较多时，建议使用ArrayList
 *                    对数据插入或者删除操作较多时，建议使用LinkedList
 *    
 *    List集合特点： 有序 ， 可以重复
 *    Set集合特点： 无序 ， 不可重复
 *    
 *    HashSet 可以去除重复
 *            无序是指和插入数据的位置无关
 *    TreeSet 有排序的功能 （内部是排序树）
 *            
 *    
 */
public class TestPart1001 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();//底层就是个数组
		//赋值
		arrayList.add(new Integer(1));		
		arrayList.add(2); //集合支持自动装箱和拆箱		
		arrayList.add("string");
		System.out.println(arrayList);
		
		//复制集合
		ArrayList arrayList2= new ArrayList();		
		arrayList2.addAll(arrayList);
		//arrayList2.clear(); //清空数据
		//arrayList2.remove(0); //指定下标位置删除
		System.out.println(arrayList2);
				
		//集合的长度
		int size = arrayList.size();
		System.out.println(size);
		
		//集合的遍历
		for(int i=0;i<arrayList2.size();i++){
			System.out.println(arrayList2.get(i));
		}
		
		
		Iterator iterator = arrayList.iterator(); //获取一个当前集合的迭代器对象
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.get(0);
		linkedList.addFirst(5);
		linkedList.addLast(15);
		System.out.println(linkedList);
		
		HashSet hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add("aa");
		hashSet.add("qqq");
		hashSet.add(-1);
		System.out.println(hashSet);
		
		//遍历
		Iterator iterator2 = hashSet.iterator();//遍历第一种方法		
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		Object[] array = hashSet.toArray();//遍历第二种方法
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		//练习：做一个抽奖，35个数 随机抽取7个放入集合中（不能重复）
		
		/*
		HashSet hashSet2 = new HashSet();
		Random random =new Random();
		for(int i=1;i<8;i++){
			hashSet2.add(random.nextInt(35)+1);
		}
		System.out.println(hashSet2);
		*/
		
				
		//2.假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出。
		ArrayList arrayList3 =new ArrayList();
		arrayList3.add(3);
		arrayList3.add(1);
		arrayList3.add(5);
		arrayList3.add(2);
		arrayList3.add(4);
		arrayList3.set(0, 6);
		Collections.sort(arrayList3);//排序
		Iterator iterator3 = arrayList3.iterator();
		while(iterator3.hasNext()){
			System.out.print(iterator3.next()+" ");
		}
		
		System.out.println();
		//3.在一个列表中存储以下元素：apple,grape,banana,pear　
		ArrayList arrayList4 =new ArrayList();
		arrayList4.add("apple");
		arrayList4.add("grape");
		arrayList4.add("banana");
		arrayList4.add("pear");
		System.out.print(arrayList4);
		
		System.out.println();
		//3.1　返回集合中的最大的和最小的元素
		Collections.sort(arrayList4);
		System.out.println("最小元素是"+arrayList4.get(0));
		System.out.println("最大元素是"+arrayList4.get(arrayList4.size()-1));
		
		//3.2　将集合进行排序，并将排序后的结果打印在控制台上
		Iterator iterator4 = arrayList4.iterator();
		while(iterator4.hasNext()){
			System.out.print(iterator4.next()+" ");
		}
		
		
		//输入学生信息name,score 输入exit退出，存放在集合中，获取平局分
		
		/*
		ArrayList<Student> stu = new ArrayList<>();
		
		while(true){			
			Student student =new Student();
			
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("请输入学生姓名");
			String name =scanner.nextLine();
			student.setName(name);
			
			System.out.println("请输入学生成绩");
			int score =scanner.nextInt();
			student.setScore(score);
			
			stu.add(student);
			
			System.out.println("是否继续录入学生成绩，是输入1，结束输入exit");
			Scanner sc =new Scanner(System.in);
			String info = sc.nextLine();
			if("exit".equals(info)){
				break;
			}
		}
		
		int sum=0;
		Iterator<Student> iterator2 =stu.iterator();
		while(iterator2.hasNext()){
			Student next = (Student) iterator2.next();
			sum += next.getScore();
		}
		System.out.println(sum/stu.size());
	
      */
	}

}

class Student{
	
	private String name;
	
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
