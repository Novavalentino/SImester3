package PBO.pertemuan6;

public class Pertemuan6 {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("bapert", 2322100);
        mahasiswaS1 mahasiswa2 = new mahasiswaS1("ujang", 23423131, "sistem informasi");
        mahasiswaS2 mahasiswa3 = new mahasiswaS2("udin", 21222121);
        System.out.println(mahasiswa1);
    }
}

class mahasiswa {
    String nama;
    Integer npm;

    public mahasiswa(String namaBaru, Integer npmBaru){
        this.nama = namaBaru;
        this.npm = npmBaru;
    }
    public void getInfo(){
        System.err.println("Nama: " + nama);
        System.err.println("NPM: " + npm);
    }
    public void setnpm(Integer npmBaru){
        this.npm = npmBaru;
    }
}

class mahasiswaS1 extends mahasiswa{
    String jurusan;
    public mahasiswaS1(String nama, Integer npm, String jurusan) {
        super(nama, npm);
        this.jurusan = jurusan;
    }

    public mahasiswaS1(String namaBaru, Integer npmBaru) {
        super(namaBaru, npmBaru);
    }
    public void getjurusan(){
        System.out.println("Jurusan: "+ jurusan);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        getjurusan();
        System.out.println("Tigkat pendidikan sarjana s1");
    }
    
}

class mahasiswaS2 extends mahasiswa{
    String bidangpenelitian;
    public mahasiswaS2(String nama, Integer npm) {
        super(nama, npm);
        this.bidangpenelitian = bidangpenelitian;
    
    }
    public void getbidangpenelitian(){
        System.out.println("Bidang Penelitian: "+ bidangpenelitian);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        getbidangpenelitian();
        System.out.println("Tigkat pendidikan sarjana s2");
    }
    
}
