package com.neuedu.part07;

import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int nextInt = scanner.nextInt();
		Animal buyAnimal = buyAnimal(nextInt);
		if(buyAnimal != null){
			if(buyAnimal instanceof Cat){
				System.out.println("买到了猫");
				Cat buyAnimal2 = (Cat) buyAnimal;
				buyAnimal2.catCalls();
			}
			else if(buyAnimal instanceof Dog){
				System.out.println("买到了狗");
				Dog buyAnimal3 = (Dog) buyAnimal;
				buyAnimal3.dogCalls();
			}
		}else{
			System.out.println("没买到");
			
		}

	}



//买小动物
public static  Animal buyAnimal(int type){
	if(type == 1){
		return new Cat();
	}
	else if(type ==2){
		return new Dog();
	}
	else{
		return null;
	}
  }
}