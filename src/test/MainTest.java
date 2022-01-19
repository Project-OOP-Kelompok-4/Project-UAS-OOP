package test;

import utils.Validator;
import view.AktifitasAdmin;
//import utils.DatabaseUtils;
import view.FormIsian;
import view.Menu;

import java.util.Scanner;

import DAO.AdminDAO;
//import DAO.AppointmentDAO;
import DAO.DokterDAO;
//import DAO.DepoFarmasiDAO;
import DAOImpl.AdminDAOImpl;
//import DAOImpl.AppointmentDAOImpl;
import DAOImpl.DokterDAOImpl;
//import DAOImpl.DepoFarmasiDAOImpl;
import pojo.Admin;
//import pojo.Appointment;
import pojo.Dokter;

public class MainTest {

	public static void main(String[] args) {
		mainMenu();
		}
	
	
	public static void mainMenu() {
		Scanner scan = new Scanner(System.in);
		
		Menu.menuLogin();
		
		int input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			loginAdmin();
			break;
		case 2 :
			loginDokter();
			break;
		case 3 :
			System.out.println("Program Berhenti Terimakasih ^_^");
			break;
		default :
			System.out.println("Pilihan Tidak tersedia....!");
			mainMenu();
		}
		
		scan.close();
	}
	
	public static void loginAdmin() {
		//Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		Scanner scan = new Scanner(System.in);
		Validator val = new Validator();
		
		int input = 0;
		
		Menu.loginAdmin();
		
		input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			Admin admin;
			String email,password;
			boolean login = false;
			Scanner sc = new Scanner(System.in);
			
			while(!login) {
				email = val.validateInput(sc, "Email : ", "email");
				password = val.validateInput(sc, "Password : ", "password");
				//System.out.print("Email : "); email = sc.nextLine();
				//System.out.print("Password : "); password = sc.nextLine();
				admin = operation.login(email, password);
				
				if (admin != null) {
					login = true;
					System.out.println("Login Berhasil.......");
					AktifitasAdmin.aktifitasAdmin();
				}else {
					System.out.println("Email atau Password salah, coba lagi.........");
					loginAdmin();
				}
			}
			sc.close();
			break;
		case 2 :
			FormIsian.registAdmin();
			loginAdmin();
			break;
		case 3 :
			mainMenu();
			break;
		default :
			System.out.println("Pilihan tidak tersedia");
			loginAdmin();
			break;
		}
		
		scan.close();
	}
	
	public static void loginDokter() {
		//Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scan = new Scanner(System.in);
		Validator val = new Validator();
		
		int input = 0;
		
		Menu.loginDokter();
		
		input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			Dokter dokter;
			String email,password;
			boolean login = false;
			Scanner sc = new Scanner(System.in);
			
			while(!login) {
				email = val.validateInput(sc, "Email : ", "email");
				password = val.validateInput(sc, "Password : ", "password");
				//System.out.print("Email : "); email = sc.nextLine();
				//System.out.print("Password : "); password = sc.nextLine();
				dokter = operation.loginDokter(email, password);
				
				if (dokter != null) {
					login = true;
					System.out.println("Login Berhasil.......");
				}else {
					System.out.println("Email atau Password salah, coba lagi.........");
				}
			}
			sc.close();
			break;
		case 2 :
			mainMenu();
			break;
		default :
			System.out.println("Pilihan tidak tersedia");
			loginDokter();
			break;
		}
		
		scan.close();
	}
}
