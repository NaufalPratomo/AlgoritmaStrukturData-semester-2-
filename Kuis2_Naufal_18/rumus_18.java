package Kuis2_Naufal_18;

public class rumus_18 {
    node_18 head18;
    node_18 tail18;
    int size18;
    Pesanan_18[] pesanan18 = new Pesanan_18[10];

    public boolean isEmpty18() {
        if (head18 == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addLast18(Pembeli_18 a, Pesanan_18 b) {
        node_18 Node18 = new node_18(a, null, tail18);
        if (isEmpty18()) {
            head18 = Node18;
            tail18 = Node18;
        } else {
            tail18.next18 = Node18;
            tail18 = Node18;
        }
        size18++;
    }

    public void print18() {
        node_18 current18 = head18;
        while (current18 != null) {
            System.out.println(current18.pembeli18.nomorAntrian18 + "          " +current18.pembeli18.namaPembeli18 + "               " + current18.pembeli18.NoHp18);
            current18 = current18.next18;
        }
    }

    public void removeFirst18() {
        if (isEmpty18()) {
            System.out.println("Antrian kosong");
        } else {
            head18 = head18.next18;
            size18--;
        }
    }

    public void Tambah18(Pesanan_18 a, int antrian18) {
        pesanan18[antrian18] = a;
    }

    public void tampilPesanan18() {
        for (int i = 0; i < pesanan18.length; i++) {
            if (pesanan18[i] != null) {
                System.out.println(
                        pesanan18[i].kodePesanan18 + " _ " + pesanan18[i].namaPesanan18 + " _ " + pesanan18[i].harga18);
            } else {
                break;
            }
        }
    }

    public void sortPesanan18(){
        for (int i = 0; i < pesanan18.length; i++) {
            for (int j = i + 1; j < pesanan18.length; j++) {
                if (pesanan18[j] != null) {
                    if (pesanan18[i].namaPesanan18.compareTo(pesanan18[j].namaPesanan18) > 0) {
                        Pesanan_18 temp = pesanan18[i];
                        pesanan18[i] = pesanan18[j];
                        pesanan18[j] = temp;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void totalJual18() {
        int total18 = 0;
        for (int i = 0; i < pesanan18.length; i++) {
            if (pesanan18[i] != null) {
                total18 += pesanan18[i].harga18;
            } else {
                break;
            }
        }
        System.out.println("Pendapatan hari ini: " + total18);
    }
}

