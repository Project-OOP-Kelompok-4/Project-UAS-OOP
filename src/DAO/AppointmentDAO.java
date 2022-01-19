package DAO;

import java.util.List;
import pojo.Appointment;

public interface AppointmentDAO {
    public Appointment getAppoByIdApt(String id_apt);  
    public List<Appointment> getAllAppointment();
    public void saveAppointment(Appointment appointment);
    public void updateAppointment(Appointment appointment);
    public void deleteAppointment(Appointment appointment);
}
