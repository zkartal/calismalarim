package day27_constructor_costructorCall;

public class Car1 {
	
	
	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	    
	    public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
			// Atama yapacagimiz tum ozellikleri parametre olarak yollladik
		}
      // Ben 5 ozelligi degistiren bir constructor urettigimde java default constructoru siler. Bu 
	  //  durumda daha onceden yazilan ve default constructor kullanan kodlar coker. Bu durumda kodlari
	    // duzeltmek icin Javanin sildigi default constructor yerine parametresiz bir constructor olusturmaliyim.
	    	

	//  -------->
	    public Car1() {
			
		
		}
	    // parametresiz constructor uretmenin syntex i clasAdi +() +{}
	    
		public Car1(int i) { // Bu satirdaki int km ile class level deki int km farkli scope lerde dir: Bu ikisinin 
			// ayni sey oldugunu javaya soylemeliyiz yani km=i demeliyiz
			km=i;
			
		}
		
		public Car1(int i, int j) {
					// yil    km
			yil=i;
			km=j;
		}


		public void hiz(int hiz) {
	        System.out.println("araba saatte " + hiz + " km yapar");
	    }
		
		
	    
	    public void yakit(String yakit) {
	        System.out.println("Araba yakit olarak " + yakit + " kullanir");
	    }
	}


