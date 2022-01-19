package DAO;

import java.util.List;

import pojo.Resep;

public interface ResepDAO {
    public String getObatByIdResep(String id_resep, List<Resep> rsp);  
    public List<Resep> getAllResep();
    public void saveResep(Resep resep);
    public void updateResep(Resep resep);
    public void deleteResep(Resep resep);
}
