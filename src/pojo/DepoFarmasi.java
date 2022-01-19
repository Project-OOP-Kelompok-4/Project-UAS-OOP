package pojo;

public class DepoFarmasi {
	//private String id_depo;
	private String id_obat;
	private String nama_obat;
	private int stok;
	private int harga;
	
	public String getNama_obat() {
		return nama_obat;
	}
	public void setNama_obat(String nama_obat) {
		this.nama_obat = nama_obat;
	}
	public String getId_obat() {
		return id_obat;
	}
	public void setId_obat(String id_obat) {
		this.id_obat = id_obat;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	
}
