package demo;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class TestExams {

	public static void main(String[] args) {

		//1.定义一个单词数组（字符串数组）
		String[] words = {"Mississippi"};

		//2.随机获取一个单词，随机一个下标（下标值在0-数组长度之间）

		Random random =new Random();
		int nRandomIndex = random.nextInt(words.length); //定义words数组的随机下标：nRandomIndex
		String strWordChoose = words[nRandomIndex]; //定义words数组的随机下标对应的单词：（这里用strWordChoose字符串表示）
		
		//3.得到单词长度len，创建一个长度为len的字符数组word，数组元素初值均为-
		int nLen = strWordChoose.length(); //定义一个单词的长度：nLen
		char[] wordShow= new char[nLen]; //建立一个字符串型数组，数组长度为之前选的单词的长度
		for(int i=0;i<nLen;i++){
			wordShow[i]='-';
		}
		//4.循环以下步骤（退出循环的条件为，用户允许猜错的次数<=0或者word字符数组中不在包含-字符）
		int nGuessTimes = 5;
		while(nGuessTimes>0 && isContaisChar(wordShow,'-')){
			//5.输出word到屏幕
			System.out.println(wordShow);
			//6.获取客户输入，并判断随机选出的单词是否包含用户输入的字符
			Scanner scanner =new Scanner(System.in);
			String c = scanner.nextLine();
			//7.若包含，得到字符在单词中出现的位置，并将该位置的字符替换成用户输入的字符，并返回到4
			
			
			
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
