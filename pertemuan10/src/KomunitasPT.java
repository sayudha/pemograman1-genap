package Pertemuan10c.bin;
public class KomunitasPT  {
protected String Nama;
protected String Alamat;
protected String Jk;

KomunitasPT(String NAMA,String ALAMAT, String JK)  {

	Nama = NAMA ;
	Alamat = ALAMAT;
	Jk = JK;
	
	}
	
	public void Tampilkan1()  {
		System.out.println("Nama	= " +Nama);
		System.out.println("Alamat  = " +Alamat);
		System.out.println("Jenis Kelamin = " +Jk);
		}
}