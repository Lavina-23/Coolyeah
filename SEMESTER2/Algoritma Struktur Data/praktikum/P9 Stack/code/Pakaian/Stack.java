package Pakaian;

public class Stack {
  Pakaian data[];
  int size, top;

  public Stack(int size) {
    this.size = size;
    data = new Pakaian[size];
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

  public void push(Pakaian pkn) {
    if (!isFull()) {
      top++;
      data[top] = pkn;
    } else {
      System.out.println("Stack Penuh");
    }
  }

  public void pop() {
    if (!isEmpty()) {
      Pakaian x = data[top];
      top--;
      System.out.println("Data yang dikeluarkan dari stack: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran
          + " " + x.harga);
    } else {
      System.out.println("Stack masih kosong");
    }
  }

  public void peek() {
    System.out.println("Elemen teratas stack: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
        + data[top].ukuran + " " + data[top].harga);
  }

  public void print() {
    System.out.println("Isi stack: ");
    for (int i = top; i >= 0; i--) {
      System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " "
          + data[i].ukuran + " " + data[i].harga);
    }
    System.out.println("");
  }

  public void clear() {
    if (!isEmpty()) {
      for (int i = top; i >= 0; i--) {
        top--;
      }
      System.out.println("Stack sudah dikosongkan");
    } else {
      System.out.println("Stack masih kosong");
    }
  }

  public void getMax() {
    int indexMax = 0;

    if (data.length > 0) {
      for (int i = 1; i < data.length; i++) {
        if (data[i].harga > data[indexMax].harga) {
          indexMax = i;
        }
      }
      System.out.println("Pakaian dengan Harga Tertinggi\nJenis: " + data[indexMax].jenis + "\nMerk: "
          + data[indexMax].merk + "\nHarga: " + data[indexMax].harga);
    } else {
      System.out.println("Stack Kosong");
    }
  }
}
