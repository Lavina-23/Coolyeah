public class Rekening {
  String noRekening, nama, namaIbu, phone, email;

  Rekening(String a, String b, String c, String d, String e) {
    noRekening = a;
    nama = b;
    namaIbu = c;
    phone = d;
    email = e;
  }

  public void showData() {
    System.out.println("INFORMASI AKUN REKENING");
    System.out.println("=======================");
    System.out.printf("No Rekening\t : %s\nNama\t : %s\nNama Ibu\t : %s\nNo Telp\t : %s\nEmail\t : %s\n", noRekening,
        nama, namaIbu, phone, email);
  }
}
