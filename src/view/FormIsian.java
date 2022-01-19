package view;

import java.util.Scanner;

import DAO.AdminDAO;
import DAO.DokterDAO;
import DAO.JadwalDokterDAO;
import DAO.PasienDAO;
import DAOImpl.AdminDAOImpl;
import DAOImpl.DokterDAOImpl;
import DAOImpl.JadwalDokterDAOImpl;
import DAOImpl.PasienDAOImpl;
import pojo.Admin;
import pojo.Dokter;
import pojo.JadwalDokter;
import pojo.Pasien;

public class FormIsian {
	
	public void registAdmin() {
		Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Admin : ");
			adm.setId(scr.nextLine());
			System.out.print("Nama : ");
			adm.setNama(scr.nextLine());
			System.out.print("Email : ");
			adm.setEmail(scr.nextLine());
			System.out.print("Password : ");
			adm.setPassword(scr.nextLine());
		
			operation.saveAdmin(adm);
			
			System.out.println("Berhasil Registrasi....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public void addDokter() {
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Dokter : ");
			dkt.setId(scr.nextLine());
			System.out.print("Nama : ");
			dkt.setNama(scr.nextLine());
			System.out.println("Spesialis : ");
			dkt.setSpesialis(scr.nextLine());
			System.out.print("Email : ");
			dkt.setEmail(scr.nextLine());
			System.out.print("Password : ");
			dkt.setPassword(scr.nextLine());
		
			operation.saveDokter(dkt);
			
			System.out.println("Berhasil Registrasi....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public void addJadwalDokter() {
		JadwalDokter jadwaldokter = new JadwalDokter();
		JadwalDokterDAO operation = new JadwalDokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Dokter : ");
			jadwaldokter.setJadwal_dokter(scr.nextLine());
			System.out.print("Jadwal : ");
			jadwaldokter.setJadwal_dokter(scr.nextLine());
		
			operation.saveJadwalDokter(jadwaldokter);
			
			System.out.println("Berhasil Registrasi....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public void addPasien() {
		Pasien pasien = new Pasien();
		PasienDAO operation = new PasienDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Pasien : ");
			pasien.setId_pasien(scr.nextLine());
			System.out.print("Nama_Pasien : ");
			pasien.setNama_pasien(scr.nextLine());
			System.out.print("Gejala : ");
			pasien.setGejala(scr.nextLine());
		
			operation.savePasien(pasien);
			
			System.out.println("Berhasil Registrasi....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
}
