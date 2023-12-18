import java.util.Scanner;

public class Kubus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, volume, luasPermukaan;

        System.out.print("Masukkan panjang sisi : ");
        s = sc.nextInt();

        volume = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + volume);

        luasPermukaan = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah " + luasPermukaan);
    }

    public static int hitungVolume(int bil1) {
        int vol = bil1 * bil1 * bil1;
        return vol;
    }

    public static int hitungLuasPermukaan(int bil1) {
        int lp = bil1 * bil1 * 6;
        return lp;
    }
}
