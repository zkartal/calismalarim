package day29_staticBlok_PassByValue;

public class C03_PassBy {

	public static void main(String[] args) {
		// 100 Tl ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturalim
		
		 /* Main methoddan diger methodlara veya diger method lar dan main methoda bir variable gonderirseniz
		  * java orijinal variable leri degil onlarin degerlerini ( value) goturur, orijinal variable nin degeri degismez
		  */
		
				int fiyat = 100;
				
				System.out.println(indirimYap25(fiyat)); // 75 Tl dondurur ya yazdiracagiz yada atama yapmaliyiz
				// ancak bu degisiklik sadece kendi scop'unda gecerlidir. 
				System.out.println("main method dan sonra methoddaki fiyat : "+ fiyat);
								
				// Kalici degisikli icin main method da atama yapmaliyiz
				
				fiyat=indirimYap10(fiyat);// atama yaptik ve main method da fiyat kalici olarak degisti
				System.out.println("main method dan sonra method daki fiyat : "+ fiyat);
				

			}

			private static int indirimYap25(int fiyat) {
				fiyat*=0.75;
				
				return fiyat;
				
			}

			private static int indirimYap10(int fiyat) {


				fiyat*=0.90;
				
				return fiyat;
				

	}

}
