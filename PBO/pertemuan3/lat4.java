package PBO.pertemuan3;

import java.util.Scanner;

public class lat4 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan a ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan b ");
        int b = input.nextInt();

        System.out.print("a == b " + (a == b));
        System.out.print("a != b " + (a != b));
        System.out.print("a > b " + (a > b));
        System.out.print("a < b " + (a < b));
    }
}
