public class mahasiswa {
    String nama, kelas;
    int npm;

    //construktor

    public mahasiswa(String nama, String kelas, int npm){
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
    }
    //get info untuk mengambil informasi dari suatu class
    public void getInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Npm : " + npm);
    }

    //setter untuk men set data baru kedalam data didalam class
    public void setkelas(String kelas){
        this.kelas = kelas;
    }

    public static void main(String[] args) {
        mahasiswa valentino = new mahasiswa("Valentino L", "SI23PB", 232210015);

        System.out.println(valentino.nama);
        System.out.println(valentino.kelas);
        System.out.println(valentino.npm);
        
        valentino.getInfo();
        valentino.setkelas("SI01PP");
        valentino.getInfo();
    }

}
