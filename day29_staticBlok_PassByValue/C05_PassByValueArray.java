package day29_staticBlok_PassByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {


		int sayilar[] = {3,4,5,6};
		
		elemanDegistir(sayilar); //[10, 4, 5, 6]
		System.out.println("Eleman Degistir Methodundan sonra : " +Arrays.toString(sayilar));

		
		arrayiDegistir(sayilar);
		System.out.println("Arrayi Degistir Methodundan sonra : " +Arrays.toString(sayilar));
	}

	private static void arrayiDegistir(int[] sayilar) {
		sayilar= new int[6];
		System.out.println("Arrayi Degistir Methodunda : " +Arrays.toString(sayilar));
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0]=10;
		System.out.println("Eleman Degistir Methodunda : " +Arrays.toString(sayilar)); //[10, 4, 5, 6]
		
	}

}
