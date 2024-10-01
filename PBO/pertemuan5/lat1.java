

class NasiPadang {
    int Nasi, Ayam, Rendang, Prekedel, Sambel;

    // construktor
    public NasiPadang(Integer NasiBaru, Integer AyamBaru, Integer PrekedelBaru, Integer RendangBaru, Integer SambelBaru){

        this.Nasi = NasiBaru;
        this.Ayam = AyamBaru;
        this.Rendang = RendangBaru;
        this.Prekedel = PrekedelBaru;
        this.Sambel = SambelBaru;

    }
    //gather / get information

    public void getInfo(){
        System.out.println("Nasi yang diambil sebanyak " + Nasi);
        System.out.println("Ayam yang diambil sebanyak " + Ayam);
        System.out.println("Rendang yang diambil sebanyak " + Rendang);
        System.out.println("Prekedel yang diambil sebanyak " + Prekedel);
        System.out.println("Sambel yang diambil sebanyak " + Sambel);
    }
}

public class lat1 {
    public static void main(String[] args) {
        NasiPadang PiringKevin = new NasiPadang(1,2,3,4,5);

        NasiPadang PiringNaufal = new NasiPadang(2,2,3,0,0);

        NasiPadang PiringValen = new NasiPadang(1,0,2,1,2);
        
    }

    
}
