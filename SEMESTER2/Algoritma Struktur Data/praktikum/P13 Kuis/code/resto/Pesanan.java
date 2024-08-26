package resto;

public class Pesanan extends Node {
  int kodePesanan, harga;
  String namaPesanan;

  Pesanan(Node prev, Node next) {
    super(prev, next);
  }

  Pesanan(Node prev, int a, String b, int d, Node next) {
    super(prev, next);
    kodePesanan = a;
    namaPesanan = b;
    harga = d;
  }
}
