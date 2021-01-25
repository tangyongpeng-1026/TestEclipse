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
 * ���ͣ�
 *  ��ʹ�ü��϶���ʱ���������͵ĳ����������÷��Ͷ���
 *  ʹ�ü���ʱ�����������������ʲô���Ͷ����Էţ�ȡ����ʹ�ò���������Ҫ���÷���
 * �����ص㣺
 *  ���ƴ�ŵ����ͣ�����Ҫǿ��ת��
 * ע�⣺���弯��ʱ���������ķ��ͣ���1.7�汾����ʡ�ԣ�<>��ʯ������������Ȼ��Ҫ��ǰ�������ķ��ͱ���һ��
 * 
 * �Զ��巺���ࣺ
 *  ����ʵ�ֶ�����͵Ķ���
 *  ע�⣺��һ���� �̳д��з��͵���ʱ������ڸ����ϱ����˷��ͱ�ʶ����ô�������ʵ�ַ��͹���
 *                         ������಻�꣬��ô������Ա꣬���Բ���
 * 
 * Map�ӿ�
 *  Map���Լ�/ֵ�� ��ųɶ����ݵ������飬K����Key����V����valueֵ
 *    put(key,value) ������ֵ����ֵ��
 *    size() ȡ����
 *    get(key) ����key��ȡvalue
 * HashMap����
 *    ���������ַ�ʽ�� 1.keySet()
 *               2.entrySet()
 * 
 * ���м��϶��е�forEach����        
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
		
		//����
		//1.����key��value
		Set<Integer> keySet = hashMap.keySet();//�����е�key�ļ���
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()){
			Integer key = iterator.next();//�õ�ÿһ��key
			Integer value = hashMap.get(key);//�õ�ÿһ��value
			System.out.println("key:"+key+"  value:"+value);
		}
		
		//2.ͨ��entry���ϱ���
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()){
			Entry<Integer, Integer> entry = iterator2.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
		//��չ����β�����keyȥ��value?
		
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
		}
		
		//lamdba���ʽ
		a.forEach(Item ->{//list
			System.out.println(Item);
		});
		hashMap.keySet().forEach(Item ->{//set
			System.out.println(Item+","+hashMap.get(Item));
		});
		hashMap.forEach((k,v)->{//map
			System.out.println(k+" , "+v);		
		});
		
		//��дһ�����򣬴���һ����HashMap�������ڴ洢���д�������Ϣ(���д�������Ҫ��Ϣ�д�����ID�����������)��
		//������д����ĵ�ǰ��
		
		HashMap<Integer, BankerInfo> hashMap2 = new HashMap();
		hashMap2.put(1,new BankerInfo(101, "����", 100.00));
		hashMap2.put(2,new BankerInfo(102, "����", 200.00));
		hashMap2.put(3,new BankerInfo(103, "����", 300.00));

		Scanner scanner =new Scanner(System.in);
		System.out.println("��ӭʹ�ø�ϵͳ��1��ѯ��������Ϣ��2��ѯ������Ϣ��3�˳�");
		
		while(true){
			String type =scanner.next();
			if("1".equals(type)){
				Iterator<Entry<Integer, BankerInfo>> iterator3 = hashMap2.entrySet().iterator();
				while(iterator3.hasNext()){
					Entry<Integer, BankerInfo> next = iterator3.next();
					System.out.println("�û���ţ�"+next.getValue().getNo()+" ������"+next.getValue().getName()+"��"+next.getValue().getBalance());
				}
			}
			else if("2".equals(type)){
				System.out.println("������Ҫ��ѯ�˵ı��");
				String type2 =scanner.next();
				BankerInfo bankerInfo = hashMap2.get(Integer.parseInt(type2));
				System.out.println("�û���ţ�"+bankerInfo.getNo()+" ������"+bankerInfo.getName()+"��"+bankerInfo.getBalance());
			}
			else if("3".equals(type)){
				System.out.println("�����˳�");
				break;
			}
			else{
				System.out.println("û�д�ѡ�����������");	
			}
		}
        
		
		//��֤�̰߳�ȫ��ͬ����
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		//��֤�̰߳�ȫ��ͬ����
		new ConcurrentHashMap<>();//1.7���÷ֶ��������̰߳�ȫ���� 1.8��ʼʹ��CAS��

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
