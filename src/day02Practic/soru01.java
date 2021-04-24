package day02Practic;

import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {

		// kullanicidan 3 kelime isteyin ve cümle olarak yazdirip sonuna nokta koyun.

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen 1 kelime giriniz");

		String kelime1 = scan.next();

		System.out.println("lutfen 1 kelime giriniz");

		String kelime2 = scan.next();

		System.out.println("lutfen 1 kelime giriniz");

		String kelime3 = scan.next();
		
		
		System.out.println(kelime1+" "+kelime2+" "+kelime3+".");
		
		scan.close();

	}

}
