package com.neuedu.part02;
/**
 * JDK java��������
 * JRE java���л���
 * �����������
 * ��{}ȷ������飨����飩�����п���д�������ͣ�����������������������
 * 1.��ʶ��
 * ��ʶ����������ĸ�����֣���Ԫ���ţ��»������
 *         ����ĸ�����֣���Ԫ���ţ��»��߿�ͷ�����������ֿ�ͷ
 *         �����ǹؼ��ֻ��߱�����
 *         �����пո�
 *         ����û�����ƣ����˹�����
 * ��ʶ���淶��
 *  ����ÿ�����ʵ�����ĸ��д��������ĸСд
 *  ����ÿ�����ʶ�Сд
 *  ��������һ�����ʵ�����ĸСд��������������ĸ��д
 *  �������ͷ�����һ��
 *  ����������ȫ����д
 *  
 * 2.�������ڳ������й�������ʱ���ܷ����仯��
 * ͬһ��������б����������ظ�
 * java���������ͷ�Ϊ�����ࣺ1.�����������ͣ�
 *                              �ַ���  char �ɵ�����''���Σ� ֻ��д�����ַ���ռ��2���ֽ�
 *                                        ����дUnicode�ַ�
 *                                        ���õ��ַ�����  A 65 ��ʮ���ƣ�
 *                                                  a 97 
 *                                                  0 48
 *                                        ת���ַ� ͨ��  \ ����
 *                                                 \n ����
 *                                                 \r �س�
 *                                                 \t tab
 *                                                 \b �˸�
 *                              ������  boolean ֻ���� ture �� false ����ֵ   ����Сд �� Ĭ��ֵ��false
 *                              ��ֵ�ͣ����ͣ�byte��short��int��long��       
 *                                     byte �ֽ��� 1�ֽ� -128~127
 *                                     short ������ 2�ֽ� -32768~32767
 *                                     int ���� 4�ֽ� -2147483648~2147483647
 *                                     long ������ 8�ֽ� -2^63~2^63-1 ����ʱ��Ҫ�ں���Ӹ�L
 *                                   �����ͣ�float��double��
 *                                     float �����ȸ�����  4���ֽ�  ֵ��Ϊ-3.403E38~3.403E38 ����ʱ��ֵ�ĺ����F
 *                                     double ˫���ȸ����� 8���ֽ�  ֵ��Ϊ-1.798E308~1.798E308
 *                    2.������������
 *                    3.����ת���� ǿ����ʾ����ת��
 *                             �Զ���ʽ����ת��
 *                             *��С��Χ��ֵת������Χ��ʱ��  --�Զ�ת
 *                              ����Χ��С��Χתʱ --ǿ��ת     
 *                             byte
 *                             short �� int �� long �� float ��double
 *                             char                       
 */
public class Test20210106part201 {
	public static void main(String[] args){
  	  /*
  	   * ������   ����0����1   ��2��1 ��0B����
  	   * �˽���   ��0����
  	   * ʮ������   ��0X��ͷ   1~9 A~F��10~15��
  	   */
  	  //������ת��Ϊʮ����   ��Ȩ��
  	  //�Զ�ת��Ϊʮ����
  	  int two = 0B0111;
  	  System.out.println(two);
  	  
  	  int eight = 0140;
  	  System.out.println(eight);
  	 
  	  int sixteen = 0X1F;
  	  System.out.println(sixteen);
  	  //�˽���ת���ɶ����ƣ�ÿλ��3λ��
  	  //ʮ������ת���ɶ����ƣ�ÿλ��4λ��
  	  
  	  float f = 10.0F;
  	  System.out.println(f);
  	  
  	  double d = 10.011;
  	  System.out.println(d);
  	  
  	  System.out.println(Integer.toBinaryString(10));//ʮ����ת���ɶ�����
  	  System.out.println(Integer.toOctalString(16));//ʮ����ת���ɰ˽���
  	  System.out.println(Integer.toHexString(100));//ʮ����ת����ʮ������
  	  
  	  //�Զ���ȫ����ֵ   �������ں��水ס Ctrl+1�Զ�����
  	  String hexString = Integer.toHexString(100);
  	  System.out.println(hexString);
  	  
  	  //������
  	  boolean b1=true;
  	  boolean b11=false;
  	  System.out.println(b1);
  	  
  	  //�ַ���
  	  //Unicode��
  	  char c ='\u0041';
  	  System.out.println(c);
  	  
  	  //ת���ַ�
  	  char c1 ='\'';
  	  System.out.println(c1);
  	  char c2 ='\\';
  	  System.out.println(c2);
  	  
    }
}
