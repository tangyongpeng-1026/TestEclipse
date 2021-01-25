package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Company company = new Company();
        //添加员工
        company.addEmp(11,"zhangsan",20,'男');
        company.addEmp(22,"lisi",22,'男');
        company.addEmp(33,"lili",24,'女');
        company.addEmp(44,"fsw",28,'男');
        //显示员工信息
        company.showEmp();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除员工信息!工号");
        int empNum = sc.nextInt();
        String s = sc.nextLine();
        //删除员工的方法
        company.deleteEmp(empNum);
        //显示删除后的员工信息
        company.showEmp();
        System.out.println("请输入查询员工信息的工号:");
        int id = sc.nextInt();
        String a = sc.nextLine();
        company.selectEmp(id);
        int input = 0;
        do{
            System.out.println("员工考勤系统");
            System.out.println("0-------------exit");
            System.out.println("1-------------签到");
            System.out.println("2-------------签退");
            System.out.println("3-------------显示考勤信息");
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
