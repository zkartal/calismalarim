package day33_StringBuilder;

public class C01_AppendLengthCapacitiy {

	public static void main(String[] args) {


		StringBuilder sb= new StringBuilder();
		
		System.out.println(sb.length()); // sb nin kullanilan uzunlugunu verir henuz bir sey yok 0 dir
		System.out.println(sb.capacity());  //  Bu da kapasitesini verir 16
	
		StringBuilder sb2= new StringBuilder("Java candir");
		
		System.out.println(sb2.length()); //11 sb nin kullanilan uzunlugunu verir henuz bir sey yok 0 dir
		System.out.println(sb2.capacity());//27
		
		
		StringBuilder sb3= new StringBuilder(7);
		sb3.append("Mehlika");
		
		System.out.println(sb3.length()); //7
		System.out.println(sb3.capacity());//7
		
		StringBuilder sb4= new StringBuilder(7);
		
		
		System.out.println(sb4.length()); //0
		System.out.println(sb4.capacity());//7
		
		sb4.append("Nilgun");
		
		System.out.println(sb4.length()); //6
		System.out.println(sb4.capacity());//7
		
		sb4.append(" candir");
		
		System.out.println(sb4.length()); //13
		System.out.println(sb4.capacity());//16
		
		sb.append("Java");
		System.out.println(sb);// Java
		
		sb.append(" candir");
		System.out.println(sb); //Java candir
		
		sb.append("anlasildi mi", 3, 6); // Java candirasi  3 .index teki karakteri ekledi 4. haric
		System.out.println(sb);
		
		// capacity i basta belirtiriz or. 5 gibi bes karakterli bir deger gireriz.
		// kapasiteyi asarcak bir deger girersek kapasiteyi artirir bu da   or.:5*2+2=12 olur
		
		
		
	}

}
