package com.neuedu.part07;

public class TestPlayers {

	public static void main(String[] args) {
		
		
		while(true){
			Players player = Players.createNewPlayer();
			if(player == null){
				System.out.println("�Բ����Ѿ�������"+Players.getNum()+"����Ա����");
				break;
			}
			else{
				System.out.println("�����˵�"+Players.getCount()+"����Ա����");
			}
		}
		

	}

}





