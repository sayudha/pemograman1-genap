package Pertemuan6.bin;

public class DemoClassObject1
{
     public static void main (String[] sayudha)
	 {
	 
	     Mahasiswa.jumlah =0;
		 System.out.println("Jumlah mahasiswa :" +Mahasiswa.jumlah);
		 
		 Mahasiswa m1 = new Mahasiswa();
		 m1.nim = "123";
		 m1.nama= "Sayudha";
		 m1.jumlah= 1 ;
		 
		 Mahasiswa m2 = new Mahasiswa();
		 m2.nim = "456";
		 m2.nama ="Patria";
		 m2.jumlah=2;
		 
		 
		 tampilkanMahasiswa(m1);
		 tampilkanMahasiswa(m2);
		 System.out.println("Jumlah Mahasiswa : " +Mahasiswa.jumlah);
		 
	}
	public static void tampilkanMahasiswa(Mahasiswa m)
	
	{
	
	   System.out.println(" NIM    : " +m.nim);
	   System.out.println(" Nama   : " +m.nama);
	   System.out.println(" Jumlah : " +m.jumlah);
	   System.out.println(" ");
	   System.out.println(" ");
	}
}