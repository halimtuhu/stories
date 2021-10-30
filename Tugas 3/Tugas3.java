import java.util.Scanner;
class Tugas3 {
	public static void main(String[] args) {
		
		//DEKLARASI
		float suhu3, celcius, reamur, fahrenheit, kelvin;
		Scanner inputSuhu = new Scanner(System.in);

		//INPUT
		System.out.print("MASUKKAN SUHU: ");
		suhu3 		= inputSuhu.nextInt();

		//OPERATION
		celcius 	= suhu3;
		reamur 		= 4 * celcius / 5;
		fahrenheit 	= (9 * celcius /5) + 32;
		kelvin		= celcius + 273;

		//OUTPUT
		System.out.println("Celcius\t\t: " + celcius);
		System.out.println("Reamur\t\t: " + reamur);
		System.out.println("Fahrenheit\t: " + fahrenheit);
		System.out.println("Kelvin\t\t: " + kelvin);
	}
}