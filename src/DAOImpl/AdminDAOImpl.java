package DAOImpl;

import DAO.AdminDAO;
import pojo.Admin;
import utils.DatabaseUtils;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public void getAdminById(String id) {
		// TODO Auto-generated method stub
		
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

}
