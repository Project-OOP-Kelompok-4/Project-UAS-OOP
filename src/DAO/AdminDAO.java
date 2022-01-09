package DAO;

import java.util.List;

//import java.util.List;

import pojo.Admin;

public interface AdminDAO {
	public List<Admin> getAdmin();
    public void getAdminByName(String name);
    public void getAdminByEmail(String email);
    public void saveAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public void deleteAdmin(Admin admin);
    public Admin login(String email, String password);
}
