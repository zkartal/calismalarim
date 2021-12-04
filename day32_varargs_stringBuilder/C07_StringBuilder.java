package day32_varargs_stringBuilder;

public class C07_StringBuilder {

	public static void main(String[] args) {

		String str = "Ali Can";

		String str2 = new String("Veli Can");// Normalde Stringi b;zle zaymaliziy

		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		
		sb.append("!!! ");
		
		System.out.println(sb); //Yasasin Java!!! 
		
		sb.append(2);
		System.out.println(sb);
		
		
	}

}
