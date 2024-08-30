public class BukuStruktural {
    public static void main(String[] args) {
        // Buku 1
        String judul1 = "Java Dasar";
        String penulis1 = "Ahmad";
        int jumlahHalaman1 = 150;
        String genre1 = "Teknologi";
        boolean status1 = false;

        // Buku 2
        String judul2 = "Belajar OOP";
        String penulis2 = "Rina";
        int jumlahHalaman2 = 200;
        String genre2 = "Teknologi";
        boolean status2 = true;

        // Buku 3
        String judul3 = "Algoritma";
        String penulis3 = "Budi";
        int jumlahHalaman3 = 250;
        String genre3 = "Teknologi";
        boolean status3 = false;

        // Buku 4
        String judul4 = "Basis Data";
        String penulis4 = "Siti";
        int jumlahHalaman4 = 180;
        String genre4 = "Teknologi";
        boolean status4 = true;

        // Buku 5
        String judul5 = "Web Dev";
        String penulis5 = "Andi";
        int jumlahHalaman5 = 220;
        String genre5 = "Teknologi";
        boolean status5 = false;

        // Buku 6
        String judul6 = "Jaringan";
        String penulis6 = "Dewi";
        int jumlahHalaman6 = 230;
        String genre6 = "Teknologi";
        boolean status6 = true;

        // Buku 7
        String judul7 = "UI/UX";
        String penulis7 = "Iwan";
        int jumlahHalaman7 = 170;
        String genre7 = "Desain";
        boolean status7 = true;

        // Buku 8
        String judul8 = "Data Mining";
        String penulis8 = "Sri";
        int jumlahHalaman8 = 210;
        String genre8 = "Teknologi";
        boolean status8 = false;

        // Buku 9
        String judul9 = "Mobile Dev";
        String penulis9 = "Adi";
        int jumlahHalaman9 = 240;
        String genre9 = "Teknologi";
        boolean status9 = true;

        // Buku 10
        String judul10 = "AI Dasar";
        String penulis10 = "Taufik";
        int jumlahHalaman10 = 260;
        String genre10 = "Teknologi";
        boolean status10 = true;

        cetakInfo(judul1, penulis1, jumlahHalaman1, genre1, status1);
        statusPinjam(judul1, penulis1, status1);

        cetakInfo(judul2, penulis2, jumlahHalaman2, genre2, status2);
        statusPinjam(judul2, penulis2, status2);

        cetakInfo(judul3, penulis3, jumlahHalaman3, genre3, status3);
        statusPinjam(judul3, penulis3, status3);

        cetakInfo(judul4, penulis4, jumlahHalaman4, genre4, status4);
        statusPinjam(judul4, penulis4, status4);

        cetakInfo(judul5, penulis5, jumlahHalaman5, genre5, status5);
        statusPinjam(judul5, penulis5, status5);

        cetakInfo(judul6, penulis6, jumlahHalaman6, genre6, status6);
        statusPinjam(judul6, penulis6, status6);

        cetakInfo(judul7, penulis7, jumlahHalaman7, genre7, status7);
        statusPinjam(judul7, penulis7, status7);

        cetakInfo(judul8, penulis8, jumlahHalaman8, genre8, status8);
        statusPinjam(judul8, penulis8, status8);

        cetakInfo(judul9, penulis9, jumlahHalaman9, genre9, status9);
        statusPinjam(judul9, penulis9, status9);

        cetakInfo(judul10, penulis10, jumlahHalaman10, genre10, status10);
        statusPinjam(judul10, penulis10, status10);
    }

    public static void statusPinjam(String judul, String penulis, boolean status) {
        String statusPinjam = status ? "Buku " + judul + " dipinjam" : "Buku " + judul + " tersedia";
        System.out.println(statusPinjam + "\n");
    }

    public static void cetakInfo(String judul, String penulis, int jumlahHalaman, String genre, boolean status) {
        String statusBuku = status ? "Tersedia" : "Dipinjam";
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + statusBuku);
    }
}
