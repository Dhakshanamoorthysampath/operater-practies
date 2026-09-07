package com.twetterAccount;
import java.util.Scanner;
public class CreateTwetterAccount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value");
		if(scanner.nextInt()>18) {
			
			System.out.println("elagible for vote");
		}else if(scanner.nextInt()<18) {
			System.out.println("not elagible fo vote");
		}else {
			System.out.println("elagible for 18 above persone only");
		}
	}
}
