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
import DAO.JadwalDokterDAO;
import DAO.PasienDAO;
import DAOImpl.AdminDAOImpl;
import DAOImpl.AppointmentDAOImpl;
import DAOImpl.DepoFarmasiDAOImpl;
import DAOImpl.DokterDAOImpl;
import DAOImpl.ResepDAOImpl;
import DAOImpl.TebusObatDAOImpl;
import DAOImpl.JadwalDokterDAOImpl;
import DAOImpl.PasienDAOImpl;
import pojo.Admin;
import pojo.Appointment;
import pojo.DepoFarmasi;
import pojo.Dokter;
import pojo.Resep;
import pojo.TebusObat;
import test.MainTest;
import pojo.JadwalDokter;
import pojo.Pasien;

public class FormIsian {
	
	public static void registAdmin() {
		Admin adm = new Admin();
		AdminDAO operation = new AdminDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilAdmin(operation.getAdmin());
		try {
			Tabel.tampilAdmin(operation.getAdmin());
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
			MainTest.loginAdmin();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
		}
		scr.close();
	}
	
	public static void addDokter() {
		//List<Dokter> listDkt = new ArrayList<>();
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilDokter2(operation.getDokter());
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
		
			operation.saveDokter(dkt);
			
			System.out.println("Berhasil Ditambahkan....");
			Tabel.tampilDokter(operation.getDokter());
			
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataDokter();
		}
		scr.close();
	}
	
	public static void updateDokter() {
		List<Dokter> listDkt = new ArrayList<>();
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilDokter2(operation.getDokter());
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
			
			System.out.println("Berhasil Diupdate....");
			Tabel.tampilDokter(listDkt);
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataDepo();
		}
		scr.close();
	}
	
	public static void hapusDokter() {
		List<Dokter> listDkt = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String id;
		Dokter dkt = new Dokter();
		DokterDAO operation = new DokterDAOImpl();
		Tabel.tampilDokter2(operation.getDokter());
		try {
			//Tabel.tampilDokter(listDkt);
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			dkt.setId(id);
			operation.deleteDokter(dkt);
			System.out.println("Data Terhapus.....");
			Tabel.tampilDokter(listDkt);
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataDepo();
		}
		
		scanner.close();
	}
	
	public static void addJadwalDokter() {
		//List<JadwalDokter> listJdwl = new ArrayList<>();
		JadwalDokter jadwaldokter = new JadwalDokter();
		JadwalDokterDAO operation = new JadwalDokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.displayJadwalDokter2(operation.getAllJadwalDokter());
		try {
			
			System.out.print("ID Dokter : ");
			jadwaldokter.setId_dokter(scr.nextLine());
			System.out.print("Jadwal : ");
			jadwaldokter.setJadwal_dokter(scr.nextLine());
		
			operation.createJadwal(jadwaldokter);
			
			System.out.println("Data Berhasil Diubah....");
			Tabel.displayJadwalDokter(operation.getAllJadwalDokter());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataJadwal();
		}
		scr.close();
	}
	
	public static void updateJadwalDokter() {
		//List<JadwalDokter> listJdwl = new ArrayList<>();
		JadwalDokter jadwaldokter = new JadwalDokter();
		JadwalDokterDAO operation = new JadwalDokterDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.displayJadwalDokter2(operation.getAllJadwalDokter());
		try {
			
			System.out.print("ID Dokter : ");
			jadwaldokter.setId_dokter(scr.nextLine());
			System.out.print("Jadwal : ");
			jadwaldokter.setJadwal_dokter(scr.nextLine());
		
			operation.updateJadwal(jadwaldokter);
			
			System.out.println("Data Berhasil Diubah....");
			Tabel.displayJadwalDokter(operation.getAllJadwalDokter());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataJadwal();
		}
		scr.close();
	}
	
	public static void hapusJadwalDokter() {
		//List<JadwalDokter> listJdw = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String id;
		JadwalDokter jdw = new JadwalDokter();
		JadwalDokterDAO operation = new JadwalDokterDAOImpl();
		Tabel.displayJadwalDokter2(operation.getAllJadwalDokter());
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			jdw.setId_dokter(id);
			operation.delete(jdw);
			System.out.println("Data Terhapus.....");
			Tabel.displayJadwalDokter(operation.getAllJadwalDokter());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataJadwal();
		}
		
		scanner.close();
	}
	
	public static void addAppo() {
		//List<Appointment> listApo = new ArrayList<>();
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilAppo2(operation.getAllAppointment());
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
			Tabel.tampilAppo(operation.getAllAppointment());
					
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataAppo();
		}
		scr.close();
	}
	
	public static void updateAppo() {
		//List<Appointment> listApo = new ArrayList<>();
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilAppo2(operation.getAllAppointment());
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
			Tabel.tampilAppo(operation.getAllAppointment());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataAppo();
		}
		scr.close();
	}
	
	public static void hapusAppo() {
		//List<Appointment> listApo = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String id;
		Appointment apo = new Appointment();
		AppointmentDAO operation = new AppointmentDAOImpl();
		Tabel.tampilAppo2(operation.getAllAppointment());
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			apo.setId_apt(id);
			operation.deleteAppointment(apo);
			System.out.println("Data Terhapus.....");
			Tabel.tampilAppo(operation.getAllAppointment());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataAppo();
		}
		
		scanner.close();
	}
	
	public static void addResep() {
		//List<Resep> listRsp = new ArrayList<>();
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilResep2(operation.getAllResep());
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
			Tabel.tampilResep(operation.getAllResep());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasDokter.aktifitasDokter();
		}
		scr.close();
	}
	
	public static void updateResep() {
		//List<Resep> listRsp = new ArrayList<>();
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilResep2(operation.getAllResep());
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
			
			System.out.println("Berhasil Diupdate....");
			Tabel.tampilResep(operation.getAllResep());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasDokter.aktifitasDokter();
		}
		scr.close();
	}
	
	public static void hapusResep() {
		//List<Resep> listRsp = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String id;
		Resep rsp = new Resep();
		ResepDAO operation = new ResepDAOImpl();
		Tabel.tampilResep2(operation.getAllResep());
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			rsp.setId_resep(id);
			operation.deleteResep(rsp);
			System.out.println("Data Terhapus.....");
			Tabel.tampilResep(operation.getAllResep());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasDokter.dataResep();
		}
		
		scanner.close();
	}
	
	public static void transaksi() {
		//List<TebusObat> listTrx = new ArrayList<>();
		//List<DepoFarmasi> listDpo = new ArrayList<>();
		//List<Resep> listRsp = new ArrayList<>();
		TebusObat trx = new TebusObat();
		DepoFarmasiDAO dpo = new DepoFarmasiDAOImpl();
		ResepDAO rsp = new ResepDAOImpl();
		TebusObatDAO operation = new TebusObatDAOImpl();
		Scanner scr = new Scanner(System.in);
		char bpjs = 'N';
		
		Tabel.tampilResep2(rsp.getAllResep());
		try {
			
			System.out.print("ID Transaksi : ");
			trx.setId_transaksi(scr.nextLine());
			System.out.print("ID Pasien : ");
			trx.setId_pasien(scr.nextLine());
			System.out.print("ID Resep : ");
			trx.setId_resep(scr.nextLine());
			System.out.print("Apakah pasien memiliki kartu BPJS?(Y/N) : ");
			bpjs = scr.next().charAt(0);
			
			trx.setBiaya(trx.hitungBiaya(dpo.getHargaById(rsp.getObatByIdResep(trx.getId_resep(), rsp.getAllResep()), dpo.getObat()), 1, bpjs));
		
			operation.saveTransaksi(trx);
			dpo.updateObat((dpo.getStokById(rsp.getObatByIdResep(trx.getId_resep(), rsp.getAllResep()), dpo.getObat()) - 1), rsp.getObatByIdResep(trx.getId_resep(), rsp.getAllResep()));
			
			System.out.println("Berhasil Ditambahkan....");
			Tabel.tampilTransaksi(operation.getTransaksi());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataTransaksi();
		}
		scr.close();
	}
	
	public static void addObat() {
		DepoFarmasi dpo = new DepoFarmasi();
		DepoFarmasiDAO operation = new DepoFarmasiDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilDepo2(operation.getObat());
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
			Tabel.tampilDepo(operation.getObat());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataDepo();
		}
		scr.close();
	}
	
	public static void updateObat() {
		DepoFarmasi dpo = new DepoFarmasi();
		DepoFarmasiDAO operation = new DepoFarmasiDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.tampilDepo2(operation.getObat());
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
			Tabel.tampilDepo(operation.getObat());
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataDepo();
		}
		scr.close();
	}
			
	static public void addPasien() {
		Pasien pasien = new Pasien();
		PasienDAO operation = new PasienDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.displayPasien2(operation.getAllPasien());
		try {
			
			System.out.print("ID Pasien : ");
			pasien.setId_pasien(scr.nextLine());
			System.out.print("Nama_Pasien : ");
			pasien.setNama_pasien(scr.nextLine());
			System.out.print("Gejala : ");
			pasien.setGejala(scr.nextLine());
		
			operation.savePasien(pasien);
			
			System.out.println("Berhasil Ditambahkan....");
			Tabel.displayPasien2(operation.getAllPasien());
			AktifitasAdmin.dataPasien();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataPasien();
		}
		scr.close();
	}
	
	static public void updatePasien() {
		Pasien pasien = new Pasien();
		PasienDAO operation = new PasienDAOImpl();
		Scanner scr = new Scanner(System.in);
		Tabel.displayPasien2(operation.getAllPasien());
		try {
			
			System.out.print("ID Pasien : ");
			pasien.setId_pasien(scr.nextLine());
			System.out.print("Nama_Pasien : ");
			pasien.setNama_pasien(scr.nextLine());
			System.out.print("Gejala : ");
			pasien.setGejala(scr.nextLine());
		
			operation.updatePasien(pasien);
			
			System.out.println("Berhasil Diupdate....");
			Tabel.displayPasien2(operation.getAllPasien());
			AktifitasAdmin.dataPasien();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataPasien();
		}
		scr.close();
	}
	
	public static void hapusPasien() {
		//List<Pasien> listPasien = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String id;
		Pasien pasien = new Pasien();
		PasienDAO operation = new PasienDAOImpl();
		Tabel.displayPasien2(operation.getAllPasien());
		try {
			System.out.print("Masukkan ID dari data yang akan dihapus : ");
			id = scanner.nextLine();
			pasien.setId_pasien(id);
			operation.deletePasien(pasien);
			System.out.println("Data Terhapus.....");
			Tabel.displayPasien2(operation.getAllPasien());
			AktifitasAdmin.dataPasien();
		} catch (Exception e) {
			System.out.println("Terjadi Error : " +e.getMessage());
			AktifitasAdmin.dataPasien();
		}
		
		scanner.close();
	}
}
