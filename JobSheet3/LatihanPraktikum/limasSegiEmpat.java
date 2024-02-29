package JobSheet3.LatihanPraktikum;

public class limasSegiEmpat {
    
    public int jenisBangunRuang;
    public int panjangSisiSegiEmpat;
    public int tinggi;
    public int sisiMiring;

    public limasSegiEmpat(int s, int t){
        panjangSisiSegiEmpat=s;
        tinggi=t;
        sisiMiring=(int)Math.sqrt((panjangSisiSegiEmpat*panjangSisiSegiEmpat)+(tinggi*tinggi));
    }

    public int hitungVolume(){
        return 1/3*(panjangSisiSegiEmpat*panjangSisiSegiEmpat)*tinggi;
    }

    public int luasPermukaan(){
        return (panjangSisiSegiEmpat*panjangSisiSegiEmpat)+(4*(sisiMiring*panjangSisiSegiEmpat/2)); 
    }
}
