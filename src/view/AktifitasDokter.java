package view;

import java.util.Scanner;

import DAO.AppointmentDAO;
import DAO.JadwalDokterDAO;
import DAO.PasienDAO;
import DAO.ResepDAO;
import DAOImpl.AppointmentDAOImpl;
import DAOImpl.JadwalDokterDAOImpl;
import DAOImpl.PasienDAOImpl;
import DAOImpl.ResepDAOImpl;
import test.MainTest;

public class AktifitasDokter {
	
	public static void aktifitasDokter() {
		AppointmentDAO appo = new AppointmentDAOImpl();
		PasienDAO pasien = new PasienDAOImpl();
		JadwalDokterDAO jdwl = new JadwalDokterDAOImpl();
		Scanner scan = new Scanner(System.in);
	    int pilih = 0;

		Menu.menuDokter();
		
		pilih = scan.nextInt();
		
		switch(pilih) {
		
		case 1 :
			Tabel.displayJadwalDokter(jdwl.getAllJadwalDokter());
			break;
		case 2 :
			Tabel.tampilAppo(appo.getAllAppointment());
			break;
		case 3 :
			Tabel.displayPasien(pasien.getAllPasien());
			break;
		case 4 :
			dataResep();
			break;
		case 5 :
			System.out.println("Berhasil Logout ^_^");
			MainTest.mainMenu();
			break;
		default :
			System.out.println("Input anda salah....");
			aktifitasDokter();
			break;
		}
		
		scan.close();
	}
	
	static public void dataResep() {
		
		ResepDAO rsp = new ResepDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		Menu.dataResep();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			FormIsian.addResep();
			break;
		case 2 :
			Tabel.tampilResep(rsp.getAllResep());
			break;
		case 3 :
			FormIsian.updateResep();
			break;
		case 4 :
			FormIsian.hapusResep();
			break;
		default :
			System.out.println("Pilihan Tidak Tersedia....");
			dataResep();
		}
		scan.close();
	}
}
