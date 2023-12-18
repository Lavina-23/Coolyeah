import java.util.Scanner;

public class tugas1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siswa = 0;
        
        System.out.print("Masukkan jumlah siswa : ");
        siswa = sc.nextInt();

        int[] nilai = new int[siswa];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai siswa ke - " +(i+1)+ " : ");
            nilai[i] = sc.nextInt();
        }

        double total = 0;
        double rata2 = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        rata2 = total/nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } else {
                terendah = nilai[i];
            }
        }
        sc.close();

        System.out.println("Rata-rata nilai   : " + rata2);
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);
    }
}
