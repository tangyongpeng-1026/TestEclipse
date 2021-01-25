package com.neuedu.part09;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序默认的字符编码 GBK中文，gb2312
 * 4.字符串类
 * 字符串内部使用不可变的char型数组存放内容
 * 字符串的比较方法：
 *              boolean equals() 判断是否相等
 *              boolean equalsIgnoreCase()忽略大小写进行的比较
 *              boolean startsWith() 判断字符串是否以此开始
 *              boolean endsWith() 判断字符串是否以此结束
 * 字符串跟数组的转换：
 *   字符串可以通过toCharArray()的方法转换成char型数组
 *   可以通过字符串的构造器将字符数组转换成字符串，还可以通过String.valueOf方法
 * 字符串跟byte数组的转换：
 *   可以通过getBytes()的方法获得byte数组，可以获得字符串所占用的字节数
 * 字符串的常用方法：
 *   split 通过指定的字符串，进行拆分原字符串为一个字符串数组
 *   replace(旧字符，新字符) 将旧字符全部转换成新字符，返回一个新字符串
 *   toUppercase() 将字符串中所有字母转换成大写
 *   toLowerCase() 将字符串中所有字母转换成小写
 *   charAt(index) 返回index下标对应的字符（从0开始到length-1）
 *   substring(begin index,end index) 从开始下标开始，到结束下标-1结束，返回一个新字符串
 *   indexOf(字符/字符串) 返回字符或者字符串所在的位置，如果没有返回-1
 *   trim() 返回新的字符串，忽略收尾空格
 *   matches(正则表达式) 字符串格式如果符合正则，返回true，不符合返回false
 *   
 *   如果一个字符串频繁的变化，不推荐使用String
 *   可变的字符串
 *   StringBuffer和StringBuilder
 *    append(XXX) 将XXX拼接到字符串后面  
 *    insert(指定位置,XXX内容) 字符串在指定位置插入XXX
 *    deleteCharAt(指定位置)  删除指定位置字符串 
 *   
 *   面试题：StringBuffer和StringBuilder的区别？ 
 *   StringBuffer 线程较安全，速度较慢 synchronized
 *   StringBuilder 线程不安全，速度较快
 *   
 *  5.Date类 
 *   after 判断日期是否在指定日期之后
 *   before 判断日期是否在指定日期之前
 *  6.日历类
 *    Calendar instance = Calendar.getInstance(); 通过这个方式获取对象
 *    getTime() 获得当前系统时间
 *  7.SimpleDateFormat 自定义日期格式
 *    构造器中定义指定的格式
 *    y代表年，M月，d日，H小时，m分钟，s秒
 *    format(Date d) 日期型转换成字符串型
 *    parse(String s) 字符串型转换成日期型     注意：字符串要和SimpleDateFormat里定义的格式一致才可以转换
 *  8.Math类
 *    Math.floor 只保留小数点前面（截整）
 *    Math.ceil （凑整）（向上取整）
 *    Math.rint（四舍五入取整）
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
		
		System.out.println(str3.substring(0, 3));//左闭右开
		
		System.out.println(str3.lastIndexOf('e'));
		System.out.println(str3.lastIndexOf("eqw"));
		
		System.out.println(str3.trim());
		
		//统计一个字符串中字符e出现的次数
		
		String s = "abecedkjkacedjkdseddklj";
		System.out.println(s.length()-s.replace("e", "").length());
		
		//计算第一个字符串在第二个字符串中出现的次数
		/*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
		String first = sc.nextLine();
		System.out.println("请输入第二个字符串");
		String second = sc.nextLine();
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		

		//判断一个邮箱格式是否正确
		while (true) {
			System.out.println("请输入一个邮箱");
			String mail = sc.nextLine();
			int length = mail.length();
			int indexOf = mail.indexOf("@");
			int indexOf2 = mail.indexOf(".");
			if(length>20){//字符串长度大于20
				System.out.println("邮箱不合法");
			}else
			if(indexOf == -1 || indexOf ==0 || indexOf == length-1){//@不能再开头，不能再结尾，不能没有
				System.out.println("邮箱不合法");
			}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){//.不能再开头，不能再结尾，不能没有
				System.out.println("邮箱不合法");
			}else if(indexOf2<indexOf || indexOf2-indexOf==1){//点在@符前面,或者它们挨着
				System.out.println("邮箱不合法");
			}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){//@和.只能各有一个
				System.out.println("邮箱不合法");
			}else{
				String string = mail.substring(indexOf2+1);
				if(string.equals("com") || string.equals("cn") ){//必须以com或者cn结尾
					System.out.println("邮箱合法");
					break;
				}else{
					System.out.println("邮箱不合法");
				}
			}
		}
		
		*/
		
		StringBuffer stringBuffer = new StringBuffer("aaaa");
		//拼接
		stringBuffer.append("1111");
		stringBuffer.append("2222");
		stringBuffer.insert(1, "3333");
		stringBuffer.deleteCharAt(1);
		
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder =new StringBuilder("bbbb");
		
		/*
		//控制台输入十次字符串，输出连接之后的
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
		
		//日历类
		Calendar instance = Calendar.getInstance();
		System.out.println(instance.getTime());
		int year = instance.get(1);//1是年
		int month = instance.get(2);//2是月
		int day = instance.get(5);//5是日
		int type = instance.get(9);//0是上午，1是下午	
		int hour = instance.get(10);//10是小时
		int min = instance.get(12);//12是分钟
		int sec = instance.get(13);//13是秒
		
		System.out.println(hour+":"+min+":"+sec+" "+type);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日　HH:mm:ss");
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
