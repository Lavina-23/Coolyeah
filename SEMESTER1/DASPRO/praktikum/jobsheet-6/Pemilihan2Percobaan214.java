import java.util.Scanner;

public class Pemilihan2Percobaan214 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut pertama : ");
        sudut1 = input14.nextInt();
        System.out.print("Masukkan sudut kedua : ");
        sudut2 = input14.nextInt();
        System.out.print("Masukkan sudut ketiga : ");
        sudut3 = input14.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
                System.out.println("Segitga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
