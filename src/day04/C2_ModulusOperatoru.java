package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operatoru bolme isleminde kalani verir
		//15 tek mi cift mi ? 15/2 kalan=1 oldugu icin tektir
		//25 3 e bolunur mu ? 25/3 kalan 1 oldugu icin bolunmez
		//herhangi bi sayinin 7 ile bolumunu kontrol etmek icin 
		//modulus islemi kullaniriz
		
		
		int kalan=15%4;
		System.out.println(kalan);
		
		System.out.println(26 % 8);
		
		//856 sayisinin birler basamagi kactir ?
		//bunun icin birler basamagindan kurtulmam gerekir
		//sayiyi 10 a bolerim
		
		int sayi=856;
		
		
		int birlerBasamagi = 856 %10;
		
		System.out.println("sayinin birler basamagi : "+ birlerBasamagi);
		
		//856 sayisinin onlar basamagi kactir?
		
		//100 ler basamagini bulmam icin yine ayni islemi yaparim
		// 10 a bolerim
		
		sayi/=10;
		
		System.out.println("on a bolundukten sonra sayinin degeri: " + sayi);
		
		int onlarBasamagi = sayi%10;
		System.out.println("Onlar basamagi: "+ onlarBasamagi);
		
		sayi/=10;
		System.out.println("2. defa 10 a bolundukten sonra: "+ sayi);
		
		
	

	}

}
