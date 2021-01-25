package com.neuedu.part04;

import java.util.Random;
import java.util.Scanner;

public class Testpart404 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String line = scanner.nextLine();
	        scanner.close();
	 
	        int sum = 0;
	        int lastScore = 0; 
	        int score;
	        for(int i = 0; i < line.length(); i++){
	            char ch = line.charAt(i);
	            if(ch == ' ')
	                continue;
	            if(ch == '0')
	                break;
	            score = 1;
	            if(ch == '2'){
	                score = lastScore < 2 ? 2 : lastScore + 2;
	            }
	            sum += score;
	            lastScore = score;
	        }
	 
	        System.out.println(sum);

	}

}
