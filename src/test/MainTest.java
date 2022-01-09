package test;

import utils.DatabaseUtils;
import utils.Validator;

import java.util.Scanner;

import DAO.AdminDAO;
import DAO.AppointmentDAO;
import DAOImpl.AdminDAOImpl;
import DAOImpl.AppointmentDAOImpl;
import pojo.Admin;
import pojo.Appointment;
public class MainTest {

	public static void main(String[] args) {
		DatabaseUtils db = new DatabaseUtils();
		Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		Appointment appo = new Appointment();
		AppointmentDAO appOperation = new AppointmentDAOImpl();
		Scanner scan = new Scanner(System.in);
		Validator val = new Validator();
		
		int input = 0;
		
		
		appo.setId_apt("A0001");
		appo.setId_pasien("Sri Wahyuni");
		appo.setId_resep("R3001");
		appo.setJadwal("2022-01-02");
		
		appOperation.saveAppointment(appo);
		
		
		System.out.println("Selamat Datang");
		System.out.println("1. Log In");
		System.out.println("2. Register");
		input = scan.nextInt();
		
		switch(input) {
		
		case 1 :
			Admin admin;
			String email,password;
			boolean login = false;
			Scanner sc = new Scanner(System.in);
			
			while(!login) {
				//email = val.validateInput(sc, "Email : ", "email");
				//password = val.validateInput(sc, "Password : ", "password");
				System.out.print("Email : "); email = sc.nextLine();
				System.out.print("Password : "); password = sc.nextLine();
				admin = operation.login(email, password);
				
				if (admin != null) {
					login = true;
					System.out.println("Login Berhasil.......");
				}else {
					System.out.println("Email atau Password salah, coba lagi.........");
				}
			}
			sc.close();
			break;
		case 2 :
			
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
			break;
		}
		
	}
	

}
