package com.neuedu.part07;

/**
 * 
 * �������ĸ߼����ԣ��̳У���װ����̬
 * 1.�̳�
 * ����̳и��࣬���Լ̳и��ࣨ���ࣩ�����Ժͷ�����һ���������ࣨ�����ࣩ�¹�����չ��
 * һ����ֻ�ܼ̳�һ�����࣬һ����������ж������
 * 
 * extends�ؼ���
 * д��������������дextends����д������
 * 
 * ����ʵ����ʱ�����ȵ��ø���Ĺ��췽������ʵ�������ٵ��������Լ��Ĺ��췽��
 * 
 * super�ؼ���
 * ������ǰ����ĸ������
 * super() �������Ǹ��๹�췽��  ��Ҫ�������๹�췽���ĵ�һ��   ���ܺ�this()ͬʱ����
 *
 * ���ԣ�����ʵ����˳��
 * 
 * 
 * �������������ȫ����
 * com.neuedu.part07.TestPart701
 * import ����İ���������
 * ע�⣺
 * 1.java.lang���µ��಻��Ҫ���룬����ֱ��ʹ��
 * 2.ֻ�ܵ�����������public��
 * 
 * ����Ȩ�����η���(��Χ�ɴ�С)
 * public ������ ��Χ��󣬶�����ʹ�ã�Ҳ����������
 * protected ���ڵ�ǰ���ͬһ���е������ʹ�ã��������ڲ�ͬ���е�����ʹ�ã������������Ժͷ���
 * default Ĭ�ϵ�  ֻ���ڵ�ǰ���ͬһ���е������ʹ�ã���д���η��������
 * private ˽�е�  ֻ���ڵ�ǰ��ʹ�ã�ͨ��������������
 * 
 * ��ֻ���� public���� ���� ��д��Ĭ�ϣ�
 * 
 * ����������
 * �������Ե�˽�л�����Ҫ�ض��ṩ��ȡ�͸�ֵ�ķ�ʽ�������ַ�����Ϊ����������
 * ��ȡ getter
 * public ����ֵ����    get������(){ return ������; }
 * ��ֵ setter
 * public void  set������(�������� ����ֵ){ ������ = ����ֵ; }
 * 
 * �Զ������������ķ�ʽ��
 * ��ָ�����࣬�Ҽ����source�� ѡ��Generate getterssetters ��ѡ����Ҫ���������ԣ�Ȼ��ȷ��
 * 
 * �������ĸ��ǣ��ֽ���д��
 *  ������д����ķ�����������
 *  ���ǵĹ���
 *  1.��Ҫ����ͬ�ķ�����
 *  2.��Ҫ����ȫһ�µĲ����������������������ͣ�����˳��
 *  3.����ֵ������ͬ
 *  4.���౻���Ƿ���Ȩ��С�ڵ������෽��
 *  
 *  �����⣺�������غͷ������ǵ�����
 *  ����ʱͬһ���е�ˮƽ��ϵ�������Ǹ������еĴ�ֱ��ϵ
 *  �ֱ�������صĹ���͸��ǵĹ���
 *  
 *  ������������ת��
 *  1.����ת��
 *  ����ת���ɸ��࣬�Զ�ת��
 *  ��Ҫ���Ӹ���̳й�ϵ��ת��֮��ᶪʧ������չ�����Ժ���Ϊ
 *  2.����ת��
 *  ������ʾ��ת�������࣬ǿ��ת��
 *  ֻ�о���������ת�ͣ���������ת��
 *  
 *  instanceof�ؼ���
 *  �ж�����ת�ͺ�Ķ��� �����ĸ���
 *  
 *  �Ҽ�ѡQualified Name������ȫ����
 *  com.neuedu.part07.TestPart701
 *  
 */


public class TestPart701 {

	public static void main(String[] args) {
		
	}

}


class Employee{
	private String name;
	private String birth;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getSalary(){//��ȡgetter����
		return salary;
	}
	
	public void setSalary(double salary){//����setter����
		this.salary=salary;
	}
	
	
	
	
	
	
}