public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int luas = 0;
    public int keliling = 0;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    void hitungLuas() {
        luas = panjang * lebar;
    }

    void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }

    void cetakInfo(PersegiPanjang[] arrayOfPersegiPanjang) {
        System.out.println();
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang
                    + ", lebar: " + arrayOfPersegiPanjang[i].lebar + ", luas: " + arrayOfPersegiPanjang[i].luas
                    + ", keliling: " + arrayOfPersegiPanjang[i].keliling);
        }
    }
}
