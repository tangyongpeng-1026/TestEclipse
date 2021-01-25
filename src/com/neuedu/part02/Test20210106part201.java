package com.neuedu.part02;
/**
 * JDK java开发环境
 * JRE java运行环境
 * 变量和运算符
 * 由{}确定代码块（程序块），其中可以写数据类型，变量，运算符，条件流语句
 * 1.标识符
 * 标识符规则：由字母，数字，美元符号，下划线组成
 *         以字母，数字，美元符号，下划线开头，不能以数字开头
 *         不能是关键字或者保留字
 *         不能有空格
 *         长度没有限制（不宜过长）
 * 标识符规范：
 *  类名每个单词的首字母大写，其他字母小写
 *  包名每个单词都小写
 *  方法名第一个单词的首字母小写，其他单词首字母大写
 *  变量名和方法名一样
 *  常量名建议全部大写
 *  
 * 2.变量：在程序运行过程中随时可能发生变化的
 * 同一个代码块中变量名不能重复
 * java的数据类型分为两大类：1.基本数据类型：
 *                              字符型  char 由单引号''修饰， 只能写单个字符，占用2个字节
 *                                        可以写Unicode字符
 *                                        常用的字符编码  A 65 （十进制）
 *                                                  a 97 
 *                                                  0 48
 *                                        转义字符 通过  \ 修饰
 *                                                 \n 换行
 *                                                 \r 回车
 *                                                 \t tab
 *                                                 \b 退格
 *                              布尔型  boolean 只含有 ture 和 false 两种值   必须小写 ， 默认值是false
 *                              数值型：整型（byte，short，int，long）       
 *                                     byte 字节型 1字节 -128~127
 *                                     short 短整型 2字节 -32768~32767
 *                                     int 整型 4字节 -2147483648~2147483647
 *                                     long 长整形 8字节 -2^63~2^63-1 定义时需要在后面加个L
 *                                   浮点型（float，double）
 *                                     float 单精度浮点型  4个字节  值域为-3.403E38~3.403E38 定义时在值的后面加F
 *                                     double 双精度浮点型 8个字节  值域为-1.798E308~1.798E308
 *                    2.引用数据类型
 *                    3.类型转换： 强制显示类型转换
 *                             自动隐式类型转换
 *                             *当小范围赋值转换给大范围的时候  --自动转
 *                              当大范围给小范围转时 --强制转     
 *                             byte
 *                             short → int → long → float →double
 *                             char                       
 */
public class Test20210106part201 {
	public static void main(String[] args){
  	  /*
  	   * 二进制   不是0就是1   满2进1 用0B定义
  	   * 八进制   用0定义
  	   * 十六进制   用0X开头   1~9 A~F（10~15）
  	   */
  	  //二进制转换为十进制   加权法
  	  //自动转换为十进制
  	  int two = 0B0111;
  	  System.out.println(two);
  	  
  	  int eight = 0140;
  	  System.out.println(eight);
  	 
  	  int sixteen = 0X1F;
  	  System.out.println(sixteen);
  	  //八进制转换成二进制（每位拆3位）
  	  //十六进制转换成二进制（每位拆4位）
  	  
  	  float f = 10.0F;
  	  System.out.println(f);
  	  
  	  double d = 10.011;
  	  System.out.println(d);
  	  
  	  System.out.println(Integer.toBinaryString(10));//十进制转换成二进制
  	  System.out.println(Integer.toOctalString(16));//十进制转换成八进制
  	  System.out.println(Integer.toHexString(100));//十进制转换成十六进制
  	  
  	  //自动补全返回值   ：光标放在后面按住 Ctrl+1自动补齐
  	  String hexString = Integer.toHexString(100);
  	  System.out.println(hexString);
  	  
  	  //布尔型
  	  boolean b1=true;
  	  boolean b11=false;
  	  System.out.println(b1);
  	  
  	  //字符型
  	  //Unicode码
  	  char c ='\u0041';
  	  System.out.println(c);
  	  
  	  //转义字符
  	  char c1 ='\'';
  	  System.out.println(c1);
  	  char c2 ='\\';
  	  System.out.println(c2);
  	  
    }
}
