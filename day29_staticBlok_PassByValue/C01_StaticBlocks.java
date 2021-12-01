package day29_staticBlok_PassByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("static blok ne zaman calisir: " + " Main method dan once calisir");
	}

	public static void main(String[] args) {
		System.out.println("Javada once main method calisir");

	}

	static {
		System.out.println("static blok nereye yazilir sa yazilsin main methoddan once calisir");
		// iki static blok varsa en ustteki ilkönce calisir
	}
}
