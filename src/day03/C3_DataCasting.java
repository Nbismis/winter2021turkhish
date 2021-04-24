package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri turunden bir degisken olusturup deger atayin
		// olusturulan variable i adima adim AUTO Widening ile genisletip yazdirin
		
		byte numByte = 45;
		
		System.out.println("byte degisken degeri : " + numByte);
		
		//short yapalim
		
		short numShort = numByte;
		
		System.out.println("short degisken degeri : " + numShort);
		
		int numInt = numShort; 
		
		System.out.println("int degiskenin degeri : " + numInt);
		
		float numFloat = numInt;
		
		System.out.println("float degiskeninin degeri : " + numFloat);
		
		double numDouble = numFloat;
		
		System.out.println("double degisken degeri : " + numDouble);
		
		
		
		
		
		

	}

}
