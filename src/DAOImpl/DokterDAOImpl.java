package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.DokterDAO;
import pojo.Dokter;
import utils.DatabaseUtils;

public class DokterDAOImpl implements DokterDAO{

	@Override
	public List<Dokter> getDokter() {
		List<Dokter> listDkt = new ArrayList<Dokter>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM dokter;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				Dokter dokter = new Dokter();
				
					dokter.setId(rs.getObject(1).toString());
					dokter.setNama(rs.getObject(2).toString());
					dokter.setSpesialis(rs.getObject(3).toString());
					dokter.setEmail(rs.getObject(4).toString());
					dokter.setPassword(rs.getObject(5).toString());
					
					listDkt.add(dokter);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listDkt;
	}

	@Override
	public void saveDokter(Dokter dokter) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO dokter (id_dokter, nama_dokter, spesialis, email, password)"
					+ " VALUES ('"+dokter.getId()+"', '"
					+ dokter.getNama()+"', '"
					+ dokter.getSpesialis()+"', '"
					+ dokter.getEmail()+"', '"
					+ dokter.getPassword()+"'); ";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updateDokter(Dokter dokter) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE dokter SET id_dokter='"+dokter.getId()+"',"
					+ " nama_dokter='"+dokter.getNama()+"',"
					+ " spesialis='"+dokter.getSpesialis()+"',"
					+ " email='"+dokter.getEmail()+"',"
					+ " password='"+dokter.getPassword()+"' WHERE id_dokter='"+dokter.getId()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public void deleteDokter(Dokter dokter) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM dokter WHERE id_dokter='"+dokter.getId()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public Dokter loginDokter(String email, String password) {
		DatabaseUtils db = new DatabaseUtils();
		Dokter dokter = new Dokter();
		dokter = null;
		try {
			db.connect();
			
			String query = "SELECT * FROM dokter WHERE email = '"+email+"' AND password = '"+password+"';";
			
			ResultSet rs = db.readData(query);
			
			List<Dokter> listDkt = new ArrayList<Dokter>();
			
			//proces query result
			while(rs.next()) {
				Dokter dkt = new Dokter();
				dkt.setId(rs.getObject(1).toString());
				dkt.setNama(rs.getObject(2).toString());
				dkt.setSpesialis(rs.getObject(3).toString());
				dkt.setEmail(rs.getObject(4).toString());
				dkt.setPassword(rs.getObject(5).toString());
				
				listDkt.add(dkt);
				
				for(Dokter dktr : listDkt) {
					if(email.equals(dktr.getEmail()) && password.equals(dktr.getPassword())) {
						dokter = dktr;
					}
				}
				
			}
			
			//close
			db.disconnect();
		}catch(SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return dokter;
	}

}
