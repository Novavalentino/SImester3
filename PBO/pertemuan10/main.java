package PBO.pertemuan10;


//ENKAPSULASI
public class main {
    public static void main(String[] args) {
        System.out.println("");

        Buku Buku1 = new Buku(10, "Siksa Skripsi", "mahasiswa");
        Buku Buku2 = new BukuPaket(19, "Budi dan Badu", "wjeafuabe", "Fisika");
        Buku Buku3 = new BukuFiksi(99, "Kancil", "fadadae","adaead");
        Buku1.getPages();
    }
}

class Buku {
    //properti
    private Integer pages;
    private String judulBuku;
    private String penerbitBuku;

    //construktor
    public Buku(Integer pages, String judulBuku, String penerbitBuku){
        this.pages = pages;
        this.judulBuku = judulBuku;
        this.penerbitBuku = penerbitBuku;
    }

    //geter
    public void getInfo(){
        System.out.println("Judul: " + judulBuku);
        System.out.println("Jumlah Halaman: " + pages);
        System.out.println("Penerbit: " + penerbitBuku);
    }

    public void getJudul(){
        System.out.println("Judul: " + judulBuku);
    }

    public void getPages(){
        System.out.println("Jumlah Halaman: " + pages);
    }

    public void getPenerbit(){
        System.out.println("Penerbit: " + penerbitBuku);
    }

    //setter
    public void setJudul(){
        this.judulBuku = judulBuku;
    }

    public void setPages(){
        this.pages = pages;
    }

    public void setPenerbit(){
        this.penerbitBuku = penerbitBuku;
    }
}

class BukuPaket extends Buku { //subclass

    String mataPelajaran;

    public BukuPaket(Integer pages, String judulBuku, String penerbitBuku, String mataPelajaran) {
        super(pages, judulBuku, penerbitBuku);
        this.mataPelajaran = mataPelajaran;
    }


    @Override
    public void getInfo(){
        getJudul();
        getPages();
        getPenerbit();
        System.out.println("Mata Pelajaran" + mataPelajaran);
    }

}

class BukuFiksi extends Buku { //subclass

    String mataPelajaran;

    public BukuFiksi(Integer pages, String judulBuku, String penerbitBuku, String mataPelajaran) {
        super(pages, judulBuku, penerbitBuku);
        this.mataPelajaran = mataPelajaran;
    }


    @Override
    public void getInfo(){
        getJudul();
        getPages();
        getPenerbit();
        System.out.println("Mata Pelajaran" + mataPelajaran);
    }

}
