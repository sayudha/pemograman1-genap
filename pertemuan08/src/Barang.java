package Pertemuan08.Latihan01.bin;
import java.math.BigDecimal;

public class Barang {
	private String kode;
	private String nama;
	private BigDecimal harga;
	
	public String getKode(){
		return kode;
	}
	public void setKode(String x){
		kode = x;
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String x){
		nama = x;
	}
	public BigDecimal getHarga(){
		return harga;
	}
	public void setHarga(BigDecimal x){
		harga = x;
	}
}