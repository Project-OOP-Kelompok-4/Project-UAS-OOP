package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.JadwalDokterDAO;
import pojo.JadwalDokter;
import utils.DatabaseUtils;

public class JadwalDokterDAOImpl implements JadwalDokterDAO {

	@Override
	public List<JadwalDokter> getAllJadwalDokter() {
		List<JadwalDokter> listJadwalDokter = new ArrayList<JadwalDokter>();
		DatabaseUtils db = new DatabaseUtils();
		try {
			db.connect();
			
			String query = "SELECT * FROM jadwaldokter";
			
			ResultSet rs = db.readData(query);
			
			// process query results
			while (rs.next()) {
				
				JadwalDokter jadwaldokter = new JadwalDokter();
				
				jadwaldokter.setId_dokter(rs.getObject(1).toString());
				jadwaldokter.setJadwal_dokter(rs.getObject(2).toString());
				
				listJadwalDokter.add(jadwaldokter);
				
			}
			// close db connection
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		return listJadwalDokter;
	}

	@Override
	public void createJadwal(JadwalDokter jadwal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readJadwal(JadwalDokter jadwal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateJadwal(JadwalDokter jadwal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(JadwalDokter jadwal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveJadwalDokter(JadwalDokter jadwaldokter) {
		// TODO Auto-generated method stub
		
	}

}
