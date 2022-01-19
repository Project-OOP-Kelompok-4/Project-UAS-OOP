package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.PasienDAO;
import pojo.Pasien;
import utils.DatabaseUtils;


public class PasienDAOImpl implements PasienDAO{
	
	@Override
	public List<Pasien> getAllPasien() {
		List<Pasien> listPasien = new ArrayList<Pasien>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM pasien;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				Pasien pasien = new Pasien();
				
					pasien.setId_pasien(rs.getObject(1).toString());
					pasien.setNama_pasien(rs.getObject(2).toString());
					pasien.setGejala(rs.getString(3));
					
					listPasien.add(pasien);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listPasien;
	}
	
	@Override
	public void savePasien(Pasien pasien) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO pasien (id_pasien, nama_pasien, gejala)"
					+ " VALUES ('"+pasien.getId_pasien()+"', '"
					+ pasien.getNama_pasien()+"', '"
					+ pasien.getGejala()+"');";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updatePasien(Pasien pasien) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE pasien SET id_pasien='"+pasien.getId_pasien()+"',"
					+ " nama_pasien='"+pasien.getNama_pasien()+"',"
					+ " gejala='"+pasien.getGejala()+"' WHERE id_pasien='"+pasien.getId_pasien()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void deletePasien(Pasien pasien) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM pasien WHERE id_pasien='"+pasien.getId_pasien()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}
	@Override
	public String getByIdPasien(String id_pasien) {
		// TODO Auto-generated method stub
		return null;
	}
}
