package UTS1_Naufal;

public class NasabahNaufal {
    
    public String norekNaufal;
    public String namaNaufal;
    public String nikNaufal;
    public int umurNaufal;
    public double saldonaufal;

    public NasabahNaufal(String no, String nm, String nik, int umur, double sdo) {
        this.norekNaufal = no;
        this.namaNaufal = nm;
        this.nikNaufal = nik;
        this.umurNaufal = umur;
        this.saldonaufal = sdo;
    }
    
    public String showDataNasabah() {
        return "\n" +"Nomor Rekening: " + norekNaufal + "\n" + "Nama: " + namaNaufal + 
        "\n" + "NIK: " + nikNaufal + "\n" + "Umur: " + umurNaufal + "\n" + "Saldo: " + saldonaufal;
    }
    
    public static void sortNasabahNaufal(NasabahNaufal[] nasabahNaufal) {
        for (int i = 0; i < nasabahNaufal.length-1; i++) {
            int idxNaufal = i;
            for (int j = i+1; j < nasabahNaufal.length; j++) {
                if (nasabahNaufal[j].umurNaufal < nasabahNaufal[idxNaufal].umurNaufal) {
                    idxNaufal=j;
                }
                NasabahNaufal tempNaufal = nasabahNaufal[idxNaufal];
                nasabahNaufal[idxNaufal] = nasabahNaufal[i];
                nasabahNaufal[i] = tempNaufal;
            }
        }
    }

    public static int mencariNamaNasabah(NasabahNaufal[] nasabahNaufal, String namaNasabahNaufal) {
        for (int i = 0; i < nasabahNaufal.length; i++) {
            if (nasabahNaufal[i].namaNaufal.equals(namaNasabahNaufal)) {
                return i;
            }
        }
        return - 1;
    }
}
