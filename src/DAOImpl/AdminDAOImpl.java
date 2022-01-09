package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.AdminDAO;
import pojo.Admin;
import utils.DatabaseUtils;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public List<Admin> getAdmin() {
		List<Admin> listAdm = new ArrayList<Admin>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM admin;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				Admin admin = new Admin();
				
					admin.setId(rs.getObject(1).toString());
					admin.setNama(rs.getObject(2).toString());
					admin.setEmail(rs.getObject(3).toString());
					admin.setPassword(rs.getObject(4).toString());
					
					listAdm.add(admin);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listAdm;
	}
	
	@Override
	public void getAdminByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAdminByEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAdmin(Admin admin) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO admin (id_admin, nama_admin, email, password)"
					+ " VALUES ('"+admin.getId()+"', '"
					+ admin.getNama()+"', '"
					+ admin.getEmail()+"', '"
					+ admin.getPassword()+"'); ";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin login(String email, String password) {
		DatabaseUtils db = new DatabaseUtils();
		Admin admin = new Admin();
		admin = null;
		try {
			db.connect();
			
			String query = "SELECT * FROM admin WHERE email = '"+email+"' AND password = '"+password+"';";
			
			ResultSet rs = db.readData(query);
			
			List<Admin> listAdm = new ArrayList<Admin>();
			
			//proces query result
			while(rs.next()) {
				Admin adm = new Admin();
				adm.setId(rs.getObject(1).toString());
				adm.setNama(rs.getObject(2).toString());
				adm.setEmail(rs.getObject(3).toString());
				adm.setPassword(rs.getObject(4).toString());
				
				listAdm.add(adm);
				
				for(Admin ad : listAdm) {
					if(email.equals(ad.getEmail()) && password.equals(ad.getPassword())) {
						admin = ad;
					}
				}
				
			}
			
			//close
			db.disconnect();
		}catch(SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return admin;
	}


}
