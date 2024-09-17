import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double phi = 3.14;
        Double Luas;

        System.out.println("masukan jari-jari");
        r = input.nextInt();

        Luas = phi * r *r;

        System.out.println("Luas dari ligkaran tersebut adalah " + Luas);
    }
}
