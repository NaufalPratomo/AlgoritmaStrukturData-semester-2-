package JobSheet4.BruteForceDivideConquer.minggu5;

public class showroom {
    private String[] merk;
    private String[] tipe;
    private int[] tahun;
    private int[] accelerationTertinggi;
    private int[] top_power ;

    public showroom(String[] merk, String[] tipe, int[] tahun, int[] accelerationTertinggi, int[] top_power ) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.accelerationTertinggi = accelerationTertinggi;
        this.top_power  = top_power ;
    }

    public int cariId_AccelerationTertinggi(int rendah, int tinggi) {
        if (rendah == tinggi)
            return rendah;

        int tengah = (rendah + tinggi) / 2;

        int idxMaxKiri = cariId_AccelerationTertinggi(rendah, tengah);
        int idxMaxKanan = cariId_AccelerationTertinggi(tengah + 1, tinggi);

        if (accelerationTertinggi[idxMaxKiri] > accelerationTertinggi[idxMaxKanan]) {
            return idxMaxKiri;
        } else {
            return idxMaxKanan;
        }
    }

    public int cariId_AccelerationTerendah(int rendah, int tinggi) {
        if (rendah == tinggi)
            return rendah;
        else if (rendah == tinggi - 1) {
            if (accelerationTertinggi[rendah] < accelerationTertinggi[tinggi]) {
                return rendah;
            } else {
                return tinggi;
            }
        } else {
            int tengah = (rendah + tinggi) / 2;

            int id_MinKiri = cariId_AccelerationTerendah(rendah, tengah);
            int id_MinKanan = cariId_AccelerationTerendah(tengah + 1, tinggi);

            if (accelerationTertinggi[id_MinKiri] < accelerationTertinggi[id_MinKanan]) {
                return id_MinKiri;
            } else {
                return id_MinKanan;
            }
        }
    }

    public double hitungRataPower() {
        double jumlah = 0;
        for (int i = 0; i < this.top_power .length; i++) {
            jumlah += this.top_power [i];
        }
        return jumlah / this.top_power .length;
    }

    public void tampilkanMobil(int index) {
        System.out.println("Merk: " + merk[index] + ", Tipe: " + tipe[index] + ", Tahun: " + tahun[index] + ", Acceleration : " + accelerationTertinggi[index]);
    }
}
