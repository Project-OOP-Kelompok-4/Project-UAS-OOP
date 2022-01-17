package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.TebusObatDAO;
import pojo.TebusObat;
import utils.DatabaseUtils;

public class TebusObatDAOImpl implements TebusObatDAO{

	@Override
	public List<TebusObat> getTransaksi() {
		List<TebusObat> listTbs = new ArrayList<TebusObat>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM tebus_obat;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				TebusObat tbs = new TebusObat();
				
					tbs.setId_transaksi(rs.getObject(1).toString());
					tbs.setId_pasien(rs.getObject(2).toString());
					tbs.setId_resep(rs.getObject(3).toString());
					tbs.setBiaya(rs.getInt(4));
					
					listTbs.add(tbs);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listTbs;
	}

	@Override
	public void saveTransaksi(TebusObat tebus) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO tebus_obat (id_transaksi, id_pasien, id_resep, biaya)"
					+ " VALUES ('"+tebus.getId_transaksi()+"', '"
					+ tebus.getId_pasien()+"', '"
					+ tebus.getId_resep()+"', "
					+ tebus.getBiaya()+");";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void deleteTransaksi(TebusObat tebus) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM tebus_obat WHERE id_transaksi='"+tebus.getId_transaksi()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

}
