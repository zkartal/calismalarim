package day27_constructor_costructorCall;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku Car class indan bir obje olusturmak istedigimizde JAVA Car class ini
		// icinde bulundugumuz class a import etmek ister

		Car car = new Car();

		System.out.println(car.yil);

		// ancak baska package oldugu icin icinde oldugumuz class dan Car class indaki
		// variable lere
		// ulasabilmem icin variablelerin axcess modifier i public olmalidir

		Car1 car1 = new Car1();
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);// 2000
																													// 0
																													// null
																													// null
																													// 2000
																													// false

		// degerlerde degisiklik yapmak icin tek tek atama yapmak gerek

		car1.km = 75000;
		car1.model = "Corolla";
		car1.renk = "Kirmizi";
		car1.satilikMi = true;

		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi); // 75000
																													// Corolla
																													// Kirmizi
																													// 2000
																													// true
		System.out.println("*********");

		Car1 car2 = new Car1();
		System.out.println(car2.km + " " + car2.model + " " + car2.renk + " " + car2.yil + " " + car2.satilikMi); // 0
																													// null
																													// null
																													// 2000
																													// false

		System.out.println("***********");

		Car1 car3 = new Car1();

		car3.km = 45000;
		car3.satilikMi = false;
		System.out.println(car3.km + " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satilikMi); // 45000
																													// null
																													// null
																													// 2000
																													// false

	}

}
