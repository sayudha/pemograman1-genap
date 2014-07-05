//Perintah Inheritance
package Pertemuan9.Latihan2.bin;
	public class TesKucingBesar
	{
		public static void main(String[]Sayudha)
		{
		
			Singa mySinga = new Singa("SIMBABA SURAI");
			System.out.println("Singa merupakan " +Singa.nama);
			mySinga.Makan();
			
			Harimau myHarimau =  new Harimau("Harimau SUMATERA ");
			System.out.println("Harimau Merupakan " +Harimau.nama);
			myHarimau.Makan();
		}
	}