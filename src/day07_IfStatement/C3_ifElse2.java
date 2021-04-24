package day07_IfStatement;

import java.util.Scanner;

public class C3_ifElse2 {

	public static void main(String[] args) {

		
	// Kullanicidan bir karakter girmesini isteyin
	// harf olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if((karakter >='a' && karakter<='z') || (karakter >='A' && karakter<='Z')) {
			
			System.out.println("girdiginiz karakter harf");
			
		}    else { 
			
			System.out.println("girdiginiz karakter harf degil");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
