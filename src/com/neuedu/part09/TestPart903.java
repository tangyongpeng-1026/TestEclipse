package com.neuedu.part09;

import java.util.Calendar;

public class TestPart903 {

	public static void main(String[] args) {
		// 输出当前月的月历
		System.out.println("星期一  "+"星期二  "+"星期三  "+"星期四  "+"星期五  "+"星期六  "+"星期日  ");
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 1);
		int start = c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.print("                    ");
		for(int i=1;i<=31;i++){
			if(i<10){
				System.out.print(" "+i+"   ");
			}
			else{
				System.out.print(i+"   ");
			}
			if((start+i-1)%7==0){
				System.out.println();
			}
		
		}

	}

}
