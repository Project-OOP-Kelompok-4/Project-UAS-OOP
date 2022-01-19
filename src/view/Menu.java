package view;


public class Menu {

	public static void menuLogin() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|          Selamat Datang       |");
		System.out.println("|_______________________________|");
		System.out.println("|Login sebagai :                |");
		System.out.println("|1. Admin                       |");
		System.out.println("|2. Dokter                      |");
		System.out.println("|3. Keluar                      |");
		System.out.println("|_______________________________|");
	}
	
	public static void loginDokter() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|          Selamat Datang       |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Login                       |");
		System.out.println("|2. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void loginAdmin() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|          Selamat Datang       |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Login                       |");
		System.out.println("|2. Register                    |");
		System.out.println("|3. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void menuAdmin() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda kelola?  |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Data Dokter                 |");
		System.out.println("|2. Data Pasien                 |");
		System.out.println("|3. Data Appointment            |");
		System.out.println("|4. Data Depo Farmasi           |");
		System.out.println("|5. Jadwal Dokter               |");
		System.out.println("|6. Tebus Obat                  |");
		System.out.println("|7. Logout                      |");
		System.out.println("|_______________________________|");
	}
	
	public static void menuDokter() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Lihat Jadwal                |");
		System.out.println("|2. Lihat Jadwal Appointment    |");
		System.out.println("|3. Lihat Data Pasien           |");
		System.out.println("|4. Kelola Resep                |");
		System.out.println("|5. Logout                      |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataDokter() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Data Dokter            |");
		System.out.println("|2. Lihat Data Dokter           |");
		System.out.println("|3. Perbarui Data Dokter        |");
		System.out.println("|4. Hapus Data Dokter           |");
		System.out.println("|5. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataPasien() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Data Pasien            |");
		System.out.println("|2. Lihat Data Pasien           |");
		System.out.println("|3. Perbarui Data Pasien        |");
		System.out.println("|4. Hapus Data Pasien           |");
		System.out.println("|5. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataAppo() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Appointment            |");
		System.out.println("|2. Lihat Appointment           |");
		System.out.println("|3. Perbarui Data Appointment   |");
		System.out.println("|4. Hapus Data Appointment      |");
		System.out.println("|5. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataTebusObat() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Tebus Obat                  |");
		System.out.println("|2. Riwayat Tebus Obat          |");
		System.out.println("|3. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataDepo() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Data Obat              |");
		System.out.println("|2. Lihat Data Obat             |");
		System.out.println("|3. Perbarui Data Obat          |");
		System.out.println("|4. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataJadwal() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Jadwal Dokter          |");
		System.out.println("|2. Lihat Jadwal Dokter         |");
		System.out.println("|3. Perbarui Jadwal             |");
		System.out.println("|4. Hapus Jadwal                |");
		System.out.println("|5. Kembali                     |");
		System.out.println("|_______________________________|");
	}
	
	public static void dataResep() {
		System.out.println(" _______________________________");
		System.out.println("|                               |");
		System.out.println("|  Apa yang ingin anda lalukan? |");
		System.out.println("|_______________________________|");
		System.out.println("|                               |");
		System.out.println("|1. Buat Resep                  |");
		System.out.println("|2. Lihat Resep                 |");
		System.out.println("|3. Perbarui Resep              |");
		System.out.println("|4. Hapus Resep                 |");
		System.out.println("|5. Kembali                     |");
		System.out.println("|_______________________________|");
	}
}
