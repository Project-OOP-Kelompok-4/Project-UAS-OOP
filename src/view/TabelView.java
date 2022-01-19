package view;

import java.util.List;
import java.util.Scanner;

import DAO.JadwalDokterDAO;
import DAOImpl.JadwalDokterDAOImpl;
import DAOImpl.PasienDAOImpl;
import pojo.JadwalDokter;
import pojo.Pasien;


public class TabelView {
	public static void main(String[] args) {
		PasienDAOImpl operation = new PasienDAOImpl();
		displayPasien(operation.getAllPasien());
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
			/*
			FormIsian.displayTabel();
			*/
		}
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
			/*
			FormIsian.displayTabel();
			*/
		}
	}

	
	private static void displayJadwalDokter(List<JadwalDokter> allJadwalDokter) {
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
			/*
			FormIsian.displayTabel();
			*/
		}
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
			/*
			FormIsian.displayTabel();
			*/
		}
	}
}

