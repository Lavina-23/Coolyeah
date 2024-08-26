package Tugas;

public class Queue {
  Pasien[] antrian;
  int front, rear, size, max;

  public Queue(int n) {
    max = n;
    antrian = new Pasien[max];
    size = 0;
    front = rear = -1;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (size == max) {
      return true;
    } else {
      return false;
    }
  }

  public void peek() {
    if (!isEmpty()) {
      System.out.println(
          "Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noID + " " + antrian[front].jenisKelamin
              + " " + antrian[front].umur);
    } else {
      System.out.println("Queue masih kosong");
    }
  }

  public void peekRear() {
    if (!isEmpty()) {
      System.out
          .println("Antrian belakang: " + antrian[rear].nama + " " + antrian[rear].noID + " "
              + antrian[rear].jenisKelamin
              + " " + antrian[rear].umur);
    } else {
      System.out.println("Queue masih kosong");
    }
  }

  public void peekPosition(String nama) {
    int position = -1;
    for (int i = 0; i < size; i++) {
      if (nama.equals(antrian[i].nama)) {
        position = i;
      }
    }
    System.out.println("Pasien: " + nama + " antrian nomor: " + (position + 1));
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Queue masih kosong");
      System.exit(-1);
    } else {
      int i = front;
      while (i != rear) {
        System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin
            + " " + antrian[i].umur);
        i = (i + 1) % max;
      }
      System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin
          + " " + antrian[i].umur);
      System.out.println("Jumlah elemen = " + size);
    }
  }

  public void daftarPasien() {
    for (int i = 0; i < antrian.length; i++) {
      if (antrian[i] != null) {
        System.out
            .println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
      } else {
        System.out.println("-");
      }
    }
  }

  public void Enqueue(Pasien dt) {
    if (isFull()) {
      System.out.println("Queue sudah penuh");
      System.exit(-1);
    } else {
      if (isEmpty()) {
        front = rear = 0;
      } else {
        if (rear == max - 1) {
          rear = 0;
        } else {
          rear++;
        }
      }
      antrian[rear] = dt;
      size++;
    }
  }

  public Pasien Dequeue() {
    Pasien dt = new Pasien();
    if (isEmpty()) {
      System.out.println("Queue masih kosong");
    } else {
      dt = antrian[front];
      size--;
      if (isEmpty()) {
        front = rear = -1;
      } else {
        if (front == max - 1) {
          front = 0;
        } else {
          front++;
        }
      }
    }
    return dt;
  }

}
