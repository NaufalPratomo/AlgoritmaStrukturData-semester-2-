package JobSheet3.LatihanPraktikum1;

import java.util.Scanner;

public class ArrayBangunRuang {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] bangunRuang = new BangunRuang[3];

        for (int i = 0; i < bangunRuang.length; i++) {

            if (i==0){
                bangunRuang[i] = new BangunRuang();
                bangunRuang[i].jenisBangunRuang=i;
                System.out.println("Masukkan panjang sisi alas limas:");
                bangunRuang[i].sisi = scanner.nextInt();
                System.out.println("Masukkan tinggi limas:");
                bangunRuang[i].tinggi = scanner.nextInt();
                bangunRuang[i].sisiMiring=Math.sqrt((bangunRuang[i].sisi/2.0*bangunRuang[i].sisi/2.0)+(bangunRuang[i].tinggi*bangunRuang[i].tinggi));
            } else if(i==1){
                bangunRuang[i] = new BangunRuang();
                bangunRuang[i].jenisBangunRuang=i;
                System.out.println("Masukkan jari-jari kerucut:");
                bangunRuang[i].jari2 = scanner.nextInt();
                System.out.println("Masukkan sisi miring kerucut:");
                bangunRuang[i].sisiMiring = scanner.nextInt();
            } else {
                bangunRuang[i] = new BangunRuang();
                bangunRuang[i].jenisBangunRuang=i;
                System.out.println("Masukkan jari-jari bola:");
                bangunRuang[i].jari2 = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("Volume: " + bangunRuang[i].hitungVolume());
            System.out.println("Luas Permukaan: " + bangunRuang[i].hitungLuasPermukaan());
        }
    }
}
