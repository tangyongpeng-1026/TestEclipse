package com.neuedu.part07;

public class TestPlayers {

	public static void main(String[] args) {
		
		
		while(true){
			Players player = Players.createNewPlayer();
			if(player == null){
				System.out.println("对不起，已经创建了"+Players.getNum()+"个球员对象");
				break;
			}
			else{
				System.out.println("创建了第"+Players.getCount()+"个球员对象");
			}
		}
		

	}

}





