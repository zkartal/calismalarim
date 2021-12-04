package day32_varargs_stringBuilder;

public class C08_StringBuilder {

	public static void main(String[] args) {
		
	StringBuilder sb1 = new StringBuilder();//==> Bos bir StringBuilder olusturur
	
	StringBuilder sb2 = new StringBuilder("animal");//==> Belli bir degeri olan StringBuilder olusturur (array gibi)
	
	StringBuilder sb3 = new StringBuilder(5); //==> Ilk uzunlugu tahmin edilen StringBuilder olusturur.
	
	
	StringBuilder sb = new StringBuilder(5);
	
	sb.append("anim");
	sb.append("als");
	System.out.println(sb);
	
	StringBuilder mb2 = new StringBuilder(8);
	mb2.append("mazi");
	mb2.append(" Kalbimde Yaradir");
	System.out.println(mb2);

	
	
	}

}
