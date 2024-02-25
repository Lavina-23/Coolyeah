public class BukuMain14 {
    public static void main(String[] args) {
        // Buku14 bk1 = new Buku14();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71_000;

        // bk1.tampilInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60_000);
        // bk1.tampilInformasi();

        // Buku14 bk2 = new Buku14("Self Reward", "Maheera Ayesha", 160, 29, 59_000);
        // bk2.terjual(11);
        // bk2.tampilInformasi();

        Buku14 bukuLavina = new Buku14("Harry Potter", "JK Rowling", 250, 20, 99_000);
        bukuLavina.hitungHargaTotal(2);
        bukuLavina.hitungDiskon();
        bukuLavina.hitungHargaBayar();
        bukuLavina.tampilTransaksi();
    }
}
