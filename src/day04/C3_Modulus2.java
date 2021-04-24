package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		
		//kullanicidan 4 masamaklı bir sayi alalım ve
		//sayinin basamaklarını ters sıradan yazdiralım
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("basamaklarını bulmak için 4 basamaklı bir sayi giriniz.");
		
		int sayi= scan.nextInt();
		
		// 4 basamagi elde etmek için işlemleri 4 kere tekrar ediyoruz
		// 1. islem 
		
		int birlerBas = sayi%10;
		sayi/=10;  // bu satırdan iti baren sayimiz 3 basamaklı kaldı çünkü bölme işlemi ile 4. basamagi yok ettik
		
		// onlar basamagını bulmak için 2. kere tekrar ediyoruz
		
		int onlarBas = sayi% 10;
		
		sayi/=10;  // bu basamaktan itibaren sayimiz 2 basamaklı kaldı
		
		int yuzlerBas = sayi%10;
		sayi/=10; //sayimiz bu satırdan itibaren tek basamaklı
		
		
		
		
		// artık tüm basamaklar var
		
		
		System.out.println("Birler basamagi: " + birlerBas);
		System.out.println("Onlar basamagi: " + onlarBas);
		System.out.println("Yuzler basamagi: " + yuzlerBas);
		
		
		//sayiyi tersten yazdiralım
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		
		System.out.println();
		
		//sayinin rakam toplamları bulalım
		
		System.out.print(birlerBas+onlarBas+yuzlerBas);
		
		//rakamalrı toplamı değilde yanyana yazdıralım
		
		System.out.println("yazdıgınız sayının ters yazımı: "+birlerBas+onlarBas+yuzlerBas);
		
		
		
		
		
		
		
	

		

	}

}
