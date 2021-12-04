package day32_varargs_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {

		
		// varrargs List gibi davranir, ancak array methodlar icin calisir

		topla(5,8,10,13,15,0);

	}

	private static void topla(int ...sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("Sayilarin toplami : " +toplam); //Sayilarin toplami : 51
	}

}
