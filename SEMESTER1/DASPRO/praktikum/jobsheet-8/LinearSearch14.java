import java.util.Scanner;

public class LinearSearch14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int[] arrayInt = {34,18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int array = 0;
        boolean hasil = false;

        System.out.print("Masukkan jumlah array : ");
        array = sc.nextInt();

        arrayInt = new int[array];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke - "+i+ " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = true;
                break;
            }
        }

        if (hasil != true) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ditemukan");
        }
        sc.close();
    }
}
