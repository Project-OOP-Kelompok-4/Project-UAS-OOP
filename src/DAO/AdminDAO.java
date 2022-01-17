package DAO;

import java.util.List;

//import java.util.List;

import pojo.Admin;

public interface AdminDAO {
	public List<Admin> getAdmin();
    public void saveAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public void deleteAdmin(Admin admin);
    public Admin login(String email, String password);
}
