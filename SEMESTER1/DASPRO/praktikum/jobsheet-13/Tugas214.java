import java.util.Scanner;

public class Tugas214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();

        System.out.print("Masukkan Jumlah Tugas : ");
        int jmlTgs = sc.nextInt();

        String[][] nilaiMhs = new String[jmlMhs][jmlTgs + 1];

        inputNilai(nilaiMhs);
        showNilaiMhs(nilaiMhs);
        mingguNilaiTertinggi(nilaiMhs, 1);
        mahasiswaNilaiTertinggi(nilaiMhs);
    }

    public static void mahasiswaNilaiTertinggi(String[][] nilaiMhs) {
        int nilaiTertinggi = Integer.parseInt(nilaiMhs[0][1]);
        String nama = nilaiMhs[0][0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 1; j < nilaiMhs[i].length; j++) {
                int nilai = Integer.parseInt(nilaiMhs[i][j]);
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    nama = nilaiMhs[i][0];
                }
            }
        }
        System.out.println("Diraih oleh : " + nama);
    }

    public static void mingguNilaiTertinggi(String[][] nilaiMhs, int minggu) {
        int nilaiTertinggi = Integer.parseInt(nilaiMhs[0][1]);
        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 1; j < nilaiMhs[i].length; j++) {
                int nilai = Integer.parseInt(nilaiMhs[i][j]);
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    minggu = j;
                }
            }
        }
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi + ", pada minggu ke - " + minggu);
    }

    public static void showNilaiMhs(String[][] nilaiMhs) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("\nNama Mahasiswa : " + nilaiMhs[i][0]);
            for (int j = 1; j < nilaiMhs[i].length; j++) {
                System.out.println("Nilai Minggu ke - " + j + " : " + nilaiMhs[i][j]);
            }
            System.out.println();
        }
    }

    public static void inputNilai(String[][] nilaiMhs) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("\nMasukkan nama mahasiswa : ");
            nilaiMhs[i][0] = sc.nextLine();

            for (int j = 1; j < nilaiMhs[i].length; j++) {
                System.out.print("\nNilai minggu ke - " + j);
                System.out.print("\nMasukkan nilai : ");
                nilaiMhs[i][j] = sc.nextLine();
            }
        }
    }
}
