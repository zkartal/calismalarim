package day27_constructor_costructorCall;

public class TirRunner {

	public static void main(String[] args) {
		// Tum ozellikleri degistiren constructor olusturalim
		
		Tir tir1=new Tir(5000,"axor","beyaz", 2020, false);
		
		// int km, String model, String renk, int yil, boolean satilikMi
		
		System.out.println(tir1.km+" "+tir1.model+" "+tir1.renk+
				" "+tir1.yil+" "+tir1.satilikMi); //5000 axor beyaz 2020 false
		
		
		// uc ozelligi degistiren bir contructor olusturalim
		//int km, String model, String renk
		
		Tir tir2=new Tir(12000, "kar","kirmizi");
		System.out.println(tir2.km+" "+tir2.model+" "+tir2.renk+
				" "+tir2.yil+" "+tir2.satilikMi);
		
		
		
		
		
		

	}

}
