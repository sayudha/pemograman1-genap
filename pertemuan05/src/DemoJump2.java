package Pertemuan05.bin;
import java.util.Random;
public class DemoJump2   {
    public static void main (String [] sayudha)  {
	Integer faktor =7;
	Integer jumlahFaktorDiinginkan = 4 ;
	Integer batasAtas = 1000000;
	System.out.println("Mencari Kelipatan "+faktor + " dengan break dan continue");
	Integer jumlahFaktorDitemukan =0;
	while(true)    {
		Integer random = new Random ().nextInt();
		System.out.println("Bilangan Random : " +random);
		if(random > batasAtas)   {
		   System.out.println("melewati batas atas, langsung selesai ");
		   return;   }
		   
		if (random % faktor == 0)  {
		    System.out.println("Kelipatan " +faktor + " ditemukan, yaitu : " +random);
			jumlahFaktorDitemukan++;
			if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan)    {
			   System.out.println("Baru menemukan "+jumlahFaktorDiinginkan + " Yang diminta, lanjut lagi");
			   continue;    }
			else        {
			    System.out.println("Sudah menemukan " +jumlahFaktorDiinginkan + " selesai looping ");
				break;
			}      }       }
	System.out.println("Selesai Mencari Kelipatan "); }  }
	
	