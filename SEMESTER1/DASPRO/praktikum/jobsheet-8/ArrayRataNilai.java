import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int mhs, mhsLulus = 0, mhsTidakLulus = 0;
        double total1 = 0, total2 = 0;
        double rata1 = 0, rata2 = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        mhs = sc.nextInt();

        for (int i = 0; i < mhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < mhs; i++) {
            if (nilaiMhs[i] > 70) {
                total1 += nilaiMhs[i];
                mhsLulus++;
            } else {
                total2 += nilaiMhs[i];
                mhsTidakLulus++;
            }
        }
        sc.close();

        rata1 = total1/mhsLulus;
        rata2 = total2/mhsTidakLulus;

        System.out.println("Rata-rata nilai lulus = " +rata1);
        System.out.println("Rata-rata nilai tidak lulus = " +rata2);
    }
}
