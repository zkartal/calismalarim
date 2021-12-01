package day30_immutableClasse;

public class C02_Immutable {

	public static void main(String[] args) {


		String str ="Ali";
		
		for (int i = 0; i < 100; i++) {
			
			str+=" ";
			
		}
			// Bu string calistiginda java kac obje olusturur
		// Cevap = Bir obje basta olusturuldu, loop tra ise 100 obje olusturuldu
		// dolayisiyla bu kod calistirildiginda biz ekranda hic bir sey goremeyiz ama
		// Java 101 obje olusturmus olur
		// str in son degeri ise "Ali      ( 100 tane bosluk)    "
	}

}
