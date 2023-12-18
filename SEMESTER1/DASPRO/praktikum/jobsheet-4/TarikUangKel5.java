import java.util.Scanner;

public class TarikUangKel5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlSaldo, jmlUangDitarik, sisaSaldo;

        System.out.println("Masukkan jumlah saldo anda");
        jmlSaldo = input.nextInt();
        System.out.println("Masukkan jumlah uang yang ingin ditarik");
        jmlUangDitarik = input.nextInt();

        sisaSaldo = jmlSaldo-jmlUangDitarik;

        System.out.println("Sisa saldo : " + sisaSaldo);
    }
}
