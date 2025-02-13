import java.util.Arrays;

public class fungsi23 {
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int[][] stokBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    static int[] harga = {75000, 50000, 60000, 10000}; 
    static int[] bungaMati = {-1, -2, 0, -5};

    public static void main(String[] args) {
        tampilkanPendapatan();
        tampilkanStok();
        updateStok();
        tampilkanStok(); 
    }

    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan Tiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * harga[j];
            }
            System.out.println(cabang[i] + " = Rp " + pendapatan);
        }
        System.out.println();
    }

    public static void tampilkanStok() {
        System.out.println("Stok Bunga di Setiap Cabang:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n", cabang[i], stokBunga[i][0], stokBunga[i][1], stokBunga[i][2], stokBunga[i][3]);
        }
        System.out.println();
    }

    public static void updateStok() {
        System.out.println("Setelah dikurangi bunga Mati:");
        
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokBunga[i][j] += bungaMati[j]; 
            }
        }
    }
}