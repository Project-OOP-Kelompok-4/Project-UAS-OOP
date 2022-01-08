package test;

import utils.DatabaseUtils;
import DAO.AdminDAO;
import DAOImpl.AdminDAOImpl;
//import java.util.Scanner;
import pojo.Admin;
public class MainTest {

	public static void main(String[] args) {
		DatabaseUtils db = new DatabaseUtils();
		Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		
		db.connect();
		
		adm.setId("162020031");
		adm.setNama("Sandi Yusup Sinaga");
		adm.setEmail("sandis2703@gmail.com");
		adm.setPassword("kitabisa123");
		
		operation.saveAdmin(adm);
		
	}

}
