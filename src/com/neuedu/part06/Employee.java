package com.neuedu.part06;



/**
 * 
 * ְ����
 *
 */

public class Employee {
	
	//��д���ԣ�������
	String name;
	int age;
	double sal;
	
	//���췽��
	public Employee(){
		
	}

	
	
	
	//��д��Ϊ��������
	public String showName(){//��ȡ����
		System.out.println("Ա������Ϊ"+name);
		return name;
	}
	
	/**
	 * ��ȡ���
	 * @param Ϊ��
	 * @return age ����
	 */
	public int showAge(){//��ȡ����
		System.out.println("Ա������Ϊ"+age);
		return age;
	}
	
	/**
	 * �޸�����
	 * @param _name Ԥ���޸ĵ�����
	 */
	public void updateName(String _name){//�޸�����
		name = _name;
	}
	
	/**
	 * ��ȡ����
	 * @return sal
	 */
	public double getSal(){//��ȡ����
		System.out.println("Ա������Ϊ"+sal);
		return sal;
	}
	
	

}
