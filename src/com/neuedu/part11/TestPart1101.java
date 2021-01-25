package com.neuedu.part11;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * �ļ�����
 * java.io��
 * 1.�ļ�
 *  File�� �ṩһ��ָ���ļ�ȫ·���Ĺ��췽��������������Ӧ�ļ����ã����������ļ�����
 *  new File(String pathname)  ȫ·��
 *  new File(URL url) �ļ�url 
 *  new File(String parent, String child) ����·���Ĺ�ϵ����
 *  
 *  createNewFile() �����ļ�
 *  exists() �ж��ļ��Ƿ����
 *  delete() ɾ���ļ�
 *  mkdirs() �����ļ���
 * 
 * \ ����б�ܣ��� / ������
 * \ ��windowsϵͳ���ļ�·��
 * / ��linuxϵͳ���ļ�·��
 * 
 * ��ͬϵͳ��б����������
 * file.separator
 * 
 * 2.��
 * ���ݴ��䷽��Ĳ�ͬ����Ϊ���������������
 * ���ݴ������͵Ĳ�ͬ����Ϊ���ַ������ֽ���
 * ���ݴ��书�ܵĲ�ͬ����Ϊ���ڵ�����������
 * 
 * �ֽ���
 *     �ڵ���
 *         ������      FileInputStream in available(��ȡ���鳤��)  
 *               read() һ�ζ�һ���ֽڣ�û�ж����ɶ�����-1   
 *               read(byte[]) һ�ζ�����ֽ�
 *               read(byte[in.available()]) һ�ζ�ȫ������
 *         �����      FileOutputStream out
 *               write() һ��дһ���ֽ�
 *               write(byte[]) һ��д����ֽ�
 *     ������ ���ǻ��ڽڵ���ʹ�õģ����캯������Ҫ����һ���ڵ�����Ӧ�Ķ��� 
 *        �ص��ǣ�������һ���������Ĺ��ܣ���Ҫ�����ݵ���flush()����д��        
 *         ������      BufferedInputStream
 *         �����      BufferedOutputStream 
 * �ַ��������ܶ�ͼ
 * ��
 *     �ڵ���
 *         ������      FileReader
 *         �����      FileWriter �ַ�����Ҫ�����ݵ���flush()����ˢһ��   
 *     ������    
 *         ������      BufferedReader   readLine() һ�ζ�һ��
 *         �����      BufferedWriter    
        
 * �����������Ҫת�ͳ�char�Ͳ����������Ȼ�����Unicode
 * ����ʹ����Ϻ����close
 * ͨ��������������������ļ�����
 * �������л�
 *       objectInputStream
 *       objectOutputStream
 */

public class TestPart1101 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	        
		File file = new File("D:/1JAVAѧϰ/java��װ�����/sts-bundle/sts-3.8.4.RELEASE/workspace/aaa.txt");
		File file2 = new File("D:/1JAVAѧϰ/java��װ�����/sts-bundle/sts-3.8.4.RELEASE/workspace/bbb.txt");
		
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
					System.out.print((char)item);//��Ҫת����char�Ͳ������
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
