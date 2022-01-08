package DAO;

//import java.util.List;

import pojo.Admin;

public interface AdminDAO {
	public void getAdminById(String id);
    public void getAdminByName(String name);
    public void getAdminByEmail(String email);
    public void saveAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public void deleteAdmin(Admin admin);
}
