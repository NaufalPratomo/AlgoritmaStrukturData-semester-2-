package JobSheet3.LatihanPraktikum;

public class BangunRuang {

    public int jenisBangunRuang;
    public int jari2;
    public double sisiMiring;
    public int tinggi;
    public int sisi;

    double hitungVolume(){
        if (jenisBangunRuang==0) {
            return 1/3.0*(sisi*sisi)*tinggi;
        } else if (jenisBangunRuang==1) {
            return 1/3.0*22/7.0*jari2*jari2*(Math.sqrt((sisiMiring*sisiMiring)-(jari2*jari2)));
        } else {
            return (4/3.0)*22/7.0*jari2*jari2*jari2;
        }
    }

    double hitungLuasPermukaan(){
        if (jenisBangunRuang==0) {
            return (sisi*sisi)+(4*(sisiMiring*sisi/2.0)); 
        } else if (jenisBangunRuang==1) {
            return 22/7.0*jari2*(sisiMiring+jari2);
        } else {
            return 4*22/7.0*jari2*jari2;
        }
    }

}

