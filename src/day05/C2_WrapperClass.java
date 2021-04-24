package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		// java da 2 tur data tipi vardir. primite ve non-primite
		//primitiler value (deger icerir)
		// non primitivler deger ve metod icerir
		
		
		String isim = "mehmet";
		
		System.out.println(isim.toUpperCase());
		
		// Wrapper Class : Javanin primitive data turleri ile bazi methodlari kullanabilmemiz icin olusturdugu Classlardir
		
		// boolean, char, byte, short, int, long, float, double
		
		
		byte sayi=10;
		
		Byte sayi2=11;  // ismen primitive data turu ile olan non-primitive datalara wrapper denir
		
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE; 
		
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		
		System.out.println(byteMaxSayi);
		
		// variable olusturmadan direkt olarak shortun en kucuk en buyukdegerleri
		
		
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		// Boolean Character Byte Short Integer Long Float Double
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
