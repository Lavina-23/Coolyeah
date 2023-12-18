import java.util.Scanner;

public class ArrayNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[5];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai UTS MHS ke - " + i + ": ");
            nilai[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                System.out.println("Mahasiswa ke - " + i + " lulus !");
            } else {
                System.out.println("Mahasiswa ke - " + i + " LALALLA !");
            }
        }

        sc.close();
    }
}
