package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {


	KafanaGoreTopla(5,10,13,0);

	} // ilk sayi(5 sayi 1 e diger 3 sayi da sayilar a gider

	private static void KafanaGoreTopla(int sayi1, int...sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("Sayilarin toplami : " + sayi1 * toplam); //Sayilarin toplami : Sayilarin toplami : 115
	}

	

}
