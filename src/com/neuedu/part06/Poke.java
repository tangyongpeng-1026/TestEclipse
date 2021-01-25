package com.neuedu.part06;

import org.w3c.dom.html.HTMLIsIndexElement;

/**
 * 
 * //作业：创建一个扑克牌类（花色和值），不算大小王 
   //1.放数组中52张牌 
   //2.洗牌乱序 
   //3.判断洗牌后的前三张是否是同花顺 
   //4.求第一次出现同花顺时，一共洗了多少次牌
 * 
 * 
 * 
 * 
 *
 */
public class Poke {
	
	//先写属性（变量）
		String species;//这是花色
		String number;//这是值
		int count;
		
	//构造方法
		public Poke(String species,String number,int count){
			this.species=species;
			this.number=number;
			this.count=count;
		}
		
		
}




