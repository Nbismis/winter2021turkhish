package day01;

public class C2_Variables {
	
	
	public static void main (String[ ] args) {
		
		
		
		
		
		
		int sayi; // ; yazim dilindeki . gibidir. Java noktali virgulu gorunce o satirdaki kod yazimi bittiginni sayar
		sayi=27;
		
		
		
		System.out.print(sayi); //eger println degil de print yazarsak yazdirma isleminden 
		                       //sonra alt satira gecmez
		                       //
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); // println yazinca yazma islemiden sonra alt satira gecer
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
	System.out.println(sayi + sayiDouble); //32.34
	
	System.out.println(sayi + ilkHarf); //27+77=104 
	                                    //eger bir toplama isleminde char degisken kullanilirsa karakterin ascii degeri ile toplama yapar
		
		
	}

}
