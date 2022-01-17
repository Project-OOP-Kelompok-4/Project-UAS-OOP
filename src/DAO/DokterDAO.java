package DAO;

import java.util.List;

import pojo.Dokter;

public interface DokterDAO {
	public List<Dokter> getDokter();
    public void saveDokter(Dokter dokter);
    public void updateDokter(Dokter dokter);
    public void deleteDokter(Dokter dokter);
    public Dokter loginDokter(String email, String password);
}
