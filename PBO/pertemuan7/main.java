package PBO.pertemuan7;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing("mbut", 19, "Gunung Batu");
        Hewan hewan2 = new Hewan("mbut", 19);
        hewan1.suara();
    }
}

class Hewan {
    String nama;
    Integer umur;

    public Hewan(String nama, Integer umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void suara(){
        System.out.println(".................");
    }
}

class Anjing extends Hewan {
    String ras;

    public Anjing(String nama, int umur, String gunung_Batu) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara(){
        System.out.println("guk guk guk");
    }

}

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, Integer umur) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara(){
        System.out.println("mewing mewing");
    }

}
