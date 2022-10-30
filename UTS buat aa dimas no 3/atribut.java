import java.util.Scanner;
public class atribut {
    
    Scanner scanner = new Scanner(System.in);

    String nama;
    String alamat;
    String noTelp;
    String input;
    String namaDokter = "";
    String keteranganDokter;

   
    
         public String namaPoli = "";
    
    


    public void data ()
    {
        System.out.println("Masukkan Data Pasien");
        System.out.print("Masukkan Nama    : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Alamat  : ");
        alamat = scanner.nextLine();
        System.out.print("Masukkan No.Telp : ");
        noTelp = scanner.nextLine();

        
        System.out.println("Nama Poli");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");

        System.out.print("Pilih Poli : ");
        input = scanner.nextLine();

       

        switch(input)
        {
            case "1": 
            namaPoli = "Gigi";
            System.out.println("Nama Dokter");
            System.out.println("1. drg. dimas");
            System.out.println("2. drg. muhammad");
            System.out.println("3. drg. saddam");

            System.out.print("Pilih Dokter : ");
            input = scanner.nextLine();

            switch(input)
            {
                case "1": 
               namaDokter = "drg. dimas";
               break;
            
                case "2":
                namaDokter = "drg. muhammad";
                break;

                case "3":
            namaDokter = "drg. saddam";
                break;

            }

         
            break;
           

            case "2": 
            namaPoli = "Anak";
            System.out.println("Nama Dokter");
            System.out.println("1. drg. Ahmad Afandi");
            System.out.println("2. dr. Aris Wicaksono, Sp.A.");
            System.out.println("3. dr. Alfia Putri");
            System.out.print("Pilih Dokter : ");
            input = scanner.nextLine();

            switch(input)
            {   
                case "1":
                 namaDokter = "drg. Ahmad Afandi";
                 break;
                case "2":
                 namaDokter = "dr. Aris Wicaksono, Sp.A.";
                 break;
                case "3":
                namaDokter = "dr. Alfia Putri";
                break;
            
            }
           
    
            break;

            case "3": namaPoli = "Umum";
            System.out.println("Nama Dokter");
            System.out.println("1. drg. Alif");
            System.out.println("2. drg. Muharis");
            System.out.println("3. drg. Saifuddin");
            System.out.print("Pilih Dokter : ");
            input = scanner.nextLine();

            switch ( input )
            { 
                case "1": 
                namaDokter = "drg. Alif";
                break;
            
                case "2":
                  namaDokter = "drg. Muharis";
                break;

                case "3":
                namaDokter = "drg. Saifuddin";
                break;
               
            }
          
            break;

            default: System.out.println("Pilihan Tidak Tersedia");
            break;
        }

        
        System.out.print("Berikan Keterangan Dokter : ");
        keteranganDokter = scanner.nextLine();
       
        
      
        



    }

    public void keterangan()
    {
       
        System.out.println("Poli        : "+namaPoli);
        System.out.println("Dokter      : "+namaDokter);
        System.out.println("Keterangan  : "+keteranganDokter);
    }


}
