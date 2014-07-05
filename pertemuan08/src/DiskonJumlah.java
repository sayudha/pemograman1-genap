package Pertemuan08.Latihan01.bin;
import java.math.BigDecimal;

public class DiskonJumlah{
	private BigDecimal persentase;
	private BigDecimal nilaiMinimum;
	
	public BigDecimal hitung(Transaksi t){
		if(t.hitungTagihan().compareTo(nilaiMinimum) > 0){
			return persentase.multiply(t.hitungTagihan());
		}else{
			return BigDecimal.ZERO;
		}
	}
	
}