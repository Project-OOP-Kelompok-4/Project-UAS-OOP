package DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ResepDAO;
import pojo.Resep;
import utils.DatabaseUtils;

public class ResepDAOImpl implements ResepDAO{

	@Override
	public String getResepByIdResep(String id_resep) {
		return null;
	}

	@Override
	public List<Resep> getAllResep() {
		List<Resep> listRsp = new ArrayList<Resep>(); 
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "SELECT * FROM resep;";
			ResultSet rs = db.readData(query);
			
			while(rs.next()){
				Resep resep = new Resep();
				
					resep.setId_resep(rs.getObject(1).toString());
					resep.setId_obat(rs.getObject(2).toString());
					resep.setId_pasien(rs.getObject(3).toString());
					resep.setDosis(rs.getObject(4).toString());
					
					listRsp.add(resep);
			}
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi Error : " +ex.getMessage());
		}
		
		return listRsp;
	}

	@Override
	public void saveResep(Resep resep) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO resep (id_resep, id_obat, id_pasien, dosis)"
					+ " VALUES ('"+resep.getId_resep()+"', '"
					+ resep.getId_obat()+"', '"
					+ resep.getId_pasien()+"', ,"
					+ resep.getDosis()+"');";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
	}

	@Override
	public void updateResep(Resep resep) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE resep SET id_resep='"+resep.getId_resep()+"',"
					+ " id_obat='"+resep.getId_obat()+"',"
					+ " id_pasien='"+resep.getId_pasien()+"',"
					+ " dosis='"+resep.getDosis()+"' WHERE id_resep='"+resep.getId_resep()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

	@Override
	public void deleteResep(Resep resep) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM resep WHERE id_resep='"+resep.getId_resep()+"'";
			db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
		
	}

}
