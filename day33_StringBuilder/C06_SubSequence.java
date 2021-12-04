package day33_StringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");

		System.out.println(sb.substring(14));//kolay indexlerdeki degeri verdi
		System.out.println(sb.substring(14, 19)); //kolay indexlerdeki degeri verdi
		
		// substring string oldugu icin metodlari kullanabiliriz ancak immutable olur
		
		System.out.println(sb); //Java ne kadar kolay
		sb.subSequence(14, 19);// ikisi de ayni sonucu dondurur substring string class tan geldigi icin
		// arkasindan String methodlari kullanabilirim, ancak subSquens te bu olmaz
		
	}

}
