import java.util.Scanner;

public class trapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sa,sb,t,luas;

        System.out.println("masukan sisi atas");
        sa = input.nextDouble();

        System.out.println("masukan sisi bawah");
        sb = input.nextDouble();

        System.out.println("masukan tinggi");
        t = input.nextDouble();

        luas = 0.5 * (sa + sb) * t;
        System.out.println("Luas dari Trapesium tersebut adalah " + luas);
    }
}
