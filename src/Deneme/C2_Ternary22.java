package Deneme;

import java.util.Scanner;

public class C2_Ternary22 {

	public static void main(String[] args) {
		
		//Kullanicidan bir sayi alin
		//sayi cift ise cift yazdirin
		//degilse sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		String sonuc = sayi%2==0 ? "cift" : sayi*sayi + "";
		
		System.out.println(sonuc);
		
	
		

	}

}
