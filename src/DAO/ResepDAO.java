package DAO;

import java.util.List;

import pojo.Resep;

public interface ResepDAO {
    public String getResepByIdResep(String id_resep);  
    public List<Resep> getAllResep();
    public void saveResep(Resep resep);
    public void updateResep(Resep resep);
    public void deleteResep(Resep resep);
}
