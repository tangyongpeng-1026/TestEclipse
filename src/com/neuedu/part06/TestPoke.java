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
			String[] color = {"����","����","��Ƭ","�ݻ�"};
            for (i=0; i < color.length; i++){
            	for(j=0;j<numbers.length;j++){
            		array[i*13+j]=new Poke(species[i], number[j]);
            		System.out.print(array[i*13+j]+" ");
            	}
            }
            */
		   
		
		    //��ʦ����
		    //4���� "����","����","��Ƭ","�ݻ�"
		    //A---K"A","2","3","4","5","6","7","8","9","10","J","Q","K"
		    Poke[] cardarr = new Poke[52];
		    String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			String[] color = {"����","����","��Ƭ","�ݻ�"};
			//��������
			for (int i=0; i < color.length; i++){
            	for(int j=0;j<numbers.length;j++){
            		//��A���1��J���11��Q���12��K���13
            		String nums=numbers[j];
            		int count =0;
            		if("A".equals(nums)){//�ַ����Ƚ���equals
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
            			count =Integer.parseInt(nums);//�ַ���ת����int
            		}
            		
            		cardarr[i*13+j]=new Poke(color[i], nums,count);
            	}
            }
			
			for(Poke item:cardarr){
				System.out.print(item.species+" "+item.number+"  ");
			}
			System.out.println();
			
			//ϴ��
			Random r =new Random();
			
			int count=0;//���д���
			while(true){
				count++;
				
				for(int i=0;i<100;i++){//����ϴ��100��
				//�����м���󣬺����һ�Ž���
				int nextInt = r.nextInt(52);
				Poke tempCard = cardarr[nextInt];
				cardarr[nextInt]=cardarr[cardarr.length-1];
				cardarr[cardarr.length-1]=tempCard;
			}
			for(Poke item:cardarr){
				System.out.print(item.species+" "+item.number+"  ");
			}
			
			System.out.println();//������
			//�ж�ǰ�����ǲ���ͬ��˳
			//�����ж�ͬ��
			if(cardarr[0].species.equals(cardarr[1].species) && cardarr[0].species.equals(cardarr[2].species)){
				//�����ͬ��
				int[] arr1 ={cardarr[0].count,cardarr[1].count,cardarr[2].count};
				//ð������(��С��������)
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
				if(arr1[1]-arr1[0] == 1 && arr1[2]-arr1[1] == 1){//��ʱ��ͬ��˳
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("��ͬ��˳");
					break;
				}
				else if( arr1[1]==12  && arr1[2]==13 && arr1[0]==1){//��ʱ��QKA��Ҳ��ͬ��˳
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("��ͬ��˳");
					break;
				}
				else{
					System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
					System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
					System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
					System.out.println("����ͬ��˳");
				}
				
			}
			else{
				//�������ͬ��
				System.out.print(cardarr[0].species+" "+cardarr[0].number+"  ");
				System.out.print(cardarr[1].species+" "+cardarr[1].number+"  ");
				System.out.print(cardarr[2].species+" "+cardarr[2].number+"  ");
				System.out.println("����ͬ��˳");
			}
			
		}
		
			System.out.println("��"+count+"����ͬ��˳");
		
		
		
		
     }
}