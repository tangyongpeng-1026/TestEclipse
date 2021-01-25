package com.neuedu.part07;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		//����һ������
		Student[] students =new  Student[5] ;
		Random random =new Random();
		for(int i=0;i<students.length;i++){
			//�������������̬��ȡѧ������
			students[i]= getStudentAllInfo(random.nextInt(3));
		}
		
		for(Student item:students){
			System.out.println("ѧ��Ϊ"+item.getStuNo()+"  ����Ϊ"+item.getName()+"  �Ա�Ϊ"+item.getSex()+"  ����Ϊ"+item.getAge()+"  �ۺϳɼ�Ϊ"+item.allScore());
		}

	}
	
	public static   Student getStudentAllInfo(int type){
		if(type==0){
			return new English(100, 80, 70, 1001, "����", '��', 18);
		}
		else if(type==1){
			return new Computer(80, 70, 100, 90, 1002, "С��",'Ů', 19);
		}
		else {
			return new Chinese(60, 70, 30, 50, 1003, "����", '��', 20);
		}
		
	}
	
	
}
