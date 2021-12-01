package day30_immutableClasse;

public class C03_DoubleEqual {

	public static void main(String[] args) {


		String str1 ="Mustafa";
		String str2 ="Mustafa";
		
		String str3 =new String("Mustafa");
		String str4 =new String("Mustafa");
		
		System.out.println(str1==str3); // false  Hem referansi hemde degeri kontrol ediyor ondenle false
		System.out.println(str1.equals(str3)); //true equalse ise sadece degeri kontrol ediyor  o nedenle true dondurur
		
		System.out.println(str4==str3); // false  Hem referansi hemde degeri kontrol ediyor ondenle false
		System.out.println(str4.equals(str3)); //true equalse ise sadece degeri kontrol ediyor  o nedenle true dondurur
		
		
		System.out.println(str1==str2);// true

	}

}
