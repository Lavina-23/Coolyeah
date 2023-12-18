public class Tugas314 {
    public static void main(String[] args) {
        System.out.println(CekPrimaRekursif(13, 2) == true ? "Bilangan Prima" : "Bukan Bilangan Prima");
    }

    static boolean CekPrimaRekursif(int n, int i) {
        if (n <= 1) {
            return false;
        }

        if (i < n) {
            if (n % i == 0) {
                return false;
            } else {
                return CekPrimaRekursif(n, i + 1);
            }
        }
        return true;
    }
}
