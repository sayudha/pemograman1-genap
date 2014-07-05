package Praktikum09.Latihan4.bin;

public class KuliahApply{
	public static void main(String[] sayudha){
		Dosen DOS = new Dosen("Candra Nursari",45,"Depok","Menikah","007","03","Lektor Kepala",1500000);
		Mahasiswa MH = new Mahasiswa("Sayudha Patria",20,"Jakarta","Mahasiswa","0838272782330","4512216073",4);

		System.out.println(DOS.Display());
		System.out.println(MH.Display());
	}
}