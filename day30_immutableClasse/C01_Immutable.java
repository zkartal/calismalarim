package day30_immutableClasse;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// String immutable bir class iken List mutabledir.

		String str = "Ali";

		str.toUpperCase(); // str==> ALI

		System.out.println(str); // Ali
		System.out.println(str.toUpperCase()); // ALI
		System.out.println(str); // Ali String immutable oldugu icin bu sekilde calisir, ancak List farklidir

		List<String> isimler = new ArrayList<>();
		System.out.println(isimler); // []

		isimler.add("Ali");
		System.out.println(isimler); // [Ali]

		isimler.add("Veli");
		System.out.println(isimler);// [Ali, Veli]

		isimler.set(0, "Zafer");
		System.out.println(isimler); // [Zafer, Veli]

		isimler.remove(1);
		System.out.println(isimler); // [Zafer]

	}

}
