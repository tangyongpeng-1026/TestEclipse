package com.neuedu.part06;

import java.awt.CardLayout;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class TestPoke {

	public static void main(String[] args) {
		   /* int i=0;
		    int j=0;
            Poke[] array = new Poke[52];
			String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			String[] color = {"红桃","黑桃","方片","草花"};
            for (i=0; i < color.length; i++){
            	for(j=0;j<numbers.length;j++){
            		array[i*13+j]=new Poke(species[i], number[j]);
            		System.out.print(array[i*13+j]+" ");
            	}
            }
            */
		   
		
		    //老师讲的
		    //4大类 "红桃","黑桃","方片","草花"
		    //A---K"A","2","3","4","5","6","7","8","9","10","J","Q","K"
		    Poke[] cardarr = new Poke[52];
		    String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			String[] color = {"红桃","黑桃","方片","草花"};
			//创建对象
			for (int i=0; i < color.length; i++){
            	for(int j=0;j<numbers.length;j++){
            		//将A变成1，J变成11，Q变成12，K变成13
            		String nums=numbers[j];
            		int count =0;
            		if("A".equals(nums)){//字符串比较用equals
            			count=1;
            		}
            		else if("J".equals(nums)){
            			count=11;
            		}
            		else if("Q".equals(nums)){
            			count=12;
            		}
            		else if("K".equals(nums)){
            			count=13;
            		}
            		else{
            			count =Integer.parseInt(nums);//字符串转换成int
            		}
            		
            		cardarr[i*13+j]=new Poke(color[i], nums,count);
            	}
            }
			
			for(Poke item:cardarr){
				System.out.print(item.species+" "+item.number+"  ");
			}
			System.out.println();
			
			//洗牌
			Random r =new Random();
			
			int count=0;//运行次数
			while(true){
				count++;
				
				for(int i=0;i<100;i++){//控制洗牌100次
				//定义中间对象，和最后一张交换
				int nextInt = r.nextInt(52);
				Poke tempCard = cardarr[nextInt];
				cardarr[nextInt]=cardarr[cardarr.length-1];
				cardarr[cardarr.length-1]=tempCard;
			}
			for(Poke item:cardarr){
				System.out.print(item.species+" "+item.number+"  ");
			}
			
			System.out.println();//换行用
			//判断前三张是不是同花顺
			//首先判断同花
			if(cardarr[0].species.equals(cardarr[1].species) && cardarr[0].species.equals(cardarr[2].species)){
				//如果是同花
				int[] arr1 ={cardarr[0].count,cardarr[1].count,cardarr[2].count};
				//冒泡排序(从小到大排序)
				for(int i=0;i<arr1.length-1;i++){
					for(int j=0;j<arr1.length-i-1;j++){
						if(arr1[i]>arr1[i+1]){
							int temp1;
							temp1=arr1[i];
							arr1[i]=arr1[i+1];
							arr1[i+1]=temp1;
						}
					}
				}
				if(arr1[1]-arr1[0] == 1 && arr1[2]-arr1[1] == 1){//此时是同花顺
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("是同花顺");
					break;
				}
				else if( arr1[1]==12  && arr1[2]==13 && arr1[0]==1){//此时是QKA，也是同花顺
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("是同花顺");
					break;
				}
				else{
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("不是同花顺");
				}
				
			}
			else{
				//如果不是同花
				System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
				System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
				System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
				System.out.println("不是同花顺");
			}
			
		}
		
			System.out.println("第"+count+"次是同花顺");
		
		
		
		
     }
}