import java.util.Scanner;

public class ArrayIPK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matkul yg anda ambil : ");
        int jmlMK = sc.nextInt();
        sc.nextLine();

        String[] mk = new String[jmlMK];

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nama matkul " + i + ": ");
            mk[i] = sc.nextLine();
        }

        int[] sks = new int[jmlMK];
        String[] nilai = new String[jmlMK];
        double[] nilaiAngka = new double[jmlMK];
        double total = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.print("\nMasukkan bobot SKS " + mk[i] + " : ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai " + mk[i] + "(A, B+, B, C, D) : ");
            nilai[i] = sc.nextLine();
            if (nilai[i].equalsIgnoreCase("A")) {
                nilaiAngka[i] = 4;
            } else if (nilai[i].equalsIgnoreCase("B+")) {
                nilaiAngka[i] = 3.5;
            } else if (nilai[i].equalsIgnoreCase("B")) {
                nilaiAngka[i] = 3;
            } else if (nilai[i].equalsIgnoreCase("C")) {
                nilaiAngka[i] = 2.5;
            } else if (nilai[i].equalsIgnoreCase("D")) {
                nilaiAngka[i] = 1;
            } else {
                nilaiAngka[i] = 0;
            }
            total += nilaiAngka[i];
        }
        System.out.println(total);

        double nilaiIPK = total / jmlMK;
        System.out.print("IPK semester anda adalah : " + nilaiIPK);        
    }
}
