public class main {
    public static void main ( String args [])
    {

        atribut atribut = new atribut();

        atribut.data();
    
        transaksi transaksi = new transaksi(500000,150000,0,135000);
        transaksi.biaya();

        atribut.keterangan();
        transaksi.totalBiaya();

        System.out.println("Salam Sehat Dimas dari Rumah Sakit Waras");
      
        



    }
}
