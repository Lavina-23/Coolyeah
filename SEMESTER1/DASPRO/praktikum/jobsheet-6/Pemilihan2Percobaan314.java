import java.util.Scanner;

public class Pemilihan2Percobaan314 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input14.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input14.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2_000_000)
                pajak = 0.1;
            else if (penghasilan <= 3_000_000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2_500_000)
                pajak = 0.15;
            else if (penghasilan <= 3_500_000)
                pajak = 0.25;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih : " + gajiBersih);
        } else {
            System.out.println("Masukan kategori salah");
        }
    }
}
