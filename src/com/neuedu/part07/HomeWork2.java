package com.neuedu.part07;

/**
 * ��дһ���������������ĳ��������n����С����
 */

public class HomeWork2 {

	public static void main(String[] args) {
		//������һ��������n��Ȼ��n++��Ȼ���жϵõ��������Ƿ�������
		printZuiXiaoZhiShu(20);
		printZuiXiaoZhiShu(50);
		printZuiXiaoZhiShu(100);
		printZuiXiaoZhiShu(200);
		printZuiXiaoZhiShu(1000);
	}
	
	//��������Ǵ�ӡ��С������
	public static void printZuiXiaoZhiShu(int n){
		while (true){
			n++;
			boolean flag =isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}
	
	//����һ��ר�ŵķ����ж�ĳ�������Ƿ�������
	//����������β��ǣ����жϵ�����num
	//��������ķ���ֵ������true��ʾ��������false��ʾ��������
	public static boolean isZhiShu(int num){
		for(int i=2;i<num;i++){
			if(num%i == 0){//����ֻ�ܱ�1����������
				return false;
			}
		}
		return true;
	}

	
	
}
