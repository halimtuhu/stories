class Tugas1 {
	public static void main(String[] args) {
		//Deklarasi
		String kampus 			= "Polinema";
		int tingkat 			= 1;
		char kelas 				= 'Z';
		int bilanganBulat 		= 10;
		float bilanganPecahan 	= 3.33333F;
		char karakter 			= 'C';

		//OUTPUT
		System.out.println(String.format("Saya Mahasiswa %s kelas %s%s", kampus, tingkat, kelas));
		System.out.println("Saya sedang belajar menampilkan nilai: ");
		System.out.println("Bilangan bulat " + bilanganBulat);
		System.out.printf("Bilangan pecahan %.2f \n", bilanganPecahan);
		System.out.println("Karakter " + karakter);

	}
}