import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nilaiHuruf = "";

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas     : ");
        float tugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis      : ");
        float kuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS       : ");
        float uts = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS       : ");
        float uas = sc.nextFloat();
        sc.close();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {

            float total = (uas * 0.3F) + (uts * 0.3F) + (kuis * 0.2F) + (tugas * 0.2F);

            if (total > 80 && total <= 100) {
                nilaiHuruf = "A";
            } else if (total > 73 && total <= 80) {
                nilaiHuruf = "B+";
            } else if (total > 65 && total <= 73) {
                nilaiHuruf = "B";
            } else if (total > 60 && total <= 65) {
                nilaiHuruf = "C+";
            } else if (total > 50 && total <= 60) {
                nilaiHuruf = "C";
            } else if (total > 39 && total <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai akhir   : " + total);
            System.out.println("Nilai huruf   : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            if (total <= 100 && total > 50) {
                System.out.println("SELAMAT ANDA LULUS !");
            } else {
                System.out.println("MAAF ANDA BELUM LULUS !");
            }
        } else {
            System.out.println("Nilai Tidak Valid !");
            System.out.println("==============================");
            System.out.println("==============================");
        }

    }
}