public class transaksi {
    int pendaftaran;
    int obat;
    int vitamin;
    int dokter;
    transaksi (int pendaftaran,int obat,int vitamin,int dokter){
        this.pendaftaran = pendaftaran;
        this.obat = obat;
        this.vitamin = vitamin;
        this.dokter = dokter;
    }

    

    public void biaya ()
    {
        System.out.println("Masukkan Biaya Pendaftaran  "+pendaftaran);
        System.out.println("Masukkan Biaya Obat         "+obat);
        System.out.println("Masukkan Biaya Vitamin      "+vitamin);
        System.out.println("Masukkan Biaya Dokter       "+dokter);
        System.out.println("----------------------------");

        
       
    }

    public int totalHarga()
    {
        return pendaftaran+obat+vitamin+dokter;
    }

    public void totalBiaya()
    {
        System.out.println("Total Biaya yang di Bayar Pasien "+totalHarga());
    }
}
