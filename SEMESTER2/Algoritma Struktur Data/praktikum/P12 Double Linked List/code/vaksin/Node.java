package vaksin;

public class Node {

  String id, nama;
  Node prev, next;

  Node(Node prev, String id, String nama, Node next) {
    this.prev = prev;
    this.id = id;
    this.nama = nama;
    this.next = next;
  }

  Node(String id, String nama) {
    this.id = id;
    this.nama = nama;
  }
}
