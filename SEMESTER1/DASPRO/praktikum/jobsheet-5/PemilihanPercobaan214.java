import java.util.Scanner;

public class PemilihanPercobaan214 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        String nilaiHuruf = "", kualifikasi = "";
        double nilaiSetara = 0;
        
        System.out.print("Nilai UAS     : ");
        float uas = input14.nextFloat();
        System.out.print("Nilai UTS     : ");
        float uts = input14.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input14.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input14.nextFloat();
        input14.close();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);

        
            if (total > 80 && total <= 100) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
                kualifikasi = "Sangat Baik";
            } else if (total > 73 && total <= 80) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
                kualifikasi = "Lebih dari baik";
            } else if (total > 65 && total <= 73) {
                nilaiHuruf = "B";
                nilaiSetara = 3;
                kualifikasi = "Baik";
            } else if (total > 60 && total <= 65) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
                kualifikasi = "Lebih dari cukup";
            } else if (total > 50 && total <= 60) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
                kualifikasi = "Cukup";
            } else if (total > 39 && total <= 50) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
                kualifikasi = "Kurang";
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0;
                kualifikasi = "Gagal";
            }

        System.out.println("Nilai akhir   : " + total);
        System.out.println("Nilai huruf   : " + nilaiHuruf);
        System.out.println("Nilai setara  : " + nilaiSetara);
        System.out.println("Kualifikasi   : " + kualifikasi);


        // String message = total < 65 ? "Remidi" : "Tidak remidi";

        // System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
