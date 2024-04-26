package Pakaian;

import java.util.Scanner;

public class StackMain {
  public static void main(String[] args) {
    Stack stk = new Stack(5);
    Scanner sc = new Scanner(System.in);

    int menu;
    do {
      System.out.println("Menu");
      System.out.println("1.Push\n2.Pop\n3.Peek\n4.Print\n5.Keluar");
      System.out.print("Pilih: ");
      menu = sc.nextInt();
      sc.nextLine();

      switch (menu) {
        case 1:
          char pilih;
          do {
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? : ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
          } while (pilih == 'y');
          break;
        case 2:
          stk.pop();
          break;
        case 3:
          stk.peek();
          break;
        case 4:
          stk.print();
          break;
        case 5:
          break;
        default:
          break;
      }
    } while (menu < 5);
  }
}
