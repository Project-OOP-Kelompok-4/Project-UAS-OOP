package view;

import java.util.List;
import java.util.Scanner;

import pojo.Admin;
import pojo.Appointment;
import pojo.DepoFarmasi;
import pojo.Dokter;
import pojo.JadwalDokter;
import pojo.Pasien;
import pojo.Resep;
import pojo.TebusObat;

public class Tabel {
	public static void tampilDokter(List<Dokter> listDkt) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA DOKTER    					            |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tNama\t\t\t|       Email       			|       Spesialis    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Dokter dkt : listDkt) {
			System.out.println("    |\t"+dkt.getId()+"\t\t|       "+dkt.getNama()+"\t\t        |       "+dkt.getEmail()+"\t\t|\t"+dkt.getSpesialis()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasAdmin.dataDokter();
		}
		scanner.close();
	}
	
	public static void tampilDokter2(List<Dokter> listDkt) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA DOKTER    					            |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tNama\t\t\t|       Email       			|       Spesialis    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Dokter dkt : listDkt) {
			System.out.println("    |\t"+dkt.getId()+"\t\t|       "+dkt.getNama()+"\t\t        |       "+dkt.getEmail()+"\t\t|\t"+dkt.getSpesialis()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
	}
	
	public static void tampilAppo(List<Appointment> listAppo) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA APPOINTMENT    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID PASIEN\t\t\t|       ID RESEP       			|       JADWAL    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Appointment apo : listAppo) {
			System.out.println("    |\t"+apo.getId_apt()+"\t\t|       "+apo.getId_pasien()+"\t\t        |       "+apo.getId_resep()+"\t\t|\t"+apo.getJadwal()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasAdmin.dataAppo();
		}
		scanner.close();
	}
	
	public static void tampilAppo2(List<Appointment> listAppo) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA APPOINTMENT    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID PASIEN\t\t\t|       ID RESEP       			|       JADWAL    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Appointment apo : listAppo) {
			System.out.println("    |\t"+apo.getId_apt()+"\t\t|       "+apo.getId_pasien()+"\t\t        |       "+apo.getId_resep()+"\t\t|\t"+apo.getJadwal()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
	}
	
	public static void tampilResep(List<Resep> listResep) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA RESEP    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID OBAT\t\t\t|       ID PASIEN     		|       Dosis    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Resep rsp : listResep) {
			System.out.println("    |\t"+rsp.getId_resep()+"\t\t|       "+rsp.getId_obat()+"\t\t        |       "+rsp.getId_pasien()+"\t\t\t|\t"+rsp.getDosis()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasDokter.dataResep();
		}
		scanner.close();
	}
	
	public static void tampilResep2(List<Resep> listResep) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA RESEP    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID OBAT\t\t\t|       ID PASIEN     		|       Dosis    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Resep rsp : listResep) {
			System.out.println("    |\t"+rsp.getId_resep()+"\t\t|       "+rsp.getId_obat()+"\t\t        |       "+rsp.getId_pasien()+"\t\t\t|\t"+rsp.getDosis()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
	}
	
	public static void displayPasien(List<Pasien> listPasien) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA PASIEN					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId_Pasien\t\t|\tNama_Pasien\t\t\t|       Gejala       		 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Pasien pasien : listPasien) {
			System.out.println("    |\t"+pasien.getId_pasien()+"\t|       "+pasien.getNama_pasien()+"\t        |       "+pasien.getGejala()+"\t|()    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasDokter.aktifitasDokter();
		}
		scanner.close();
	}
	
	public static void displayPasien2(List<Pasien> listPasien) {
		//char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA PASIEN					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId_Pasien\t|\tNama_Pasien\t|       Gejala       		 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Pasien pasien : listPasien) {
			System.out.println("    |\t"+pasien.getId_pasien()+"\t\t|       "+pasien.getNama_pasien()+"        |       "+pasien.getGejala()+"\t\t|");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		scanner.close();
	}
	
	public static void displayTuplePasien(Pasien pasien) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA ADMIN				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |ID_Pasien\t\t: " + pasien.getId_pasien()+"\t\t\t\t|");
		System.out.println("    |Nama_pasien\t\t: " + pasien.getNama_pasien()+"\t\t\t|");
		System.out.println("    |Gejala\t\t: " + pasien.getGejala()+"\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasDokter.aktifitasDokter();
		}
		scanner.close();
	}

	
	public static void displayJadwalDokter(List<JadwalDokter> allJadwalDokter) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							JADWAL DOKTER				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId_Dokter\t\t|\tJadwal\t\t\t|      ");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (JadwalDokter jadwaldokter : allJadwalDokter) {
			System.out.println("    |\t"+jadwaldokter.getId_dokter()+"\t|       "+jadwaldokter.getJadwal()+"\t|()    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasAdmin.aktifitasAdmin();
		}
		scanner.close();
	}
	
	public static void displayJadwalDokter2(List<JadwalDokter> allJadwalDokter) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							JADWAL DOKTER				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId_Dokter\t\t|\tJadwal\t\t\t|      ");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (JadwalDokter jadwaldokter : allJadwalDokter) {
			System.out.println("    |\t"+jadwaldokter.getId_dokter()+"\t|       "+jadwaldokter.getJadwal()+"\t|()    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		//AktifitasDokter.aktifitasDokter();
	}
	
	public static void displayTupleJadwalDokter(JadwalDokter jadwaldokter) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		JADWAL DOKTER				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |ID_Dokter\t\t: " + jadwaldokter.getId_dokter()+"\t\t\t\t|");
		System.out.println("    |Jadwal\t\t: " + jadwaldokter.getJadwal()+"\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasDokter.aktifitasDokter();
		}
		scanner.close();
	}
	
	public static void tampilDepo(List<DepoFarmasi> listDpo) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DEPO FARMASI				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID OBAT\t\t|\tNama\t\t\t|\tStok\t\t\t|\tHarga\t\t\t|      ");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (DepoFarmasi dpo : listDpo) {
			System.out.println("    |\t"+dpo.getId_obat()+"\t\t|\t"+dpo.getNama_obat()+"\t\t|\t"+dpo.getStok()+"\t\t|\t"+dpo.getHarga()+"\t\t|");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasAdmin.dataDepo();
		}
		scanner.close();
	}
	
	public static void tampilDepo2(List<DepoFarmasi> listDpo) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DEPO FARMASI				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID OBAT\t\t|\tNama\t\t\t|\tStok\t\t\t|\tHarga\t\t\t|      ");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (DepoFarmasi dpo : listDpo) {
			System.out.println("    |\t"+dpo.getId_obat()+"\t\t|\t"+dpo.getNama_obat()+"\t\t|\t"+dpo.getStok()+"\t\t|\t"+dpo.getHarga()+"\t\t|");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
	}
	
	public static void tampilTransaksi(List<TebusObat> listTrx) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA TRANSAKSI    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID PASIEN\t\t\t|       ID RESEP       			|       Biaya    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (TebusObat trx : listTrx) {
			System.out.println("    |\t"+trx.getId_transaksi()+"\t\t|       "+trx.getId_pasien()+"\t\t        |       "+trx.getId_resep()+"\t\t|\t"+trx.getBiaya()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasAdmin.dataTransaksi();
		}
		scanner.close();
	}
	public static void tampilAdmin(List<Admin> listAdm) {
		//char back;
		//Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA Admin    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tNama PASIEN\t\t\t|       Email       			|       Password    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Admin adm : listAdm) {
			System.out.println("    |\t"+adm.getId()+"\t\t|"+adm.getNama()+"\t\t|"+adm.getEmail()+"\t\t        |       *******\t\t|\t      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
	}
}
