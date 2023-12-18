public class programKu {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j < i; j++) {
            System.out.println(j); // 1,2,3,4
        }
    }

    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2); // 2
    }

    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2)); // 4 indeks ditambah 2 = 1,2,3,4,5,6
    }

    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }

}
