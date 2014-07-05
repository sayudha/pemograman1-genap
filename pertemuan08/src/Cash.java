package Pertemuan08.Latihan01.bin;
import java.math.BigDecimal;

public class Cash extends Pembayaran{
	private BigDecimal dibayar;
	private Transaksi transaksi;
	
	public BigDecimal getDibayar(){
		return dibayar;
	}
	
	public void setDibayar(BigDecimal x){
		dibayar = x;
	}
	
	public BigDecimal hitungKembali(){
		return transaksi.hitungTagihan().subtract(dibayar);
	}
}