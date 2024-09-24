package PBO.pertemuan4;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day; //Nomor Hari
        System.out.println("Masukkan Hari: ");
        day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            default:
                System.out.println("Hari Minggu");
                break;
        }
    }
}
