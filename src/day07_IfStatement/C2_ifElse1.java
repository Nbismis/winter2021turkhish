package day07_IfStatement;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {

		
		// kullanicidan dikdortgenin kenar uzunluklarini alin
		// uzunluklar esitse kare degilse kare degil yazdirin
		
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen kenar uzunlugu giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if(kenar1==kenar2) {
			
			System.out.println("KARE");
		}
		
		
		else {
			
			System.out.println("KARE degil");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
