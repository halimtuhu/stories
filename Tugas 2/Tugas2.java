import java.util.Scanner;
class Tugas2 {
	public static void main(String[] args) {
		
		//Deklarasi
		Scanner inputGaji = new Scanner(System.in);
		double komisi = 0.15, hasilPenjualan, gajiPokok, gajiBudi;

		//INPUT
		System.out.print("Masukkan Gaji Pokok\t\t: ");
		gajiPokok = inputGaji.nextInt();

		System.out.print("Masukkan Hasil Penjualan\t: ");
		hasilPenjualan = inputGaji.nextInt();

		//OPERASI
		hasilPenjualan = (hasilPenjualan*komisi);
		gajiBudi = hasilPenjualan + gajiPokok;

		//OUTPUT
		System.out.println("\nGaji yang diterima pak Budi adalah " + gajiBudi);

	}
}