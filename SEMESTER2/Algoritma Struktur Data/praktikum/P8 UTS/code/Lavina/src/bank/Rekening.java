package bank;

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
    System.out.printf("No Rekening\t : %s\nNama\t\t : %s\nNama Ibu\t : %s\nNo Telp\t\t : %s\nEmail\t\t : %s\n",
        noRekening,
        nama, namaIbu, phone, email);
  }
}
