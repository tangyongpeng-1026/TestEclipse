package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * ����
 *   �����Ǳ䳤�ģ�ֻ�ܷ������������͵� ���ݼ������ԷŲ�ͬ���ͣ�
 * List����
 * 
 *   ArrayList�����Խṹ���ײ��Ǹ����飬Ĭ�ϳ�����10
 *    ע�⣺���ϲ���ָ��������ǰsize-1��λ�ý��и�ֵ
 *     ���ϻ�ȡ���� ������size()����
 *     ������� add()
 *     ��ȡ���� get(index)
 *     ������� set()
 *     addAll ����һ�����ϵ�����Ԫ����ӽ���
 *     clear() ��ռ�������
 *     remove(index) ָ���±�λ��ɾ��
 *     isEmpty() �жϼ����Ƿ���Ԫ��
 *    
 *    ������
 *     �̳���collection �ӿڵļ����඼���ڵķ���
 *     ͨ����Ӧ�������õ���iterator() ������ ����һ������������
 *     ���������󷽷�
 *       hasNext() �ж���û����һ��Ԫ��
 *       next() ������һ��Ԫ�أ����ƶ�Ԫ���ж�λ��
 *       
 *   LinkedList �ڲ����ݴ洢�ṹ��ArrayList ��ͬ
 *              �ײ���һ���������������β���ݽ��д���
 *          addFirst() ���ײ���������
 *          addLast()  ��β����������
 *          removeFirst() ɾ���ײ�����
 *          removeLast()  ɾ��β������
 * 
 * �����⣺ArrayList��LinkedList������
 *      1.���ݽṹ��ͬ
 *      2.Ƶ��������������ʱ��  �в�ѯ�����϶�ʱ������ʹ��ArrayList
 *                    �����ݲ������ɾ�������϶�ʱ������ʹ��LinkedList
 *    
 *    List�����ص㣺 ���� �� �����ظ�
 *    Set�����ص㣺 ���� �� �����ظ�
 *    
 *    HashSet ����ȥ���ظ�
 *            ������ָ�Ͳ������ݵ�λ���޹�
 *    TreeSet ������Ĺ��� ���ڲ�����������
 *            
 *    
 */
public class TestPart1001 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();//�ײ���Ǹ�����
		//��ֵ
		arrayList.add(new Integer(1));		
		arrayList.add(2); //����֧���Զ�װ��Ͳ���		
		arrayList.add("string");
		System.out.println(arrayList);
		
		//���Ƽ���
		ArrayList arrayList2= new ArrayList();		
		arrayList2.addAll(arrayList);
		//arrayList2.clear(); //�������
		//arrayList2.remove(0); //ָ���±�λ��ɾ��
		System.out.println(arrayList2);
				
		//���ϵĳ���
		int size = arrayList.size();
		System.out.println(size);
		
		//���ϵı���
		for(int i=0;i<arrayList2.size();i++){
			System.out.println(arrayList2.get(i));
		}
		
		
		Iterator iterator = arrayList.iterator(); //��ȡһ����ǰ���ϵĵ���������
		
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
		
		//����
		Iterator iterator2 = hashSet.iterator();//������һ�ַ���		
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		Object[] array = hashSet.toArray();//�����ڶ��ַ���
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		//��ϰ����һ���齱��35���� �����ȡ7�����뼯���У������ظ���
		
		/*
		HashSet hashSet2 = new HashSet();
		Random random =new Random();
		for(int i=1;i<8;i++){
			hashSet2.add(random.nextInt(35)+1);
		}
		System.out.println(hashSet2);
		*/
		
				
		//2.����˳���б�ArrayList�д洢��Ԫ������������1~5������ÿ��Ԫ�أ���ÿ��Ԫ��˳�������
		ArrayList arrayList3 =new ArrayList();
		arrayList3.add(3);
		arrayList3.add(1);
		arrayList3.add(5);
		arrayList3.add(2);
		arrayList3.add(4);
		arrayList3.set(0, 6);
		Collections.sort(arrayList3);//����
		Iterator iterator3 = arrayList3.iterator();
		while(iterator3.hasNext()){
			System.out.print(iterator3.next()+" ");
		}
		
		System.out.println();
		//3.��һ���б��д洢����Ԫ�أ�apple,grape,banana,pear��
		ArrayList arrayList4 =new ArrayList();
		arrayList4.add("apple");
		arrayList4.add("grape");
		arrayList4.add("banana");
		arrayList4.add("pear");
		System.out.print(arrayList4);
		
		System.out.println();
		//3.1�����ؼ����е����ĺ���С��Ԫ��
		Collections.sort(arrayList4);
		System.out.println("��СԪ����"+arrayList4.get(0));
		System.out.println("���Ԫ����"+arrayList4.get(arrayList4.size()-1));
		
		//3.2�������Ͻ������򣬲��������Ľ����ӡ�ڿ���̨��
		Iterator iterator4 = arrayList4.iterator();
		while(iterator4.hasNext()){
			System.out.print(iterator4.next()+" ");
		}
		
		
		//����ѧ����Ϣname,score ����exit�˳�������ڼ����У���ȡƽ�ַ�
		
		/*
		ArrayList<Student> stu = new ArrayList<>();
		
		while(true){			
			Student student =new Student();
			
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("������ѧ������");
			String name =scanner.nextLine();
			student.setName(name);
			
			System.out.println("������ѧ���ɼ�");
			int score =scanner.nextInt();
			student.setScore(score);
			
			stu.add(student);
			
			System.out.println("�Ƿ����¼��ѧ���ɼ���������1����������exit");
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
