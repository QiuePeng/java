package com.paul.hw2;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("輸入正整數 :");
		int num = sca.nextInt();
		
		for (int a = 1 ; a <= num ; a++) {
			if (num % a ==0) {
				System.out.println( num + "的因數 : " + a);
			}
		}
	}

}
