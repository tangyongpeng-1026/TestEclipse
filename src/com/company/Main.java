package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Company company = new Company();
        //���Ա��
        company.addEmp(11,"zhangsan",20,'��');
        company.addEmp(22,"lisi",22,'��');
        company.addEmp(33,"lili",24,'Ů');
        company.addEmp(44,"fsw",28,'��');
        //��ʾԱ����Ϣ
        company.showEmp();
        Scanner sc = new Scanner(System.in);
        System.out.println("������ɾ��Ա����Ϣ!����");
        int empNum = sc.nextInt();
        String s = sc.nextLine();
        //ɾ��Ա���ķ���
        company.deleteEmp(empNum);
        //��ʾɾ�����Ա����Ϣ
        company.showEmp();
        System.out.println("�������ѯԱ����Ϣ�Ĺ���:");
        int id = sc.nextInt();
        String a = sc.nextLine();
        company.selectEmp(id);
        int input = 0;
        do{
            System.out.println("Ա������ϵͳ");
            System.out.println("0-------------exit");
            System.out.println("1-------------ǩ��");
            System.out.println("2-------------ǩ��");
            System.out.println("3-------------��ʾ������Ϣ");
            input = sc.nextInt();
            String c = sc.nextLine();
            switch (input){
                case 1:
                    company.qiandao();
                    break;
                case 2:
                    company.qiantui();
                    break;
                case 3:
                    company.showAttendence();
                    break;
                default:
                    break;
            }
        }while(input!=0);

	}

}
