import java.util.Scanner;
public class Percobaan501 {
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume=hitungLuas(a, b)*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
    
        int p,l,t,L,vol;
    
        System.out.print("Masukkan panjang : ");
        p=sc01.nextInt();
        System.out.print("Masukkan lebar : ");
        l=sc01.nextInt();
        System.out.print("Masukkan tinggi : ");
        t=sc01.nextInt();
    
        L=p*l;
        System.out.println("Luas Persegi panjang adalah " + L);
    
        vol=p*l*t;
        System.out.println("Volume balok adalah " + vol);
    }
}