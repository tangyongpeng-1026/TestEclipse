package com.neuedu.part07;

public class BankCard {

	private double money;
	
	public BankCard(double money){
		this.money=money;
	}
	

	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public void shuaKa(double money){//���������ѵ�Ǯ

	}
	
}

class debit extends BankCard{

	public debit(double money) {
		super(money);	
	}

	@Override
	public void shuaKa(double money) {
		if(getMoney()-money<0){
			System.out.println("����");
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("���ѳɹ������Ϊ"+getMoney());
		}
		
	}

}

class credit extends BankCard{

	public credit(double money) {
		super(money);
	}
	
	@Override
	public void shuaKa(double money) {
		if(getMoney()-money<0){
			setMoney(getMoney()-money);
			System.out.println("����͸֧���ѣ�Ƿ��Ϊ"+getMoney());
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("���ѳɹ������Ϊ"+getMoney());
		}
		
	}

}

