package Praktikum09.Latihan3.bin;

public class Jeep extends Mobil{
	String Nama;
	String NoPolisi;
	int Kecepatan;

	public Jeep(String aNama, String aNoPolisi, int aKecepatan){
		super("Jeep");
		Nama = aNama;
		NoPolisi = aNoPolisi;
		Kecepatan = aKecepatan;
	}

	public void Display(){
		System.out.println("Nama Mobil        = " + this.Nama);
		System.out.println("Nomor Mobil       = " + this.NoPolisi);
		System.out.println("Kecepatan Mobil   = " + this.Kecepatan);
	}
}