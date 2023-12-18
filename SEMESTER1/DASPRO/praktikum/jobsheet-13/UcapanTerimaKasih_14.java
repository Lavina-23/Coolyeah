import java.util.Scanner;

public class UcapanTerimaKasih_14 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        UcapanTambahan("I Love You " + nama);
    }

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

}
