package com.neuedu.part02;

public class Test20210107work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		
		int a=1,b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);//���Ը���һ���м����
		
		//2. ����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		
		int i=879,i1=i%10+i/10%10+i/100%10+i/1000%10;
		System.out.println(i1);
		
		
		//3.�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
		//x1Ϊ���϶ȣ�x2Ϊ���϶�,x3Ϊת����Ļ��϶ȣ�x4Ϊת��������϶�
		float x1=15F;
		float x2=50F;
		float x3=x2*9/5+32;
		float x4=(x1-32)*5/9;
		System.out.println("ת���Ļ��϶�"+x3);
		System.out.println("ת�������϶�"+x4);
		
		//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		char c='\u0041';
		char c1=(char) (c+32);
		System.out.println(c1);
		   //����
		char n='A';
		int m=n;
		System.out.println((char)(m+32));
		
		
	}

}
