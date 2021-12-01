package day27_constructor_costructorCall;

public class Tir {

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Tir(int i, String string, String string2, int j, boolean b) {

		// TirRunner class indan yolladigimiz degerlerin instance variableler ile eslesmesi icin 
		// atama yapmamiz gerekir.
		
		km=i;
		model=string;
		renk= string2;
		yil=j;
		satilikMi=b;
		
		
	}

	public Tir(int km, String model, String renk) {
		// i, string ve string2 uygun isimler degil, kodu sonradan incelerken anlasilir degil.
		// Daha anlasilir olmasi icin variable isimleri anlamli yapalaim
		// int km, String model, String renk
	
		this.km=km;
		this.model=model;
		this.renk=renk;
		this.yil=yil;
		this.satilikMi=satilikMi;
		
		// Basina this. yazdigimizda java bu variablenin glass level de oldugunu anlar
	}
	
	
	
}
