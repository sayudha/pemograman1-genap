public class Tabung

{
	private String Nama;
	private int NoRek;
	private int Saldo;
	private int	Pin;
	
	public Tabung (String Nama, int NOREK)
	{
		Nama = NAMA;
		NoRek = NOREK;
		Pin = 666666;
	}
	
	public void Simpan(int Sal ){
		Saldo = Saldo + Sal; }
		
	public void Tarik (int jmlTarik) {
		Saldo = Saldo - jmlTarik;}
	
	public int getSaldo()
	{
		return Saldo;
	}
	
	public void setSaldo(int Sal)
	{
		Saldo = Sal;
	}
	
	public void setPin(int PinBaru)
	{
		Pin = PinBaru;
		
	}
	
	public static void main (String sayudha[])
	{
		int jmlTarik = 100000,jmlSimpan = 500000;
		Tabung TAB = new Tabung ("Sayudha Patria", 213026);
		System.out.println("Saldo Awalnya Adalah = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
		System.out.println("Saldo Setelah Penarikan = " +TAB.getSaldo());
		TAB.Simpan(jmlSimpan);
		System.out.println("Saldo Setelah di Setor = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
		}
	}