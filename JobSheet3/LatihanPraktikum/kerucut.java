package JobSheet3.LatihanPraktikum;

public class kerucut {

    public int jenisBangunRuang;
    public int jari2;
    public int sisiMiring;

    public kerucut (int r, int s){
        jari2 = r;
        sisiMiring=s;
    }

    public int hitungVolume (){
        return 1/3*22/7*jari2*jari2*((int)Math.sqrt((sisiMiring*sisiMiring)+(jari2*jari2)));
    }

    public int luasPermukaan (){
        return 22/7*jari2*(sisiMiring+jari2);
    }
}
