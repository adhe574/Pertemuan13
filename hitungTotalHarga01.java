import java.util.Scanner;
public class hitungTotalHarga01 {
    public static int hitungTotalHarga01(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 180000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
        
    } 

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int pilihanMenu = sc01.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc01.nextInt();

        int totalHarga = hitungTotalHarga01(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda : Rp" + totalHarga);
    }
}