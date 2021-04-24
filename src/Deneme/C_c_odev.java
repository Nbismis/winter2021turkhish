package Deneme;

import java.util.Scanner;

public class C_c_odev {

	public static void main(String[] args) {
	
		// Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil”
		// yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		if('a' <= harf && 'z'>= harf) {
			
			System.out.println("Kucuk harf");
			
		} else if('A' <= harf && 'Z'>= harf) {
			
		System.out.println("Buyuk Harf");
			
			
		}
		
		else {
			System.out.println("Girdiginiz karakter harf degildir.");
		}
		
		
		
		

	}

}
