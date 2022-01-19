package DAOImpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.AppointmentDAO;
import pojo.Appointment;
import utils.DatabaseUtils;

public class AppointmentDAOImpl implements AppointmentDAO {

	@Override
	public Appointment getAppoByIdApt(String id_apt) {
		DatabaseUtils db = new DatabaseUtils();
		Appointment appointment = new Appointment();
		try {
			db.connect();
			
			String query = "SELECT * FROM appointment WHERE IdApt = '"+id_apt+"'";
			ResultSet rs = db.readData(query);
			
			if(rs.next()) {
				ResultSetMetaData metaData = rs.getMetaData();
				int jumlahKolom = metaData.getColumnCount();
				do {
					for (int i = 1; i <= jumlahKolom; i++) {
						appointment.setId_apt(rs.getObject(1).toString());
						appointment.setId_pasien(rs.getObject(2).toString());
						appointment.setId_resep(rs.getObject(3).toString());
						appointment.setJadwal(rs.getObject(4).toString());
					}
				} while (rs.next());
			}
			else {
				appointment.setId_apt(rs.getObject(0).toString());
			}
		
			db.disconnect();
		} catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		return appointment;
		
	}

	@Override
	public List<Appointment> getAllAppointment() {
		List<Appointment> listAppo = new ArrayList<Appointment>();
		DatabaseUtils db = new DatabaseUtils();
		try {
			db.connect();
			
			String query = "SELECT * FROM appointment";
			
			ResultSet rs = db.readData(query);
			
			// process query results
			while (rs.next()) {
				
				Appointment appointment = new Appointment();
				
				appointment.setId_apt(rs.getObject(1).toString());
				appointment.setId_pasien(rs.getObject(2).toString());
				appointment.setId_resep(rs.getObject(3).toString());
				appointment.setJadwal(rs.getObject(4).toString());
				
				listAppo.add(appointment);
				
			}
			// close db connection
			db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		return listAppo;
	}

	@Override
	public void saveAppointment(Appointment appointment) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		
		try {
			db.connect();
			query = "INSERT INTO appointment (id_apt, id_pasien, id_resep, jadwal)"
					+ " VALUES ('"+appointment.getId_apt()+"', '"
					+ appointment.getId_pasien()+"', '"
					+ appointment.getId_resep()+"', '"
					+ appointment.getJadwal()+"'); ";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan!");
		} catch (Exception ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
		
	}

	@Override
	public void updateAppointment(Appointment appointment) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "UPDATE appointment SET id_pasien='"+appointment.getId_pasien()+"',"
					+ " id_resep='"+appointment.getId_resep()+"',"
					+ " jadwal = '"+appointment.getJadwal()+"' WHERE id_apt='"+appointment.getId_apt()+"';";
		db.executeQuery(query);
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void deleteAppointment(Appointment appointment) {
		DatabaseUtils db = new DatabaseUtils();
		String query;
		try {
			db.connect();
			query = "DELETE FROM appointment WHERE id_apt='"+appointment.getId_apt()+"'";
			db.executeQuery(query);
			//TableView.displayTabelKaryawanTetap(getAllKaryawanTetap());
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

}
