package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
	
		
		KafanaGoreIslem(10,13,5,6,3,2);
		
		
	}
		
		private static void KafanaGoreIslem(int...sayilar) {
			int toplam=0;
			
			for (int e : sayilar) {
				toplam*=e;
			}
			System.out.println("Sayilarin toplami : " +  toplam); 

	}

}
