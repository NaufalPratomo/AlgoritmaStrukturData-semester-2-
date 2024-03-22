package bubbleSelectionInsertion.jobsheet6;

public class MainHotel {
    public static void main(String[] abcd) {

        HotelService service = new HotelService();
        Hotel hotel1 = new Hotel("hotel Arthy", "Jakarta", 2500000, (byte)3);
        Hotel hotel2 = new Hotel("hotel Bild", "Bandung", 2000000, (byte)4);
        Hotel hotel3 = new Hotel("hotel Celf", "Surabaya", 3000000, (byte)5);
        Hotel hotel4 = new Hotel( "hotel Dox", "Yogyakarta", 3500000, (byte)3);
        Hotel hotel5 = new Hotel("hotel Every", "Malang", 4000000, (byte)4);

        service.tambah(hotel1);
        service.tambah(hotel2);
        service.tambah(hotel3);
        service.tambah(hotel4);
        service.tambah(hotel5);

        System.out.println("========================================");
        System.out.println("Data Hotel dari harga terendah : ");
        System.out.println("========================================");
        service.bubbleSort();
        service.tampilAll();
        
        System.out.println("========================================");
        System.out.println("Data Hotel dari bintang tertinggi : ");
        System.out.println("========================================");
        service.selectionSort();
        service.tampilAll();
    }
}