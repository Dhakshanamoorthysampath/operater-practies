package com.twetterAccount;
import java.util.Scanner;
public class CreateTwetterAccount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value");
		if(scanner.nextInt()>18) {
			
			System.out.println("elagible for vote");
		}else {
			System.out.println("enelagible fo vote");
		}
	}
}
