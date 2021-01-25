package com.neuedu.part11;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件与流
 * java.io包
 * 1.文件
 *  File类 提供一个指定文件全路径的构造方法，用来创建对应文件引用，用来操作文件内容
 *  new File(String pathname)  全路径
 *  new File(URL url) 文件url 
 *  new File(String parent, String child) 根据路径的关系定义
 *  
 *  createNewFile() 创建文件
 *  exists() 判断文件是否存在
 *  delete() 删除文件
 *  mkdirs() 创建文件夹
 * 
 * \ （反斜杠）和 / 的区别？
 * \ 是windows系统的文件路径
 * / 是linux系统的文件路径
 * 
 * 不同系统的斜杠适配问题
 * file.separator
 * 
 * 2.流
 * 根据传输方向的不同，分为：输入流，输出流
 * 根据传输类型的不同，分为：字符流，字节流
 * 根据传输功能的不同，分为：节点流，处理流
 * 
 * 字节流
 *     节点流
 *         输入流      FileInputStream in available(获取数组长度)  
 *               read() 一次读一个字节，没有东西可读返回-1   
 *               read(byte[]) 一次读多个字节
 *               read(byte[in.available()]) 一次读全部内容
 *         输出流      FileOutputStream out
 *               write() 一次写一个字节
 *               write(byte[]) 一次写多个字节
 *     处理流 （是基于节点流使用的，构造函数中需要传入一个节点流对应的对象） 
 *        特点是：新增了一个缓冲区的功能，需要把内容调用flush()方法写入        
 *         输入流      BufferedInputStream
 *         输出流      BufferedOutputStream 
 * 字符流（不能读图
 * ）
 *     节点流
 *         输入流      FileReader
 *         输出流      FileWriter 字符流需要把内容调用flush()方法刷一下   
 *     处理流    
 *         输入流      BufferedReader   readLine() 一次读一行
 *         输出流      BufferedWriter    
        
 * 输入流输出需要转型成char型才能输出，不然是输出Unicode
 * 流在使用完毕后必须close
 * 通常输入流，输出流用于文件复制
 * 对象序列化
 *       objectInputStream
 *       objectOutputStream
 */

public class TestPart1101 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	        
		File file = new File("D:/1JAVA学习/java安装包相关/sts-bundle/sts-3.8.4.RELEASE/workspace/aaa.txt");
		File file2 = new File("D:/1JAVA学习/java安装包相关/sts-bundle/sts-3.8.4.RELEASE/workspace/bbb.txt");
		
		System.out.println(file.separator);
		
		FileInputStream fileInputStream =null;
		FileInputStream fileInputStream2 =null;
		
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			fileInputStream =new FileInputStream(file);
			fileInputStream2 = new FileInputStream(file2);
			int available = fileInputStream.available();
			byte[] bt = new byte[available];
			int read = fileInputStream.read(bt);
			while(read != -1){
				for(byte item:bt){
					System.out.print((char)item);//需要转换成char型才能输出
				}
		     read = fileInputStream.read(bt);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
