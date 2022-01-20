package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.DepoFarmasiDAO;
import pojo.DepoFarmasi;
import utils.DatabaseUtils;

public class DepoFarmasiDAOImpl implements DepoFarmasiDAO{

	@Override
	public List<DepoFarmasi> getObat() {
		List<DepoFarmasi> listObt = new ArrayList<DepoFarmasi>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM depo_farmasi;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				DepoFarmasi depoFarmasi = new DepoFarmasi();
				
					depoFarmasi.setId_obat(rs.getObject(1).toString());
					depoFarmasi.setNama_obat(rs.getObject(2).toString());
					depoFarmasi.setStok(rs.getInt(3));
					depoFarmasi.setHarga(rs.getInt(4));
					
					listObt.add(depoFarmasi);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listObt;
	}
	
	@Override
	public int getHargaById(String id, List<DepoFarmasi> listObt) {
		int harga = 0;
		
		for(DepoFarmasi depoFarmasi : listObt) {
			if(depoFarmasi.getId_obat().equals(id)) {
				harga = depoFarmasi.getHarga();
			}else {
				System.out.println("Obat tidak ada, harap tambahkan terlebih dahulu...");
			}
		}
		
		return harga;
	}

	@Override
	public void saveObat(DepoFarmasi depoFarmasi) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO depo_farmasi (id_obat, nama_obat, stok, harga)"
					+ " VALUES ('"+depoFarmasi.getId_obat()+"', '"
					+ depoFarmasi.getNama_obat()+"', "
					+ depoFarmasi.getStok()+", "
					+ depoFarmasi.getHarga()+");";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updateObat(DepoFarmasi depoFarmasi) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE depo_farmasi SET id_obat='"+depoFarmasi.getId_obat()+"',"
					+ " nama_obat='"+depoFarmasi.getNama_obat()+"',"
					+ " harga="+depoFarmasi.getHarga()+" WHERE id_obat='"+depoFarmasi.getId_obat()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}
	
	public void updateObat(int stok, String id) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE depo_farmasi SET stok="+stok+" WHERE id_obat='"+id+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}
	

	@Override
	public void deleteObat(DepoFarmasi depoFarmasi) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM depo_farmasi WHERE id_obat='"+depoFarmasi.getId_obat()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public int getStokById(String id, List<DepoFarmasi> listObat) {
		int stok = 0;
		
		for(DepoFarmasi depoFarmasi : listObat) {
			if(depoFarmasi.getId_obat().equals(id)) {
				stok = depoFarmasi.getStok();
			}else {
				System.out.println("Obat tidak ada, harap tambahkan terlebih dahulu...");
			}
		}
		
		return stok;
	}

}
