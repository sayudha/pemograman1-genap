//Latihan Variabel
package Latihan01.sesi1.bin;

 public class DemoVariabel1{
 public static void main (String [] Sayudha ){
   int x=10 ;
   System.out.println("Nilai X adalah " +x);
   
    char z='a' ;
     System.out.println("Nilai Z adalah " +z);
   
   //isi data ke tipe yang tidak tepat
   
    int y=z;
     System.out.println("Nilai Y adalah " +y);
	//tidak bisa compile (error)
	/*
	 char w=x;
	 System.out.println("Nilai w adalah " +x);
	 */
	 //type casting 
	 char v=(char) x;
	  System.out.println("Nilai V adalah " +v);
	  System.out.println("Baris Selanjutnya");
	  
	  coba();
	   System.out.println("Setelah Menjalankan coba");
	   
	  }
	  static char v;
	  
	
	  public static void coba(){
	  System.out.println("Nilai V adalah "+v);
	  short d=15;
	  System.out.println("D adalah "+d);
    }
	
 
}