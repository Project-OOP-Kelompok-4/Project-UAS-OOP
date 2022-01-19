package DAO;

import java.util.List;

import pojo.Pasien;

public interface PasienDAO {
	public String getByIdPasien(String id_pasien);
	public List<Pasien> getAllPasien();
    public void savePasien(Pasien pasien);
    public void updatePasien(Pasien pasien);
    public void deletePasien(Pasien pasien);
}
