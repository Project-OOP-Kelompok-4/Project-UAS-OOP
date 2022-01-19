package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.AdminDAO;
import DAO.AppointmentDAO;
import DAO.DepoFarmasiDAO;
import DAO.DokterDAO;
import DAO.ResepDAO;
import DAO.TebusObatDAO;
import DAOImpl.AdminDAOImpl;
import DAOImpl.AppointmentDAOImpl;
import DAOImpl.DepoFarmasiDAOImpl;
import DAOImpl.DokterDAOImpl;
import DAOImpl.ResepDAOImpl;
import DAOImpl.TebusObatDAOImpl;
import pojo.Admin;
import pojo.Appointment;
import pojo.DepoFarmasi;
import pojo.Dokter;
import pojo.Resep;
import pojo.TebusObat;

public class FormIsian {
	
	public static void registAdmin() {
		Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Admin : ");
			adm.setId(scr.nextLine());
			System.out.print("Nama : ");
			adm.setNama(scr.nextLine());
			System.out.print("Email : ");
			adm.setEmail(scr.nextLine());
			System.out.print("Password : ");
			adm.setPassword(scr.nextLine());
		
			operation.saveAdmin(adm);
			
			System.out.println("Berhasil Registrasi....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void addDokter() {
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Dokter : ");
			dkt.setId(scr.nextLine());
			System.out.print("Nama : ");
			dkt.setNama(scr.nextLine());
			System.out.println("Spesialis : ");
			dkt.setSpesialis(scr.nextLine());
			System.out.print("Email : ");
			dkt.setEmail(scr.nextLine());
			System.out.print("Password : ");
			dkt.setPassword(scr.nextLine());
		
			operation.saveDokter(dkt);
			
			System.out.println("Berhasil Ditambahkan....");
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void updateDokter() {
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Dokter : ");
			dkt.setId(scr.nextLine());
			System.out.print("Nama : ");
			dkt.setNama(scr.nextLine());
			System.out.print("Spesialis : ");
			dkt.setSpesialis(scr.nextLine());
			System.out.print("Email : ");
			dkt.setEmail(scr.nextLine());
			System.out.print("Password : ");
			dkt.setPassword(scr.nextLine());
		
			operation.updateDokter(dkt);
			
			System.out.println("Data Berhasil Diubah....");
			AktifitasAdmin.dataDokter();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void hapusDokter() {
		Scanner scanner = new Scanner(System.in);
		String id;
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			dkt.setId(id);
			operation.deleteDokter(dkt);
			System.out.println("Data Terhapus.....");
			AktifitasAdmin.dataDokter();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		
		scanner.close();
	}
	
	public static void addAppo() {
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Appo : ");
			apo.setId_apt(scr.nextLine());
			System.out.print("ID Pasien : ");
			apo.setId_pasien(scr.nextLine());
			System.out.print("ID Resep : ");
			apo.setId_resep(scr.nextLine());
			System.out.print("Jadwal : ");
			apo.setJadwal(scr.nextLine());
		
			operation.saveAppointment(apo);
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasAdmin.dataAppo();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void updateAppo() {
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Appo : ");
			apo.setId_apt(scr.nextLine());
			System.out.print("ID Pasien : ");
			apo.setId_pasien(scr.nextLine());
			System.out.print("ID Resep : ");
			apo.setId_resep(scr.nextLine());
			System.out.print("Jadwal : ");
			apo.setJadwal(scr.nextLine());
		
			operation.updateAppointment(apo);
			
			System.out.println("Berhasil Diupdate....");
			AktifitasAdmin.dataAppo();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void hapusAppo() {
		Scanner scanner = new Scanner(System.in);
		String id;
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			apo.setId_apt(id);
			operation.deleteAppointment(apo);
			System.out.println("Data Terhapus.....");
			AktifitasAdmin.dataAppo();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		
		scanner.close();
	}
	
	public static void addResep() {
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Resep : ");
			rsp.setId_resep(scr.nextLine());
			System.out.print("ID Obat : ");
			rsp.setId_obat(scr.nextLine());
			System.out.print("ID Pasien : ");
			rsp.setId_pasien(scr.nextLine());
			System.out.print("Dosis : ");
			rsp.setDosis(scr.nextLine());
		
			operation.saveResep(rsp);
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void updateResep() {
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Resep : ");
			rsp.setId_resep(scr.nextLine());
			System.out.print("ID Obat : ");
			rsp.setId_obat(scr.nextLine());
			System.out.print("ID Pasien : ");
			rsp.setId_pasien(scr.nextLine());
			System.out.print("Dosis : ");
			rsp.setDosis(scr.nextLine());
		
			operation.updateResep(rsp);
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void hapusResep() {
		Scanner scanner = new Scanner(System.in);
		String id;
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			rsp.setId_resep(id);
			operation.deleteResep(rsp);
			System.out.println("Data Terhapus.....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		
		scanner.close();
	}
	
	public static void transaksi() {
		List<DepoFarmasi> listDpo = new ArrayList<>();
		List<Resep> listRsp = new ArrayList<>();
		TebusObat trx = new TebusObat();
		DepoFarmasiDAO dpo = new DepoFarmasiDAOImpl();
		ResepDAO rsp = new ResepDAOImpl();
		TebusObatDAO operation = new TebusObatDAOImpl();
		Scanner scr = new Scanner(System.in);
		char bpjs = 'N';
		try {
			
			System.out.print("ID Transaksi : ");
			trx.setId_transaksi(scr.nextLine());
			System.out.print("ID Pasien : ");
			trx.setId_pasien(scr.nextLine());
			System.out.print("ID Resep : ");
			trx.setId_resep(scr.nextLine());
			System.out.println("Apakah pasien memiliki kartu BPJS?(Y/N)");
			bpjs = scr.next().charAt(0);
			
			trx.setBiaya(trx.hitungBiaya(dpo.getHargaById(rsp.getObatByIdResep(trx.getId_resep(), listRsp), listDpo), 1, bpjs));
		
			operation.saveTransaksi(trx);
			dpo.updateObat((dpo.getStokById(rsp.getObatByIdResep(trx.getId_resep(), listRsp), listDpo) - 1), rsp.getObatByIdResep(trx.getId_resep(), listRsp));
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void addObat() {
		DepoFarmasi dpo = new DepoFarmasi();
		DepoFarmasiDAO operation = new DepoFarmasiDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Obat : ");
			dpo.setId_obat(scr.nextLine());
			System.out.print("Nama Obat : ");
			dpo.setNama_obat(scr.nextLine());
			System.out.print("Stok : ");
			dpo.setStok(scr.nextInt());
			System.out.print("Harga : ");
			dpo.setHarga(scr.nextInt());
		
			operation.saveObat(dpo);
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void updateObat() {
		DepoFarmasi dpo = new DepoFarmasi();
		DepoFarmasiDAO operation = new DepoFarmasiDAOImpl();
		Scanner scr = new Scanner(System.in);
		try {
			
			System.out.print("ID Obat : ");
			dpo.setId_obat(scr.nextLine());
			System.out.print("Nama Obat : ");
			dpo.setNama_obat(scr.nextLine());
			System.out.print("Stok : ");
			dpo.setStok(scr.nextInt());
			System.out.print("Harga : ");
			dpo.setHarga(scr.nextInt());
		
			operation.updateObat(dpo);
			
			System.out.println("Berhasil Ditambahkan....");
			AktifitasDokter.dataResep();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
}
