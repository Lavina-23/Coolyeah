public class Tugas114 {
    public static void main(String[] args) {
        DeretDescendingRekursif(5);
        System.out.println();
        DeretDescendingIteratif(5);
    }

    static void DeretDescendingRekursif(int n) {
        if (n == 0) {
            System.out.print(n);
        } else {
            System.out.print(n);
            DeretDescendingRekursif(n - 1);
        }
    }

    static void DeretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
