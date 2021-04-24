package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		//kullaniicidan bir sayi isteyin ve sayinin cift ve tek sayi oldugunu yazdirsin
		
		Scanner scan=new Scanner(System.in);
				
	    System.out.println("lutfen bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
		// 153 % 2 == 0 sayi cift
		// 153 % 1 == 1 sayi tek
		
		
		if(sayi%2==0) {
			
		System.out.println("girdiginiz sayi cift sayidir");
		}
		
		
		if(sayi%2==1) {
			
			
			System.out.println("girdiginiz sayi tek sayidir");
			
		}
			System.out.println("katildiginiz icin tesekkur ederiz");
			
			scan.close();
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
