package Struk;

public class Stack {
  Struk[] data;
  int size, top;

  public Stack(int size) {
    this.size = size;
    data = new Struk[size];
    top = -1;
  }

  public boolean isFull() {
    if (top == size - 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  public void push(Struk str) {
    if (!isFull()) {
      top++;
      data[top] = str;
    } else {
      System.out.println("Stack Penuh");
    }
  }

  public void pop(int voucher) {
    if (!isEmpty()) {
      for (int i = data.length; i > (data.length - voucher); i--) {
        Struk s = data[i - 1];
        top--;
        System.out.println(
            "Struk yang dikeluarkan: " + s.no_transaksi + " " + s.tgl_beli + " " + s.jmlBarang + " "
                + s.total);
        System.out.println();
      }
    } else {
      System.out.println("Stack masih kosong");
    }
  }

  public void print() {
    System.out.println("Isi stack: ");
    for (int i = top; i >= 0; i--) {
      System.out.println(data[i].no_transaksi + " " + data[i].tgl_beli + " " + data[i].jmlBarang + " "
          + data[i].total);
    }
    System.out.println("");
  }
}
