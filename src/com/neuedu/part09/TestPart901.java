package com.neuedu.part09;

/**
 *1. java ����API
 *   java.awt  java����ͼ�ι���
 *   java.io   java�������ļ�����
 *   java.lang java������
 *   java.math 
 *   java.net  ����ͨ�ţ�����TCP/IPЭ��
 *   ���ԣ�1.�˽�http/https������
 *       2.TCP/IPЭ���ص�
 *   java.sql  java���ϵ�����ݿ⽻���Ĺ�����
 *   java.util java���ù����࣬�������ϡ�����
 * 
 *2. Object ������ĸ���
 *   ���һ������ʱ��Ĭ�ϻ��������toString����
 *   ���õ�3��   toString() , .equals() , hashCode()
 * 
 *3. ��װ��
 *   Ϊ���û����������ͣ�Ҳ�ܾ߱������������ԣ��ṩ�˰�װ��ĸ��� 
 *   ��̳�Comparable �ӿڣ�ʵ�������compareTo���� ������Ϊ����ȽϹ��ߣ�����ֵ��int
 *   �������� �Ͱ�װ���ת��
 *   ��Ӧ�Ĺ�ϵ�£�  ������������ת���ɰ�װ�࣬ͨ��new����
 *             ��װ��ת���ɻ����������ͣ�ͨ������.XXXValue();
 *   ���л������Զ�װ����Զ�����ĸ���
 *   
 *   �ַ����Ͱ�װ���ת���� ��װ��ת�����ַ��������ö�Ӧ��toString()
 *                  �ַ���ת���ɰ�װ�࣬���֣�  1.�����Ե��ð�װ��Ĺ�����ת��
 *                                    2.����ͨ����װ��.valueOf(��Ҫת�����ַ���)
 *   �ַ����ͻ�����������ת����  �ַ���ת���ɻ����������ͣ�ͨ����Ӧ�İ�װ����ø��Ե�parseXXX�������Ƕ�Ӧ�ַ���������������ַ���������ת�������ᱨ��NumberFormatException���쳣             
 *                     ������������ת�����ַ�����
 *                     
 *                 
 *
 */
public class TestPart901 {

	public static void main(String[] args) {
		// ����һ��ѧ�������
		Student student = new Student();
		student.setStuName("����");
		student.setAge(20);
		student.setStuNO("1001");
		student.setScore(95);
		
		Student student2 = new Student();
		student2.setStuName("����");
		student2.setAge(20);
		student2.setStuNO("1002");
		student2.setScore(80);
		
		boolean b =student.equals(student2);
		System.out.println(b);
		
		String string =new String("123123");
		System.out.println(string);
		
		Integer integer = new Integer(10);
		

	}

}
