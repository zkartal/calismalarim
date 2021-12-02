package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();
		System.out.println(tarihSaat); // 2021-12-02T21:44:50.272030300

		// y: Yilin tamamini
		// M: Ay sirasini verir
		// MM: Ay sirasini verir
		// MMM: Ay isminin ilk uc harfini verir
		// MMMM: Ay isminin tamamini verir
		// EEE: Gun isminin tamamini verir
		// E, EE : Gun isminin ilk 3 harfini verir
		// d : Basta 0 varsa onu yazmadan gun numarasi
		// dd : Tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		// DDD : Yilin kacinci gunu oldugunu yazar
		// Ay buyuk M ile belirtilmeli dakika( minute) ile
		// cakismamasi icin
		// 24 Saat uzerinden istersek :H, 12 saat duzenione gore : h
		// Saatin Tamamini : HH
		// Tek rakamli saat olursa Sadece saati :H
		// AM : a
		//PM : p
		
		
		// Eger tarih veya saati kendi istedigimiz sekilde yazdirmak istersek
				// gun/ ay/ yil saat: dakika

		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd /MMM /YYYY  EEE  HH : mm");
		System.out.println(duzenle.format(tarihSaat)); //  02 /Ara /2021  Per  22 : 01

	}

}
