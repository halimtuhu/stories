import java.util.Scanner;
class Segitiga{
	public static void main(String[] args) {
		//MENCARI LUAS SEGITIGA
		Scanner inputSegitiga = new Scanner(System.in);
		int alas, tinggiSegitiga;
		float luas;

		System.out.println("MENGHITUNG LUAS SEGITIGA");
		System.out.print("Masukkan alas segitiga: ");
		alas = inputSegitiga.nextInt();
		System.out.print("Masukkan tinggi segitiga: ");
		tinggiSegitiga = inputSegitiga.nextInt();

		luas = alas * tinggiSegitiga / 2;

		System.out.println("Luas Segitiga: " + luas );

		//MENCARI VOLUME TABUNG
		Scanner inputTabung = new Scanner(System.in);
		int jari2, tinggiTabung;
		float volume, phi = 3.14F;

		System.out.println("\nMENGHITUNG VOLUME TABUNG");
		System.out.print("Masukkan Jari-Jari: ");
		jari2 = inputTabung.nextInt();
		System.out.print("Masukkan tinggi tabung: ");
		tinggiTabung = inputTabung.nextInt();

		volume = phi * jari2 * jari2 * tinggiTabung;

		System.out.println("Volume Tabung: " + volume);

	}
}