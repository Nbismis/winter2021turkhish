package Deneme;

import java.util.Scanner;

public class Deneme_C2 {

	public static void main(String[] args) {
		
		// kullanicidan bir sayi alin ve
		// sayi 3 basamakli ise "uc basamakli sayi" , yoksa
		// "uc basamakli degil" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		String sonuc = sayi>=100 ? (sayi<1000 ? "uc basamakli" : "uc basamakli degil"): "uc basamakli degil";
		
		System.out.println(sonuc);
		
		String sonuc2 = sayi>=100 && sayi<1000 || sayi<= -100 && sayi>-100 ? "uc basamakli" : "uc basamakli degil";

		System.out.println(sonuc2);
	}

}
