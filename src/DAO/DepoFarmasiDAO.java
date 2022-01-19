package DAO;

import java.util.List;

import pojo.DepoFarmasi;


public interface DepoFarmasiDAO {
	public List<DepoFarmasi> getObat();
	public int getHargaById(String id, List<DepoFarmasi> listObat);
    public void saveObat(DepoFarmasi depoFarmasi);
    public void updateObat(DepoFarmasi depoFarmasi);
    public void deleteObat(DepoFarmasi depoFarmasi);
}
