import java.util.Scanner;

/**
 * uts
 */
public class uts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata, ipk;

        System.out.print("Masukkan jumlah peserta : ");
        int peserta = sc.nextInt();

        int i = 0;

        while (i < peserta) {
            System.out.print("\nMasukkan nilai tes potensi akademik peserta ke - " + (i+1) + " : ");
            int nilai1 = sc.nextInt();
            System.out.print("Masukkan nilai tes bahasa Inggris peserta ke - " + (i+1) + "   : ");
            int nilai2 = sc.nextInt();
            System.out.print("Masukkan nilai tes nasionalisme peserta ke - " + (i+1) + "     : ");
            int nilai3 = sc.nextInt();
            
            rata = ((double) nilai1 + nilai2 + nilai3) / 3;
            System.out.println("\nRata-rata nilai peserta : " + rata);
            
            if (rata >= 78) {
                if (nilai1 >= 75 && nilai2 >= 75 && nilai3 >= 75) {
                    System.out.println("Peserta ke - " + (i+1) +  " Lolos Tes !");
                    System.out.print("\nMasukkan nilai IPK peserta ke - " + (i+1) + " : ");
                    ipk = sc.nextDouble();
                    if (ipk >= 3.25) {
                        System.out.println("Peserta ke - " + (i+1) + " Lolos Seleksi Berkas !");
                        System.out.println("\n======== Hasil Tes Kesehatan =======");
                        System.out.println("1. Sehat jasmani rohani \n2. Sakit jasmani rohani");
                        System.out.print("Pilih menu 1 atau 2 : ");
                        int hasilTes = sc.nextInt();
                        if (hasilTes == 1) {
                            System.out.println("\nPeserta ke - " + (i+1) + " Lolos Tahap Akhir !");
                        } else if (hasilTes == 2) {
                            System.out.println("\nPeserta ke- " + (i+1) + " Tidak Lolos Seleksi Tes Kesehatan");
                        } else {
                            System.out.println("Menu yang anda masukkan tidak valid !");
                        }
                    } else {
                        System.out.println("\nPeserta ke - " + (i+1) + " Tidak Lolos Seleksi Berkas");
                    }
                } else {
                    System.out.println("\nPeserta ke- " + (i+1) + " Tidak Lolos Tes Karena Terdapat Nilai yg Dibawah 75");
                }
            } else {
                System.out.println("\nPeserta ke- " + (i+1) + " Tidak Lolos Tes");
            }
            i++;
            
        }
        sc.close();
    }
}