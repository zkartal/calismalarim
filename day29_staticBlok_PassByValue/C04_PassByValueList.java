package day29_staticBlok_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// Bir List olusturalim
		//Sonra List elemanlarini degistir methodu yazip
		// Orada List elemanlarinda bazilarini degistirelim
		// method void olsun, main methoda dondukten sonra yeniden List'i yazdiralim
		
		ArrayList harfler= new ArrayList();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		ListElemanDegistir(harfler); //Main Methoda donunce List : [D, B, C]
		System.out.println("Main Methoda donunce List : " + harfler);// Main Methoda donunce List : [D, B, C]
		
		
		listDegistir(harfler); //: [D, B, C]
		System.out.println("liste yeni list atandiktan sonra main method adonunce list : " + harfler);
		
	}

	private static void ListElemanDegistir(ArrayList harfler) {
		harfler.set(0, "D");
		System.out.println("Method da degistirdigimiz List : " + harfler); //Method da degistirdigimiz List : [D, B, C]
		
		
	}

	private static void listDegistir(List<String> harfler) {
		harfler= new ArrayList<>();
		System.out.println("Liste yeni deger atayinca : "+ harfler);
		
		
	}

}
