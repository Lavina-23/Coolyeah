public class main {
  static void mm(int... a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a.length);
    }
  }

  public static void main(String[] args) {
    mm(5, 7, 8, 9, 10);
    mm(5, 7, 8);
  }
}
