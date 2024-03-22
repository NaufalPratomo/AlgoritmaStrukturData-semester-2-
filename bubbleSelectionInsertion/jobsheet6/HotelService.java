package bubbleSelectionInsertion.jobsheet6;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int id = 0;
    void tambah(Hotel h) {
        if (id < rooms.length) {
            rooms[id] = new Hotel();
            rooms[id] = h;
            id++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (int i = 0; i < id; i++) {
            System.out.println(rooms[i].nama + " yang berada di kota " + rooms[i].kota + " dengan harga : " + rooms[i].harga + " dan bintang : " + rooms[i].bintang);
        }
    }

    void bubbleSort() {
        int n = rooms.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
    }

    void selectionSort() {
        int n = rooms.length;
        for (int i = 0; i < n-1; i++) {
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (rooms[j].bintang > rooms[max_idx].bintang)
                    max_idx = j;
            Hotel temp = rooms[max_idx];
            rooms[max_idx] = rooms[i];
            rooms[i] = temp;
        }
    }
}

