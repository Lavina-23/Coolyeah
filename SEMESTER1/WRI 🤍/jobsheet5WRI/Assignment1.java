import java.util.Scanner;

/**
 * Assignment1
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi1, sisi2, sisi3;

        System.out.print("Masukkan panjang sisi pertama : ");
        sisi1 = sc.nextInt();
        System.out.print("Masukkan panjang sisi kedua : ");
        sisi2 = sc.nextInt();
        System.out.print("Masukkan panjang sisi ketiga : ");
        sisi3 = sc.nextInt();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga sama sisi");
        } else if (sisi1 != sisi2 && sisi2 != sisi3){
            System.out.println("Segitiga sembarang");
        } else{
            System.out.println("Segitiga sama kaki");
        }
    }
}