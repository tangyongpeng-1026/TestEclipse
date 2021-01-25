package com.neuedu.part07;

import java.util.Random;
import java.util.Scanner;

public class TestCompany {



	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("�����뵱ǰ�·�");
		int nextInt = scanner.nextInt();
	
		ColaEmployee[] colaEmployees =new ColaEmployee[10];
		Random random =new Random();
		for(int i=0;i<colaEmployees.length;i++){
			int j = random.nextInt(3);
	        colaEmployees[i]=getSalary(j);
	
		}
		
		for(ColaEmployee item:colaEmployees){
			System.out.println("    ����   "+item.getName()+"   �����·�Ϊ   "+item.getMonth()+"     ��нΪ   "+item.allSal());
		}

	}




public static ColaEmployee getSalary(int type){

	if(type == 0){		
			return new SalariedEmployee(7000, "zs", 10);		
	}
	else if(type ==1){
			return new HourlyEmployee(100, 80, "ls", 8);
	}
	else{		
		return new SalesEmployee(100000, 0.3, "yy", 3);
	}
	
  }
}