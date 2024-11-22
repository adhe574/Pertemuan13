import java.util.Scanner;
public class Kubus01 {
    static int hitungVolume (int sisi) {
        int volume=sisi*sisi*sisi;
        return volume;
    }

    static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan=6*sisi*sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
    
        int sisi=4;
        int volume=hitungVolume(sisi);
        int luasPermukaan=hitungLuasPermukaan(sisi);

        System.out.println("Panjang sisi : " + sisi);
        System.out.println("Volume kubus adalah " + volume);    
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
        
    }
}