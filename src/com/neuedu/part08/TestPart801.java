package com.neuedu.part08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �쳣����
 * ʲô���쳣��
 * �������й����з����ķ��������󣨴���
 * �쳣�ķ�֧���ࣺ
 * Throwable�� Error ����� ջ�������������⣬�������ⲻ�����쳣����Χ��
 *          �� Exception�� RuntimeException ����ʱ�쳣��Ҳ�зǼ�����쳣��
 *                     �� IOException ����ʱ�쳣��Ҳ�м�����쳣�����ڳ�������֮ǰ�����������Ҫ������쳣��
 * 
 * �쳣���жϳ��򷽷������У�������Ҫ����,����֮��Ӱ���������ִ��
 * 
 * �쳣�Ĵ���
 * 1.ʹ��try/catch ���д���
 * try{��Ҫ�쳣����Ĵ���}catch(��Ҫ������쳣����){д��������˶�Ӧ�쳣�����ߵĴ����߼�}
 * ������뷢���쳣�����ж��쳣�����ĸ��쳣���ͣ�ִ�ж�Ӧ�Ĵ���
 * ע�⣺try/catch ��һ�����壬���ܵ���д��catch����д���
 *     try�к����д���ʱ�������ദ�쳣����ʱ��һ���쳣�����ұ�����Ĵ���,�Ҳ����ٻ�try��
 *     catch�е��쳣�����ж������|�����ֻ��һ��������
 *     ���catch����Exception�쳣���ͣ�����������
 *     try/catch�ǿ���Ƕ�׵�
 * finally{}�Ӿ�   ��try/catch�����쳣����ʱ����һ��Ҫִ�еĴ������finally�Ӿ��н���ִ�У��������
 * һ�������ر���
 * ע�⣺try/finally ����ʡ��catch
 * 
 * 2.throws�ؼ���   �쳣�����ף�����ô����쳣�ķ����ĵط���
 *   �ڷ���ͷ����   ������ǰ��   дthrows�ؼ��� ���쳣����
 * ע�⣺
 *     �׳�����쳣���쳣����֮���ö��ţ�,�����
 *     �׳����쳣��Ҫ���õĵط���������������׳�    
 * 
 * 3.throw�ؼ���   �����쳣
 * �Լ���������쳣����Ҫ������
 * ע�⣺
 *     throw�Ӿ�����û����ִ��
 *     
 * ��Ҫʹ��try/catch��֧ ����������ҵ�񳡾�����    
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
			System.out.println("�������������쳣");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("����������֮����쳣");
		}
		

		System.out.println("hello world");
		System.out.println(i);

	}

}



