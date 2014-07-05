//Perintah Control Flow /Struktur Kontrol
//Perintah PErtama - contoh 02
package Pertemuan05.bin;
public class DemoLooping 
  {
     public static void main (String [] sayudha)
	 {
	   String [][] daftarNilai = new String[][]
	   {
	      new String []{"001" , "A"},
		  new String []{"002" , "B"},
		  new String []{"003" , "C"},
		  
		};
		System.out.println("LOOPING Menggunakan for");
		
		for(int i=0;i<daftarNilai.length;i++)
		{
		System.out.println("NPM   :  "+daftarNilai[i][0]);
		System.out.println("NILAI :  "+daftarNilai[i][1]);
		
		}
		System.out.println("SELESAI LOOPING FOR");
		System.out.println();
		System.out.println();
		System.out.println("LOOPING MENGGUNAKAN WHILE");
		
		int ix =0;
		
		while (ix <daftarNilai.length)
		
		{
		  System.out.println("NPM   :  "+daftarNilai[ix][0]);
		  System.out.println("NILAI :  "+daftarNilai[ix][1]);
		  ix++;
		 }
		System.out.println("SELESAI LOOPING while");
		
	}
}	
		
		