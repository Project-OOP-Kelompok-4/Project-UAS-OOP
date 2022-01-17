package view;

import java.util.Scanner;

import DAO.AdminDAO;
import DAO.DokterDAO;
import DAOImpl.AdminDAOImpl;
import DAOImpl.DokterDAOImpl;
import pojo.Admin;
import pojo.Dokter;

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
	
}
