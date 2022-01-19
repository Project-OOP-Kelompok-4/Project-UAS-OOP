package view;

import java.util.Scanner;

import DAO.AppointmentDAO;
import DAO.DepoFarmasiDAO;
import DAO.DokterDAO;
import DAO.TebusObatDAO;
import DAOImpl.AppointmentDAOImpl;
import DAOImpl.DepoFarmasiDAOImpl;
import DAOImpl.DokterDAOImpl;
import DAOImpl.TebusObatDAOImpl;
import test.MainTest;

public class AktifitasAdmin {
	
	public static void aktifitasAdmin() {
		
		Scanner scan = new Scanner(System.in);
	    int pilih = 0;

		Menu.menuAdmin();
		
		pilih = scan.nextInt();
		
		switch(pilih) {
		
		case 1 :
			dataDokter();
			break;
		case 2 :
			//dataPasien();
			break;
		case 3 :
			dataAppo();
			break;
		case 4 :
			//dataDepo();
			break;
		case 5 :
			//dataJadwal();
			break;
		case 6 :
			dataTransaksi();
			break;
		case 7 :
			System.out.println("Berhasil Logout ^_^");
			MainTest.mainMenu();
			break;
		default :
			System.out.println("Input anda salah....");
			aktifitasAdmin();
			break;
		}
		
		scan.close();
	}
	
	public static void dataDokter() {
		DokterDAO dkt = new DokterDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		Menu.dataDokter();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			FormIsian.addDokter();
			break;
		case 2 :
			Tabel.tampilDokter(dkt.getDokter());
			break;
		case 3 :
			FormIsian.updateDokter();
			break;
		case 4 :
			FormIsian.hapusDokter();
			break;
		default :
			System.out.println("Pilihan Tidak Tersedia....");
			dataDokter();
		}
		scan.close();
	}
	
	public static void dataAppo() {
		AppointmentDAO appo = new AppointmentDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		Menu.dataAppo();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			FormIsian.addAppo();
			break;
		case 2 :
			Tabel.tampilAppo(appo.getAllAppointment());
			break;
		case 3 :
			FormIsian.updateAppo();
			break;
		case 4 :
			FormIsian.hapusAppo();
			break;
		case 5 :
			aktifitasAdmin();
			break;
		default :
			System.out.println("Pilihan Tidak Tersedia....");
			dataAppo();
		}
		scan.close();
	}
	
	public static void dataTransaksi() {
		TebusObatDAO trx = new TebusObatDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		Menu.dataTebusObat();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			FormIsian.transaksi();
		}
		scan.close();
	}
	
	public static void dataDepo() {
		DepoFarmasiDAO dpo = new DepoFarmasiDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		Menu.dataDepo();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			FormIsian.addObat();
			break;
		case 2 :
			Tabel.tampilDepo(dpo.getObat());
			break;
		case 3 :
			FormIsian.updateObat();
			break;
		case 4 :
			aktifitasAdmin();
			break;
		default :
			System.out.println("Pilihan Tidak Tersedia....");
			dataDepo();
		}
		scan.close();
	}
}
