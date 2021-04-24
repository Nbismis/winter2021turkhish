package Deneme;

import java.util.Scanner;

public class deneme12 {

	public static void main(String[] args) {
		
		
		// Hava guzelse Parka gidecegiz
		// hava guzel degilse evde oturacagiz
		// 25 derece ise hava guzeldir
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Hava'nin derecesini yaziniz");
		
		double derece = scan.nextDouble();
		
	
	
	if (derece>=30) {
		
		System.out.println("Hava disari cikmak icin tehlikeli");
		
	} else if(derece>=25 && derece<30) {
		
		System.out.println("Hadi parka gidelim");
	}
	else {
		
		System.out.println("hava soguk evdeyiz");
	}

	}

}
