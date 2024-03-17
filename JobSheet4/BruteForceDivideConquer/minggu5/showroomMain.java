package JobSheet4.BruteForceDivideConquer.minggu5;

public class showroomMain {
    public static void main(String[] args) {

        String[] merk = { "BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen" };
        String[] tipe = { "M2 Coupe", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI","AE86 Trueno", "86/GT86", "Golf GTI" };
        int[] tahun = { 2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014 };
        int[] accelerationTertinggi = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] top_power  = { 728, 575, 657, 609, 703, 553, 609, 631 };

        showroom mobil = new showroom(merk, tipe, tahun, accelerationTertinggi, top_power );

        int id_MaxAcceleration = mobil.cariId_AccelerationTertinggi(0, accelerationTertinggi.length - 1);
        int id_MinAcceleration = mobil.cariId_AccelerationTerendah(0, accelerationTertinggi.length - 1);

        double rataPower = mobil.hitungRataPower();

        System.out.println("====================================================================");
        System.out.println("Mobil dengan acceleration tertinggi yaitu :");
        mobil.tampilkanMobil(id_MaxAcceleration);
        System.out.println("====================================================================");
        System.out.println("Mobil dengan acceleration terendah yaitu :");
        mobil.tampilkanMobil(id_MinAcceleration);

        System.out.println("====================================================================");
        System.out.println("Rata-rata  top power dari seluruh mobil yaitu : " + rataPower);
        System.out.println("====================================================================");
    }
}
