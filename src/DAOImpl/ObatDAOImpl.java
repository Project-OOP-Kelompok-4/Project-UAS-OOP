package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ObatDAO;
import pojo.Obat;
import utils.DatabaseUtils;

public class ObatDAOImpl implements ObatDAO{

	@Override
	public List<Obat> getObat() {
		List<Obat> listObt = new ArrayList<Obat>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM obat;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				Obat obat = new Obat();
				
					obat.setId_obat(rs.getObject(1).toString());
					obat.setNama_obat(rs.getObject(2).toString());
					obat.setHarga(rs.getInt(3));
					
					listObt.add(obat);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listObt;
	}
	
	@Override
	public int getHargaById(String id, List<Obat> listObt) {
		int harga = 0;
		
		for(Obat obat : listObt) {
			if(obat.getId_obat().equals(id)) {
				harga = obat.getHarga();
			}else {
				System.out.println("Obat tidak ada, harap tambahkan terlebih dahulu...");
			}
		}
		
		return harga;
	}

	@Override
	public void saveObat(Obat obat) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO obat (id_obat, nama_obat, harga)"
					+ " VALUES ('"+obat.getId_obat()+"', '"
					+ obat.getNama_obat()+"', "
					+ obat.getHarga()+");";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updateObat(Obat obat) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE obat SET id_obat='"+obat.getId_obat()+"',"
					+ " nama_obat='"+obat.getNama_obat()+"',"
					+ " harga="+obat.getHarga()+" WHERE id_obat='"+obat.getId_obat()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void deleteObat(Obat obat) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM obat WHERE id_obat='"+obat.getId_obat()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

}
