package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// Verilen sayilari toplayan bir method oluaturmak istiyorum
		//
		

		
		int a =20;
		int b =10;
		int c = 30;
		int d = 30;
		int e = 40;
		int f = 50;
		
		topla (a,b);  	// Iki sayinin toplami :30 
		topla (a,b,c);
		topla (a,b,c,d);  // Varargs calisir
		topla (a,b,c,d,e); // Varargs calisir
		topla (a,b,c,d,e,f); // Varargs calisir
	  
		
		// su ana kadar ogrendiklerimiz le degisken sayida parametreli tek bir method olusturamayiz
		// 
		
	}

	private static void topla(int...a) {
		System.out.println("varargs calisir " );
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("Uc sayinin toplami : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		System.out.println("Iki sayinin toplami : " + (a+b));
		
	}

}
