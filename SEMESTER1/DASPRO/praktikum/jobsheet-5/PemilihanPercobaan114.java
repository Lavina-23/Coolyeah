import java.util.Scanner;
/**
 * PemilihanPercobaan114
 */
public class PemilihanPercobaan114 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input14.nextInt();

        System.out.println((angka % 2 == 0)? "Bilangan genap":"Bilangan ganjil");

        // if (angka % 2 == 0) {
        //     System.out.println("Angka "+ angka +" bilangan genap");
        // } else {
        //     System.out.println("Angka "+ angka +" bilangan ganjil");
        // }
    }
}