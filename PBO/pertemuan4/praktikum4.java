package PBO.pertemuan4;

import java.util.Scanner;

public class praktikum4 {
    //Latihan if else condition

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double Harga;

        System.out.println("Masukkan harga barang : ");
        Harga = input.nextDouble();

        if (Harga > 10000) {
            System.out.println("Anda mendapatkan diskon sebesar 10%");
            Harga -= (Harga * 0.1);
        } else {
            System.out.println("Anda tidak mendapatkan Diskon");
        }
        System.out.println("Jadi yang harus dibayar adalah sebesar: " + Harga);
    }
}
