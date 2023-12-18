/**
 * tugas4
 */
public class tugas4 {

    public static void main(String[] args) {
        String[][] atletPorseni = new String[4][6];

        atletPorseni[0][0] = "Badminton";
        atletPorseni[0][1] = "Mima";
        atletPorseni[0][2] = "Yaya";
        atletPorseni[0][3] = "Aden";
        atletPorseni[0][4] = "Rina";
        atletPorseni[0][5] = "Rini";

        atletPorseni[1][0] = "Tenis Meja";
        atletPorseni[1][1] = "Hani";
        atletPorseni[1][2] = "Kina";
        atletPorseni[1][3] = "Sani";
        atletPorseni[1][4] = "Sania";
        atletPorseni[1][5] = "Ica";

        atletPorseni[2][0] = "Basket";
        atletPorseni[2][1] = "Ani";
        atletPorseni[2][2] = "Ida";
        atletPorseni[2][3] = "Ran";
        atletPorseni[2][4] = "Rin";
        atletPorseni[2][5] = "Ken";

        atletPorseni[3][0] = "Bola Voly";
        atletPorseni[3][1] = "Diva";
        atletPorseni[3][2] = "Fani";
        atletPorseni[3][3] = "Misel";
        atletPorseni[3][4] = "Dea";
        atletPorseni[3][5] = "Bona";

        for (int i = 0; i < atletPorseni.length; i++) { // loop untuk menampilkan baris
            System.out.println("Cabor : " + atletPorseni[i][0]); // menampilkan cabor yang berada pada setiap baris di
                                                                 // kolom indeks 0
            for (int j = 1; j < atletPorseni[i].length; j++) { // loop untuk menampilkan nama atlet, dimulai dari indeks
                                                               // j = 1 lalu diulang sebanyak length dari i
                System.out.println("Atlet ke - " + (j) + " : " + atletPorseni[i][j]);
            }
            System.out.println();
        }
    }
}