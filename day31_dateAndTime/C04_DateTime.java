package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// Bir String ve int variable olusturalim
		// Bir loop icinde bu variableleri 1000 kere degistirelim
		// ve bu islem surelerini kiyaslayalim

		// Baslangic Saati : 21:19:17.468769400
		// Bitis Saati : 21:19:17.471770
		// For Loop : 3000600.0 Nano Saniyede Tamamlandi
		// For Loop : 3000600.0 Nano Saniyede Tamamlandi

		LocalTime timeS = LocalTime.now();

		System.out.println("Baslangic Saati : " + timeS + " ");// 21:03:25.069149200

		String str = "celil";

		for (int i = 0; i < 10000; i++) {
			str += " ";
		}
		LocalTime timeFinishS = LocalTime.now();
		System.out.println("Bitis Saati : " + timeFinishS + " ");
		double nanoS = timeS.getNano();
		double nanoFinishS = timeFinishS.getNano();

		System.out.println("For Loop : " + (nanoFinishS - nanoS) + " Nano Saniyede Tamamlandi ");

		/*
		 * Baslangic Saati : 21:22:36.137781200 Bitis Saati : 21:22:36.177790100 For
		 * Loop : 4.00089E7 Nano Saniyede Tamamlandi
		 */
		
		
		double stringSure= nanoFinishS-nanoS;
		
	}

}
