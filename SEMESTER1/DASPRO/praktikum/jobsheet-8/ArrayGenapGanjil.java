import java.util.Scanner;

public class ArrayGenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlAngka = 0;

        System.out.print("Masukkan jumlah angla : ");
        jmlAngka = sc.nextInt();

        int[] angka = new int[jmlAngka];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke - " + i + " : ");
            angka[i] = sc.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print("Angka genap : " +angka[i]);
            } else {
                System.out.println("Angka ganjil : "+angka[i]);
            }
        }

        sc.close();
    }
}
