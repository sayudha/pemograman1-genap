package Pertemuan08.Latihan01.bin;
import java.math.BigDecimal;

public class TransaksiDetail {
	private Barang barang;
	private Integer jumlah;
	
	public BigDecimal subtotal(){
		return barang.getHarga().multiply(new BigDecimal(jumlah));
	}
}