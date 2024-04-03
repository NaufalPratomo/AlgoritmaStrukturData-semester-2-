package TestSearching.P7;

public class PencarianBuku18 {

    Buku18 listBk[] = new Buku18[5];
    int idx;

    public int FindSeqSearchJudul(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cari)) {
                if (posisi != -1) {
                    System.out.println("Peringatan: Lebih dari satu buku dengan judul " + cari + " ditemukan!");
                }
                posisi = j;
            }
        }
        return posisi;
    }

    public void sortJudul() {
        int n = listBk.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j+1].judulBuku) > 0) {
                    Buku18 temp = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = temp;
                }
            }
        }
    }

    public int FindBinarySearchJudul(String cari) {
        sortJudul(); 
        int left = 0, right = listBk.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = cari.compareTo(listBk[mid].judulBuku);
            if (res == 0)
                return mid;
            if (res > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }


    void tambah(Buku18 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku18 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku) == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks : " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t :"+x);
            System.out.println("Judul Buku\t :"+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t :"+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t :"+listBk[pos].pengarang);
            System.out.println("Stock\t :"+listBk[pos].stock);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public Buku18 FindBuku(int cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (Integer.parseInt(listBk[i].kodeBuku) == cari) {
                return listBk[i];
            }
        }
        return null;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == Integer.parseInt(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (Integer.parseInt(listBk[mid].kodeBuku) < cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}

