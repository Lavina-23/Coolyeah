import java.util.Scanner;

public class PersegiPanjangDemo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                PersegiPanjang p = new PersegiPanjang(0, 0);
                int panjang, lebar, jml;

                System.out.println("Masukkan jumlah persegi panjang: ");
                jml = sc.nextInt();
                PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jml];

                for (int i = 0; i < jml; i++) {
                        System.out.println("Persegi panjang ke-" + (i + 1));
                        System.out.print("Masukkan panjang: ");
                        panjang = sc.nextInt();
                        System.out.print("Masukkan lebar: ");
                        lebar = sc.nextInt();

                        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
                        arrayOfPersegiPanjang[i].hitungLuas();
                        arrayOfPersegiPanjang[i].hitungKeliling();
                }

                p.cetakInfo(arrayOfPersegiPanjang);
        }
}
