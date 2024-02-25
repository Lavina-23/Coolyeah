public class Buku14 {

    String judul, pengarang;
    int halaman, stok, harga;

    public Buku14() {

    }

    public Buku14(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok Habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int totalHarga;

    void hitungHargaTotal(int jml) {
        totalHarga = harga * jml;
    }

    double diskon;

    void hitungDiskon() {
        if (totalHarga > 150_000) {
            diskon = totalHarga * 0.12;
        } else if (totalHarga > 75_000 && totalHarga < 150_000) {
            diskon = totalHarga * 0.05;
        } else {
            diskon = 0;
        }
    }

    int totalBayar;

    void hitungHargaBayar() {
        totalBayar = totalHarga - (int) diskon;
    }

    void tampilTransaksi() {
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Total diskon: Rp " + (int) diskon);
        System.out.println("Total bayar: Rp " + totalBayar);
    }
}