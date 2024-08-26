package resto;

public class Transaksi {
  Pembeli head;
  Pesanan headPesanan;
  int size, sizePesanan;
  int total;

  public boolean isEmpty() {
    return head == null;
  }

  public boolean isPesananEmpty() {
    return headPesanan == null;
  }

  public int size() {
    return size;
  }

  public int sizePesanan() {
    return sizePesanan;
  }

  public void addFirst(String nm, String no) {
    if (isEmpty()) {
      head = new Pembeli(null, nm, no, null);
    } else {
      Pembeli newPembeli = new Pembeli(null, nm, no, head);
      head.prev = newPembeli;
      head = newPembeli;
    }
    size++;
  }

  public void addLast(String nm, String no) {
    if (isEmpty()) {
      addFirst(nm, no);
    } else {
      Pembeli current = head;
      while (current.next != null) {
        current = (Pembeli) current.next;
      }
      Pembeli newPembeli = new Pembeli(current, nm, no, null);
      current.next = newPembeli;
      size++;
    }
  }

  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("Antrian Kosong");
    } else if (size == 1) {
      removeLast();
    } else {
      head = (Pembeli) head.next;
      head.prev = null;
      size--;
    }
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("Antrian Kosong");
    } else if (head.next == null) {
      System.out.println(head.namaPembeli + " telah memesan menu");
      head = null;
      size--;
      return;
    }

    Pembeli current = head;
    while (current.next.next != null) {
      current = (Pembeli) current.next;
    }
    System.out.println(current.namaPembeli + " telah memesan menu");
    current.next = null;
    size--;
  }

  public void addPesananFirst(int kd, String nm, int harga) {
    if (isPesananEmpty()) {
      headPesanan = new Pesanan(null, kd, nm, harga, null);
    } else {
      Pesanan newPesanan = new Pesanan(null, kd, nm, harga, headPesanan);
      headPesanan.prev = newPesanan;
      headPesanan = newPesanan;
      total += newPesanan.harga;
    }
    sizePesanan++;
  }

  public void addPesananLast(int kd, String nm, int harga) {
    if (isPesananEmpty()) {
      addPesananFirst(kd, nm, harga);
    } else {
      Pesanan current = headPesanan;
      while (current.next != null) {
        current = (Pesanan) current.next;
      }
      Pesanan newPesanan = new Pesanan(current, kd, nm, harga, null);
      current.next = newPesanan;
      total += newPesanan.harga;
      sizePesanan++;
    }
  }

  public void print() {
    System.out.println("+++++++++++++++++++++++++++++++++");
    System.out.println("Daftar Antrian Resto Lavina");
    System.out.println("+++++++++++++++++++++++++++++++++");
    System.out.println("| No.\t\t| Nama Customer\t\t| Nomor HP\t|");
    if (!isEmpty()) {
      Pembeli tmp = head;
      int i = 1;
      while (tmp != null && i <= size + 1) {
        int no = i;
        String nama = tmp.namaPembeli;
        String noHP = tmp.noHP;
        String format = "| %-13d | %-15s | %-15s |";
        System.out.println(String.format(format, no, nama, noHP));
        tmp = (Pembeli) tmp.next;
        i++;
      }
      System.out.println("\nSisa Antrian: " + size);
    } else {
      System.out.println("Linked list kosong");
    }
  }

  public void printPesanan() {
    System.out.println("+++++++++++++++++++++++++++++++++");
    System.out.println("Daftar Pesanan Resto Lavina");
    System.out.println("+++++++++++++++++++++++++++++++++");
    System.out.println("| No.\t\t| Nama Pesanan\t\t| Harga\t|");
    if (!isPesananEmpty()) {
      Pesanan tmp = headPesanan;
      int i = 1;
      while (tmp != null && i <= sizePesanan + 1) {
        int no = i;
        String nama = tmp.namaPesanan;
        int harga = tmp.harga;
        String format = "| %-13d | %-15s | %-15s |";
        System.out.println(String.format(format, no, nama, harga));
        total += tmp.harga;
        tmp = (Pesanan) tmp.next;
        i++;
      }
      System.out.println("\nSemua Pesanan Berhasil Dicetak");
    } else {
      System.out.println("Linked list kosong");
    }
  }

  public void sortByNamaPesanan() {
    if (headPesanan == null || headPesanan.next == null) {
      return;
    }

    boolean swapped;
    do {
      swapped = false;
      Pesanan prev = null;
      Pesanan current = headPesanan;
      Pesanan nextNode = (Pesanan) headPesanan.next;

      while (nextNode != null) {
        if (current.namaPesanan.compareTo(nextNode.namaPesanan) < 0) {
          if (prev != null) {
            prev.next = nextNode;
          } else {
            headPesanan = (Pesanan) nextNode;
          }

          current.next = nextNode.next;
          nextNode.next = current;
          prev = nextNode;
          nextNode = (Pesanan) current.next;
          swapped = true;
        } else {
          prev = current;
          current = nextNode;
          nextNode = (Pesanan) nextNode.next;
        }
      }
    } while (swapped);
  }

  public void totalPendapatan() {
    System.out.println(total);
  }

}
