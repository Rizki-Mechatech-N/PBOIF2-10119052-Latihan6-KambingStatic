package pboif2.pkg10119052.latihan6.kambingstatic;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * variabel jumlah kambing yang terdapat pada kelas mamalia
 * 
 */
public class Mamalia {
    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}


public class PBOIF210119052Latihan6KambingStatic {
    // NAMA_KAMBING sebagai konstanta
       public static final String NAMA_KAMBING = "MIDUN";
       
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                           + Mamalia.jumlahKambing);
    }
    
}
