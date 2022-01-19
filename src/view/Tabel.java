package view;

import java.util.List;
import java.util.Scanner;

import pojo.Appointment;
import pojo.Dokter;
import pojo.JadwalDokter;
import pojo.Pasien;
import pojo.Resep;


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
	
	public static void tampilResep(List<Resep> listResep) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA APPOINTMENT    					     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tID\t\t|\tID OBAT\t\t\t|       ID PASIEN       			|       Dosis    |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Resep rsp : listResep) {
			System.out.println("    |\t"+rsp.getId_resep()+"\t\t|       "+rsp.getId_obat()+"\t\t        |       "+rsp.getId_pasien()+"\t\t|\t"+rsp.getDosis()+"      |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			AktifitasDokter.dataResep();
		}
		scanner.close();
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
			AktifitasDokter.aktifitasDokter();
		}
		scanner.close();
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
}
