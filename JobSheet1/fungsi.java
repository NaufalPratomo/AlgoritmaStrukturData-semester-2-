package JobSheet1;

import java.util.Scanner;

public class fungsi {

    private static final String[] NAMA_BUNGA = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    private static final int[][] STOK = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    private static final int[] HARGA = { 75000, 50000, 60000, 10000 };
    private static final int[] KEMATIAN = { 1, 2, 0, 5 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] terjual = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan jumlah bunga yang terjual untuk " + NAMA_BUNGA[i] + ":");
            terjual[i] = sc.nextInt();
        }
        tampilkanPendapatan(terjual);
        tampilkanStok(3);
        perbaruiStok();
    }

    public static void tampilkanPendapatan(int[] terjual) {
        for (int i = 0; i < STOK.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < STOK[i].length; j++) {
                pendapatan += terjual[j] * HARGA[j];
            }
            System.out.println("Pendapatan untuk RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
    }

    public static void tampilkanStok(int cabang) {
        System.out.println("Stok untuk RoyalGarden " + cabang + ": ");
        for (int i = 0; i < STOK[cabang - 1].length; i++) {
            System.out.println(STOK[cabang - 1][i]);
        }
    }

    public static void perbaruiStok() {
        for (int i = 0; i < STOK.length; i++) {
            for (int j = 0; j < STOK[i].length; j++) {
                STOK[i][j] -= KEMATIAN[j];
            }
        }
    }
}
