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


	public void shuaKa(double money){//参数是消费的钱

	}
	
}

class debit extends BankCard{

	public debit(double money) {
		super(money);	
	}

	@Override
	public void shuaKa(double money) {
		if(getMoney()-money<0){
			System.out.println("余额不足");
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("消费成功，余额为"+getMoney());
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
			System.out.println("您已透支消费，欠款为"+getMoney());
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("消费成功，余额为"+getMoney());
		}
		
	}

}

