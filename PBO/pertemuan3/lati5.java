package PBO.pertemuan3;

import java.util.Scanner;

public class lati5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println( "Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.println( "Anggota (T/F): ");
        boolean anggota = input.nextBoolean();

        // if (umur > 60 || anggota) {
        //     System.out.println( "Dapat Diskon ");
        // }else {
        //     System.out.println( "Tidak Dapat Diskon ");
        // }

        // // penggunaan Ternary
        // String hasil = (umur > 60 || anggota);
    }

}
