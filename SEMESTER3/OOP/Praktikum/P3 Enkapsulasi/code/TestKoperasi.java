/**
 * TestKoperasi
 */
public class TestKoperasi {

  public static void main(String[] args) {
    Anggota anggota1 = new Anggota("1234567890", "Lavina", 5_000_000);

    System.out.println("Nama Anggota: " + anggota1.getNama());
    System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

    System.out.println("\nMeminjam uang 10.000.000...");
    anggota1.pinjam(10_000_000);

    System.out.println("\nMeminjam 4.000.000...");
    anggota1.pinjam(4_000_000);
    System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

    System.out.println("\nMembayar angsuran 1.000.000...");
    anggota1.angsur(1_000_000);
    System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

    System.out.println("\nMembayar angsuran 10.000...");
    anggota1.angsur(10_000);
    System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
  }
}
