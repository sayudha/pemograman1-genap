package Praktikum09.Latihan3.bin;

public class Mobil{
	private String Jenis;

	public Mobil(String aTipe){
		Jenis = new String(aTipe);
	}

	public String JenisMobil(){
		return "Merupakan Jenis Mobil = " + Jenis;
	}
}