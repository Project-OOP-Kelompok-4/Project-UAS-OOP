package pojo;

public class TebusObat {
	private String id_transaksi;
	private String id_pasien;
	private String id_resep;
	private int biaya;
	
	public String getId_transaksi() {
		return id_transaksi;
	}
	public void setId_transaksi(String id_transaksi) {
		this.id_transaksi = id_transaksi;
	}
	public String getId_pasien() {
		return id_pasien;
	}
	public void setId_pasien(String id_pasien) {
		this.id_pasien = id_pasien;
	}
	public String getId_resep() {
		return id_resep;
	}
	public void setId_resep(String id_resep) {
		this.id_resep = id_resep;
	}
	public int getBiaya() {
		return biaya;
	}
	public void setBiaya(int biaya) {
		this.biaya = biaya;
	}
	public int hitungBiaya(int harga, int jumlah, char bpjs) {
		
		if((bpjs == 'Y') || (bpjs == 'y')) {
			this.biaya = harga * jumlah - (10/100);
		}else {
			this.biaya = harga * jumlah;
		}
		
		return biaya;
	}
	
	
}
