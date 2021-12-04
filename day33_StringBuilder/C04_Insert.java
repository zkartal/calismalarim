package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {


		StringBuilder sb= new StringBuilder("Java ogrendik");
		
		// araya cok iyi ekleyelim
		
		sb.insert(4, "yi cok iyi");
		System.out.println(sb); //Javayi cok iyi ogrendik
		
		// sonuna ",yasasin" ekleyelim
		
		String str2="cok iyiyim";
		sb.insert(7, "cok iyiyim", 0, 4);
		System.out.println(sb);
		sb.replace(7, 15, "az");
		System.out.println(sb);
		
	}

}
