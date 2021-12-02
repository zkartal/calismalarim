package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {


		LocalTime time =LocalTime.now();
		
		System.out.println("Baslangic Saati : " + time + " ");// 21:03:25.069149200
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
			
			
			
		}
		LocalTime timeFinish =LocalTime.now();
		System.out.println("Bitis Saati : " + timeFinish +" ");
		
	//	Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak hem baslangicta hem de sonunda LocalTime
	//	olusturmak gerekir
		
		
		System.out.println(time.getNano()); // biraz onceki saat farkini nano veriyor
		
		double nano1 = time.getNano();
		double nanoFinish= timeFinish.getNano();
		
		System.out.println("For Loop : " + (nanoFinish- nano1 ) + " Nano Saniyede Tamamlandi "); 
		// For Loop : 2999500.0 Nano Saniyede Tamamlandi 
		
		System.out.println(time.getMinute()); //30
		System.out.println(time.plusMinutes(10000)); // 20:10:51.957015600
		
		System.out.println(time.minusHours(20)); //01:33:11.532000800
		System.out.println("****");
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat); //23:47:11.475386400
		
	}

}
