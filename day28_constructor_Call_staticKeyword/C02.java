package day28_constructor_Call_staticKeyword;

public class C02 {

	int x= 5;
	static int y =10;
	
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		// ayni class icerisinde static variableye ulasmak icin objeye ihtiyac yoktur
		
		C02 obje1= new C02();    
		System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + y);
		//obje1 icin x : 5 obje1 icin y : 10
		
		obje1.x++;
		y++;
		System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + y);
		//islemden sonra obje1 icin    x : 6     obje1 icin      y : 11
		
		C02 obje2= new C02();
		System.out.println("obje2 icin x : " + obje2.x + " obje21 icin y : " + y);
		// instance variablelerr her yeni islemde yeniden baslar ilk degeri ile basalar
		// obje2 icin    x : 5    obje21 icin      y : 11
		
		
		obje2.x++;
		 y++;
		System.out.println("islemden sonra obje12 icin x : " + obje2.x + " obje2 icin y : " + y);
		//slemden sonra obje12 icin      x : 6         obje2 icin    y : 12
		
		System.out.println(" obje2 olusturdulduktan ve islemden sonra obje1 in "+ " x : "+
		+ obje1.x + " y : " +  y); //  obje2 olusturdulduktan ve islemden sonra obje1 in  x : 6 y : 12
		
		C02 obje3 =new C02();
		obje3.x=20;
		 y=40;
		System.out.println("obje3 ten sonra obje1 in x : " + obje1.x); //obje1 in x : 6
		System.out.println("obje3 ten sonra obje2 in x : " + obje2.x); //obje2 in x : 6
		System.out.println("obje3 ten sonra obje3 in x : " + obje3.x); // obje3 in x : 20
		
		System.out.println("obje3 ten sonra obje1 in y : " +  y); // y : 40
		System.out.println("obje3 ten sonra obje1 in y : " +  y); // y : 40
		System.out.println("obje3 ten sonra obje1 in y : " +  y); // y : 40
		
		
		
		
		
		
	}	
	
	

}
