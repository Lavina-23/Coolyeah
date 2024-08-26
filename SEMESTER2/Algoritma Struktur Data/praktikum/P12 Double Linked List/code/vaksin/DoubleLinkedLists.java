package vaksin;

public class DoubleLinkedLists {
  Node head;
  int size;

  public DoubleLinkedLists() {
    head = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addFirst(String id, String nama) {
    if (isEmpty()) {
      head = new Node(null, id, nama, null);
    } else {
      Node newNode = new Node(null, id, nama, head);
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  public void addLast(String id, String nama) {
    if (isEmpty()) {
      addFirst(id, nama);
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      Node newNode = new Node(current, id, nama, null);
      current.next = newNode;
      size++;
    }
  }

  public void removeFirst() throws Exception {
    if (isEmpty()) {
      throw new Exception("Linked list masih kosong, tidak dapat dihapus");
    } else if (size == 1) {
      removeLast();
    } else {
      System.out.println(head.nama + " telah selesai divaksinasi.");
      head = head.next;
      head.prev = null;
      size--;
    }
  }

  public void removeLast() throws Exception {
    if (isEmpty()) {
      throw new Exception("Linked list masih kosong, tidak dapat dihapus");
    } else if (head.next == null) {
      System.out.println(head.nama + " telah selesai divaksinasi.");
      head = null;
      size--;
      return;
    }

    Node current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    current.next = null;
    size--;
  }

  public void print() {
    System.out.println("+++++++++++++++++++++++");
    System.out.println("Daftar Pengantri Vaksin");
    System.out.println("+++++++++++++++++++++++");
    System.out.println("| No.\t| Nama\t|");
    if (!isEmpty()) {
      Node tmp = head;
      while (tmp != null) {
        String id = tmp.id;
        String nama = tmp.nama;
        String format = "| %-5s | %-5s |";
        System.out.println(String.format(format, id, nama));
        tmp = tmp.next;
      }
      System.out.println("\nSisa Antrian: " + size);
    } else {
      System.out.println("Linked list kosong");
    }
  }
}
