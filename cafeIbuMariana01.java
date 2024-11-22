public class cafeIbuMariana01 {
    public static void main(String[] args) {
        
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };

        System.out.println("Data Penjualan : ");
        for (int i=0; i<menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j=0; j<penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }

            System.out.println();
        }

        int maxPenjualan=0;
        String menuTerlaris="";
        for (int i=0; i<menu.length; i++) {
            int total=0;
            for (int j=0; j<penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total>maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi : " + menuTerlaris + ", dengan total penjualan " + maxPenjualan + ")");
        System.out.println("\nRata-rata Penjualan : ");
        for (int i=0; i<menu.length; i++) {
            int total=0;
            for (int j=0; j<penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            double rataRata = total / penjualan[i].length;
            System.out.printf("%s: %.2f\n", menu[i], rataRata);
        }
    }
}
