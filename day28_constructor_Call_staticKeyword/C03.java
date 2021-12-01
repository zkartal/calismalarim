package day28_constructor_Call_staticKeyword;

public class C03 {

	public static void main(String[] args) {

		 /* Java RunTime bir programdir run tusuna bastiginizda java calismaya baslar ve islemleri yapar
		  * javanin isi bittiginde hersey basa doner
		  * static variable ve methodlar bulunduklari class ile ilintilidir ( obje ile degil class ile)
		  *  baska bir class da iken C02 deki static variable veya method a ulasmak istedigimizde 
		  *  C02. staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		  */
		
		C02 obje1= new C02();    
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
		//obje1 icin x : 5 obje1 icin y : 10
		
		obje1.x++;
		C02.y++;
		System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " +C02.y);
		//islemden sonra obje1 icin    x : 6     obje1 icin      y : 11
		
		C02 obje2= new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje21 icin y : " +C02.y);
		// instance variablelerr her yeni islemde yeniden baslar ilk degeri ile basalar
		// obje2 icin    x : 5    obje21 icin      y : 11
		
		
		obje2.x++;
		C02.y++;
		System.out.println("islemden sonra obje12 icin x : " + obje2.x + " obje2 icin y : " +C02.y);
		//slemden sonra obje12 icin      x : 6         obje2 icin    y : 12
		
		System.out.println(" obje2 olusturdulduktan ve islemden sonra obje1 in "+ " x : "+
		+ obje1.x + " y : " + C02.y); //  obje2 olusturdulduktan ve islemden sonra obje1 in  x : 6 y : 12
		
		C02 obje3 =new C02();
		obje3.x=20;
		C02.y=40;
		System.out.println("obje3 ten sonra obje1 in x : " + obje1.x); //obje1 in x : 6
		System.out.println("obje3 ten sonra obje2 in x : " + obje2.x); //obje2 in x : 6
		System.out.println("obje3 ten sonra obje3 in x : " + obje3.x); // obje3 in x : 20
		
		System.out.println("obje3 ten sonra obje1 in y : " + C02.y); // y : 40
		System.out.println("obje3 ten sonra obje1 in y : " + C02.y); // y : 40
		System.out.println("obje3 ten sonra obje1 in y : " + C02.y); // y : 40
		
		
		
		
		
		
	
	}

}
