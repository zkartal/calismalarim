package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {


		StringBuilder sb1= new StringBuilder("Java");
		StringBuilder sb2= new StringBuilder("Java");
		

		System.out.println(sb1==sb2);   // false
		System.out.println(sb1.equals(sb2));  // false
		
		// StringBuilder de equals methodu String deki mantik ile calismaz, == mantigi ile calisir
		
		System.out.println(sb1.compareTo(sb2)); //  0 CompareTo karsilastirma methodu dur 
		// ilk harflerden baslayarak bire bir sb'leri karsilastirir. Eger tum karakterler ayni ise sonuc 0 doner
		// Farkli karakterler bulursa ilk yazilan sb, ikinci sb den kac char onde onu doner
		
		// eger iki sb nin esit olup olmadigini anlamak istersek
		// if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str= "Java";
		
		// System.out.println(sb1==str); == sb ile Stringi karsilastiramaz
		
		System.out.println(sb1.equals(str)); // false
		
	//	System.out.println(sb1.compareTo(str));  string icin uygun method degil
		
		//  System.out.println(sb1=="Java"); uygun degil
		
		System.out.println(sb1.equals("Java")); // false
		
		//  System.out.println(sb1.compareTo("Java")); 
		
		
		
		
		
		
		
		
	}

}
