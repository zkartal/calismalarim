package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder("Java candir can");
		sb.delete(11, 15);
		System.out.println(sb); // Java candir 
		// silmek icin sb.delet(0,0) yani istenen indexten length'ine kadar secebiliriz
		sb.delete(5, 20);
		System.out.println(sb);
		
		
	}

}
