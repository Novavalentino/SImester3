import java.util.Scanner;
import java.text.NumberFormat;

public class lat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat  duit = NumberFormat.getCurrencyInstance();

        double hjual,bil,hbayar,kembalian;

        System.out.println("harga barang yang dibeli ");
        hjual = input.nextDouble();

        bil = hjual + hjual * 0.05;

        System.out.println("harga dengan pajak sebesar 5% adalah " + duit.format(bil));

        System.out.println("uang untuk membayar ");
        hbayar = input.nextDouble();

        kembalian = hbayar - bil;

        System.out.println("terimakasih, kembalian anda sebesar " + duit.format(kembalian));
    }
}
