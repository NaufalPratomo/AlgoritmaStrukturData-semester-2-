package JobSheet2;

public class BukuMain18 {
    public static void main(String[] args) {
        
        Buku18 bk1 = new Buku18();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hargaTotal=bk1.hitungHargaTotal();
        bk1.diskon=bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku18 bk2 = new Buku18("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hargaTotal=bk2.hitungHargaTotal();
        bk2.diskon=bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();

        Buku18 bukuNaufal = new Buku18("Emotion Control", "Naufal Pratomo", 999, 98, 199000);
        bukuNaufal.terjual(11);
        bukuNaufal.hargaTotal=bukuNaufal.hitungHargaTotal();
        bukuNaufal.diskon=bukuNaufal.hitungDiskon();
        bukuNaufal.hitungHargaBayar();
        bukuNaufal.tampilInformasi();
    } 
}
