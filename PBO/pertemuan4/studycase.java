package PBO.pertemuan4;

import java.util.Scanner;

public class studycase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Harga Menu: ");
        System.out.println("Nasi Goreng = Rp. 30.000");
        System.out.println("Mie Goreng = Rp. 25.000");
        System.out.println("Ayam Bakar = Rp. 35.000");
        System.out.println("Teh Manis = Rp. 10.000");

        Float nsgrg, miegrg, aymbkr, tehmns;
        float total;

        System.out.println("Masukkan pesanan anda: (isi 0 jika tidak ada)");

        System.out.println("Memesan Nasi goreng sebanyak : ");
        nsgrg = input.nextFloat();
        System.out.println("Memesan Mie goreng sebanyak : ");
        miegrg = input.nextFloat();
        System.out.println("Memesan Ayam Bakar sebanyak : ");
        aymbkr = input.nextFloat();
        System.out.println("Memesan Teh Manis sebanyak : ");
        tehmns = input.nextFloat();

        total = ((30000 * nsgrg) + (25000 * miegrg) + (35000 * aymbkr) + (10000 * tehmns));

        if (total >= 100000) {
            System.out.println("Anda Mendapatkan diskon 10%");
            total -= (total * 0.1);
            System.out.println("Harga Yang Harus Dibayar adalah " + total ); 
        }else {
            System.out.println("Anda tidak mendapat diskon, yang harus dibayar sebesar " + total);
        }
    }
}
