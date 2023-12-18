import java.util.Scanner;

public class DoWhileCuti14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t) ? ");
            konfirmasi = scan.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = scan.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}
