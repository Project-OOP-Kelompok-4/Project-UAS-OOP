package DAO;

import java.util.List;

import pojo.Obat;

public interface ObatDAO {
	public List<Obat> getObat();
	public int getHargaById(String id, List<Obat> listObat);
    public void saveObat(Obat obat);
    public void updateObat(Obat obat);
    public void deleteObat(Obat obat);
}
