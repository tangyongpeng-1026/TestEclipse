package com.neuedu.part09;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ����Ĭ�ϵ��ַ����� GBK���ģ�gb2312
 * 4.�ַ�����
 * �ַ����ڲ�ʹ�ò��ɱ��char������������
 * �ַ����ıȽϷ�����
 *              boolean equals() �ж��Ƿ����
 *              boolean equalsIgnoreCase()���Դ�Сд���еıȽ�
 *              boolean startsWith() �ж��ַ����Ƿ��Դ˿�ʼ
 *              boolean endsWith() �ж��ַ����Ƿ��Դ˽���
 * �ַ����������ת����
 *   �ַ�������ͨ��toCharArray()�ķ���ת����char������
 *   ����ͨ���ַ����Ĺ��������ַ�����ת�����ַ�����������ͨ��String.valueOf����
 * �ַ�����byte�����ת����
 *   ����ͨ��getBytes()�ķ������byte���飬���Ի���ַ�����ռ�õ��ֽ���
 * �ַ����ĳ��÷�����
 *   split ͨ��ָ�����ַ��������в��ԭ�ַ���Ϊһ���ַ�������
 *   replace(���ַ������ַ�) �����ַ�ȫ��ת�������ַ�������һ�����ַ���
 *   toUppercase() ���ַ�����������ĸת���ɴ�д
 *   toLowerCase() ���ַ�����������ĸת����Сд
 *   charAt(index) ����index�±��Ӧ���ַ�����0��ʼ��length-1��
 *   substring(begin index,end index) �ӿ�ʼ�±꿪ʼ���������±�-1����������һ�����ַ���
 *   indexOf(�ַ�/�ַ���) �����ַ������ַ������ڵ�λ�ã����û�з���-1
 *   trim() �����µ��ַ�����������β�ո�
 *   matches(������ʽ) �ַ�����ʽ����������򣬷���true�������Ϸ���false
 *   
 *   ���һ���ַ���Ƶ���ı仯�����Ƽ�ʹ��String
 *   �ɱ���ַ���
 *   StringBuffer��StringBuilder
 *    append(XXX) ��XXXƴ�ӵ��ַ�������  
 *    insert(ָ��λ��,XXX����) �ַ�����ָ��λ�ò���XXX
 *    deleteCharAt(ָ��λ��)  ɾ��ָ��λ���ַ��� 
 *   
 *   �����⣺StringBuffer��StringBuilder������ 
 *   StringBuffer �߳̽ϰ�ȫ���ٶȽ��� synchronized
 *   StringBuilder �̲߳���ȫ���ٶȽϿ�
 *   
 *  5.Date�� 
 *   after �ж������Ƿ���ָ������֮��
 *   before �ж������Ƿ���ָ������֮ǰ
 *  6.������
 *    Calendar instance = Calendar.getInstance(); ͨ�������ʽ��ȡ����
 *    getTime() ��õ�ǰϵͳʱ��
 *  7.SimpleDateFormat �Զ������ڸ�ʽ
 *    �������ж���ָ���ĸ�ʽ
 *    y�����꣬M�£�d�գ�HСʱ��m���ӣ�s��
 *    format(Date d) ������ת�����ַ�����
 *    parse(String s) �ַ�����ת����������     ע�⣺�ַ���Ҫ��SimpleDateFormat�ﶨ��ĸ�ʽһ�²ſ���ת��
 *  8.Math��
 *    Math.floor ֻ����С����ǰ�棨������
 *    Math.ceil ��������������ȡ����
 *    Math.rint����������ȡ����
 */
public class TestPart902 {

	public static void main(String[] args)  {
		String str =new String("abcdefg");
		String str2 =new String("ABCDEFG");
		boolean b =str.equalsIgnoreCase(str2);
		boolean b1 =str.startsWith("abc");
		System.out.println(b);
		System.out.println(b1);
		
		char[] charArray = str2.toCharArray();
		
		str =new String(charArray);
		System.out.println(str);
		
		String str3 = "  a,eqwe,dsadas  ";
		String[] splitA = str3.split(",");
		
		String replace = str3.replace(',', '#');
		System.out.println(replace);
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		System.out.println(str3.charAt(str3.length()-1));
		
		System.out.println(str3.substring(0, 3));//����ҿ�
		
		System.out.println(str3.lastIndexOf('e'));
		System.out.println(str3.lastIndexOf("eqw"));
		
		System.out.println(str3.trim());
		
		//ͳ��һ���ַ������ַ�e���ֵĴ���
		
		String s = "abecedkjkacedjkdseddklj";
		System.out.println(s.length()-s.replace("e", "").length());
		
		//�����һ���ַ����ڵڶ����ַ����г��ֵĴ���
		/*
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ���ַ���");
		String first = sc.nextLine();
		System.out.println("������ڶ����ַ���");
		String second = sc.nextLine();
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		

		//�ж�һ�������ʽ�Ƿ���ȷ
		while (true) {
			System.out.println("������һ������");
			String mail = sc.nextLine();
			int length = mail.length();
			int indexOf = mail.indexOf("@");
			int indexOf2 = mail.indexOf(".");
			if(length>20){//�ַ������ȴ���20
				System.out.println("���䲻�Ϸ�");
			}else
			if(indexOf == -1 || indexOf ==0 || indexOf == length-1){//@�����ٿ�ͷ�������ٽ�β������û��
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){//.�����ٿ�ͷ�������ٽ�β������û��
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf2<indexOf || indexOf2-indexOf==1){//����@��ǰ��,�������ǰ���
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){//@��.ֻ�ܸ���һ��
				System.out.println("���䲻�Ϸ�");
			}else{
				String string = mail.substring(indexOf2+1);
				if(string.equals("com") || string.equals("cn") ){//������com����cn��β
					System.out.println("����Ϸ�");
					break;
				}else{
					System.out.println("���䲻�Ϸ�");
				}
			}
		}
		
		*/
		
		StringBuffer stringBuffer = new StringBuffer("aaaa");
		//ƴ��
		stringBuffer.append("1111");
		stringBuffer.append("2222");
		stringBuffer.insert(1, "3333");
		stringBuffer.deleteCharAt(1);
		
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder =new StringBuilder("bbbb");
		
		/*
		//����̨����ʮ���ַ������������֮���
		Scanner scanner = new Scanner(System.in);
		StringBuffer stringBuffer2 =new StringBuffer();
		for(int i=0;i<10;i++){
			String input = scanner.nextLine();
			stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		
		*/
		
		Date date = new Date();
		System.out.println(date );
		
		//������
		Calendar instance = Calendar.getInstance();
		System.out.println(instance.getTime());
		int year = instance.get(1);//1����
		int month = instance.get(2);//2����
		int day = instance.get(5);//5����
		int type = instance.get(9);//0�����磬1������	
		int hour = instance.get(10);//10��Сʱ
		int min = instance.get(12);//12�Ƿ���
		int sec = instance.get(13);//13����
		
		System.out.println(hour+":"+min+":"+sec+" "+type);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd�ա�HH:mm:ss");
		String format = sdf.format(new Date());
		System.out.println(format);
		
		try {
			Date parse = sdf.parse(format);
			System.out.println(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		double d = Math.ceil(10.00000000001);
		System.out.println(d);
		
		double e = Math.rint(10.00000000001);
		System.out.println(e);
		
		
	}

}
