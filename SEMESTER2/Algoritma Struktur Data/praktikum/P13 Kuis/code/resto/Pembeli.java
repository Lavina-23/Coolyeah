package resto;

/**
 * Pembeli
 */
public class Pembeli extends Node {
  String namaPembeli, noHP;

  Pembeli(Node prev, Node next) {
    super(prev, next);
  }

  Pembeli(Node prev, String b, String c, Node next) {
    super(prev, next);
    namaPembeli = b;
    noHP = c;
  }
}