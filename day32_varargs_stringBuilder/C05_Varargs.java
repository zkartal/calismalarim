package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		// varargs dan once farkli parametreler kullanilabilir ancak varargs dan sonra parametre yazilamaz
		// yazilmasi dururmunda Java uyarir ve CTE verir

		
		topla(5,10,13,0);

	}

	private static void topla(int ...sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("Sayilarin toplami : " +toplam);//Sayilarin toplami : 28
	}

}
