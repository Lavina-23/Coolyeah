public class Tugas2 {
    public static void main(String[] args) {
        int bilangan = 8;

        System.out.print("1");
        for (int i = 2; i <= bilangan; i++) {
            System.out.print(" + " + i);
        }
        System.out.print(" = ");
        System.out.println(PenjumlahanRekursif(8));
    }

    static int PenjumlahanRekursif(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + PenjumlahanRekursif(f - 1);
        }
    }
}
