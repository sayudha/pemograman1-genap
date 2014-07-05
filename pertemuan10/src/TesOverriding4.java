package Pertemuan10d.bin;

public class TesOverriding4
{
	public static void main (String[] sayudha)
	{
		KomunitasPT2 DtJRS = new KomunitasPT2("Teknik Informatika","Jakarta Selatan","LK");
		Karyawan2 KA = new Karyawan2("Sayudha Patria S.T", "Jakarta","Laki-Laki",216,2000000);
		System.out.println();
		DtJRS.Tampilkan3();
		System.out.println();
		KA.Tampilkan3();
	}
}
	
		