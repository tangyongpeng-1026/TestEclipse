package demo;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class TestExams {

	public static void main(String[] args) {

		//1.����һ���������飨�ַ������飩
		String[] words = {"Mississippi"};

		//2.�����ȡһ�����ʣ����һ���±꣨�±�ֵ��0-���鳤��֮�䣩

		Random random =new Random();
		int nRandomIndex = random.nextInt(words.length); //����words���������±꣺nRandomIndex
		String strWordChoose = words[nRandomIndex]; //����words���������±��Ӧ�ĵ��ʣ���������strWordChoose�ַ�����ʾ��
		
		//3.�õ����ʳ���len������һ������Ϊlen���ַ�����word������Ԫ�س�ֵ��Ϊ-
		int nLen = strWordChoose.length(); //����һ�����ʵĳ��ȣ�nLen
		char[] wordShow= new char[nLen]; //����һ���ַ��������飬���鳤��Ϊ֮ǰѡ�ĵ��ʵĳ���
		for(int i=0;i<nLen;i++){
			wordShow[i]='-';
		}
		//4.ѭ�����²��裨�˳�ѭ��������Ϊ���û�����´�Ĵ���<=0����word�ַ������в��ڰ���-�ַ���
		int nGuessTimes = 5;
		while(nGuessTimes>0 && isContaisChar(wordShow,'-')){
			//5.���word����Ļ
			System.out.println(wordShow);
			//6.��ȡ�ͻ����룬���ж����ѡ���ĵ����Ƿ�����û�������ַ�
			Scanner scanner =new Scanner(System.in);
			String c = scanner.nextLine();
			//7.���������õ��ַ��ڵ����г��ֵ�λ�ã�������λ�õ��ַ��滻���û�������ַ��������ص�4
			
			
			
		}
                
	}

	
	
	public static boolean isContaisChar(char[] array, char c) {
		
		boolean bFind = false;
		for(int i=0;i<array.length;i++){
			if(array[i] == c){
				bFind = true;
				break;
			}
		}
		return bFind;
		
		
	}

}
