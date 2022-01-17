package DAO;

import java.util.List;

import pojo.TebusObat;

public interface TebusObatDAO {
	public List<TebusObat> getTransaksi();
    public void saveTransaksi(TebusObat tebus);
    public void deleteTransaksi(TebusObat tebus);
}
