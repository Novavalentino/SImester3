package PBO.pertemuan4;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float nilai;

        System.out.println("Masukkan Nilai Ulangan Anda: ");
        nilai = input.nextFloat();

        if (nilai >= 60) { //cek apakah lulus atau tidak
            //nested if digunakan untuk menentukan grade nilai
            System.out.println("Selamat Anda Lulus");
            if (nilai >= 90) {
                System.out.println("Grade anda adalah A");
            } else if (nilai >= 80) {
                System.out.println("Grade anda adalah B");
            } else if (nilai >=70) {
                System.out.println("Grade anda adalah C");
            }else {
                System.out.println("Grade anda adalah D");
            }

        }else {
            System.out.println("Maaf anda tidak lulus, Grade anda E");
        }
    }
}
