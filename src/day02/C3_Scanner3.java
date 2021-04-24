package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// Kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakarak
		// isim ve soyismi yazdirin

		// Mehmet , Bulutluoz => Mehmet Bulutluoz
		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("lutfen isminizi girin");
		
		String name= scan.nextLine(); // Sadece next secilirse sadece ilk kelimeyi alir
		                        // eger kullanicinin girdigi tum yaziyi almak istersek NextLine secmeliyiz
		
		System.out.println("lutfen soyisminizi girin");
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);
		
		
         scan.close();
		
		
		
		
	}

}

