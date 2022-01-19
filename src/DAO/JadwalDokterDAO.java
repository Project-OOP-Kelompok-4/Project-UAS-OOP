package DAO;

import java.util.List;

import pojo.JadwalDokter;

public interface JadwalDokterDAO {
	public List<JadwalDokter> getAllJadwalDokter();
	public void createJadwal(JadwalDokter jadwal);
	public void readJadwal(JadwalDokter jadwal);
	public void updateJadwal(JadwalDokter jadwal);
	public void delete(JadwalDokter jadwal);
	public void saveJadwalDokter(JadwalDokter jadwaldokter);
}