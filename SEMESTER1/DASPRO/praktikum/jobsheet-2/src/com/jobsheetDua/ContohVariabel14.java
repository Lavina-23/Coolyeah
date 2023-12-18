package com.jobsheetDua;

/**
 * ContohVariabel14
 */
public class ContohVariabel14 {

    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Memasak";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 19;
        double $ipk = 3.80, tinggi = 1.45;

        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai ? " + isPandai);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Umurku saat ini : " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}