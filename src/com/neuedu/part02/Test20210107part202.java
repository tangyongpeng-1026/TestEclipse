package com.neuedu.part02;

import java.util.Scanner;

/**
 * java�����
 * �����������
 *            +��-��*��/��ֻȡ�������֣���%ȡ�ࣨ������Ϊ����Ϊ����
 *            ++������--�Լ�    ++����   �ȼӺ���       --����   �ȼ�����
 *                        ����++ ���ú��       ����-- ���ú��
 *            +�ַ������ӣ�����������һ����String���ͣ�ϵͳ���Զ�����һ������
 *                     ��ת�����ַ������ͣ�Ȼ���������            
 * ��ֵ�������+=�� -=
 * ��ϵ�������>�� >=�� <�� <=�� ==���Ƿ���ڣ���!=�������ڣ�
 *         ��ϵ�������ǲ����ͣ�ture����false��
 * �߼��������������������͵������еĲ�������
 *         && �߼���   ͬ�����棬�м���� 
 *         || �߼���   �������棬ͬ�����
 *         ��     �߼���   ���ȡ��
 *         �������ڶ�·���� ��&&�жϵ�һ�����ʽ��ֵ���Ϊfalse����ڶ�����ִ�У�
 *                    ��||�жϵ�һ�����Ϊtrue����ڶ�����ִ�У�
 *         &��|���ڷǶ�·����������           
 * ��Ŀ�������������Ԫ���ʽ����
 * ������ʽ1Ϊ��  ��������ʽ2 ����������ʽ3
 * ���ʽ1�����ʽ2�����ʽ3
 *                
 */

public class Test20210107part202 {

	public static void main(String[] args) {
		
        //���������
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(-5%2);
		
		//����
		int i=0;
		System.out.println(i++ + ++i); //�����￴��0+2
		                               //���ʽ�����������Ҳ����Ӱ��
		                               //��չ�⣺i++ �Ƿ����̰߳�ȫ�ģ�
		System.out.println("������"+i+ ++i); //���˴�+�����ӷ�����˼��
		System.out.println("������"+(i+ ++i)); //�����Լ����ţ�
		
		System.out.println(5.0/2);
		
		//��ֵ�����
		int x1=3;
		int x2=4;
	    x1= x1+3;
	    x1 +=3;
	    System.out.println(x1);
	    
	    //��ϵ�����
	    System.out.println(x1>x2);//����
	    System.out.println(x1==x2);//�Ƿ����
	    System.out.println(x1!=x2);//������
	    
	    //�߼������
	    boolean flag = true,flag1 = false;
	    System.out.println(flag&&flag1);//false
	    System.out.println(flag||flag1);//true
	    System.out.println(flag^flag1);//true
	    
	    //��Ŀ���ʽ
	    System.out.println(1>2?3-1:4+1);
	    
	    //����̨�������
	    Scanner sc = new Scanner (System.in);
		System.out.print("���������ݣ�");
		String nextLine = sc.nextLine();
		System.out.println("�ɿ���̨�������Ϊ��"+nextLine);
	}
	
}
