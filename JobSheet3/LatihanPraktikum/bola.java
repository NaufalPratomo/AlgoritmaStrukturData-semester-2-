package JobSheet3.LatihanPraktikum;

public class bola {
    
    public int jenisBangunRuang;
    public int jari2;

    public bola(int r){
        jari2=r;
    }

    public int hitungVolume(){
        return (4/3)*22/7*jari2*jari2*jari2;
    }

    public int luasPermukaan(){
        return 4*22/7*jari2*jari2;
    }
}
