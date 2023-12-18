package com.jobsheetDua;

import java.util.Scanner;

public class ATMKEL5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int jml_tabungan_awal;
        int jml_tarik;
        int sisa_tabungan;
        int konfirmasi;

        System.out.println("Masukkan jumlah tabungan awal");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan jumlah uang yang ingin ditarik");
        jml_tarik = input.nextInt();
        System.out.println("Apakah anda yakin ? (Tekan 1 jika Ya dan Tekan 2 jika Tidak)");
        konfirmasi = input.nextInt();

        sisa_tabungan = jml_tabungan_awal - jml_tarik;

        if (konfirmasi == 1) {
            System.out.println("Sisa saldo : " + sisa_tabungan);
        } else {
            System.out.println("Sampai jumpa kembali !");
        }
    }
}
