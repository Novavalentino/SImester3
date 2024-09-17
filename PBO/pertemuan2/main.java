import java.util.Scanner;

public class main {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String Hero = "Lesley";
    // System.out.println("ini fungsi cetak");
    Integer Total;
    System.out.println("ingin menggunakan " + Hero);

    System.out.print("mau pakai sebanyak : ");
    Total = input.nextInt();
    System.out.println("akan pakai " + Hero + " sebanyak " + Total + " kali");
 }    
}