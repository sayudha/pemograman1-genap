package Pertemuan10b.bin;
class Segi3 extends Bentuk
{
	public Segi3(int a, int b)
	{
	
		this.a= a;
		this.b= b;
		
	}
	
	public String getBentuk()
	{
		return "Bentuk Persegi Tiga ";
		
	}
	public int HitungLuas()
	{
		return a*b/2;
	}
}