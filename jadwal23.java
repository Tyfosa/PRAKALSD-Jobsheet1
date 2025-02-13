import java.util.Scanner;

public class jadwal23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("Masukkan SKS mata kuliah ke-" + (i + 1) + ": ");
            sks[i] = scanner.nextInt();
            System.out.print("Masukkan semester mata kuliah ke-" + (i + 1) + ": ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan hari kuliah mata kuliah ke-" + (i + 1) + ": ");
            hariKuliah[i] = scanner.nextLine();
        }

        while (true) {
            int pilihan = tampilkanMenu(scanner);
            if (pilihan == 1) {
                tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah (misalnya 'Senin'): ");
                String hari = scanner.nextLine();
                tampilkanJadwalHari(hari, namaMatkul, sks, semester, hariKuliah);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                int sem = scanner.nextInt();
                scanner.nextLine();
                tampilkanJadwalSemester(sem, namaMatkul, sks, semester, hariKuliah);
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = scanner.nextLine();
                cariMataKuliah(nama, namaMatkul, sks, semester, hariKuliah);
            } else if (pilihan == 5) {
                System.out.println("Terima kasih");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static int tampilkanMenu(Scanner scanner) {
        System.out.println("\nMenu:");
        System.out.println("1. Menampilkan seluruh jadwal kuliah");
        System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
        System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
        System.out.println("4. Mencari mata kuliah berdasarkan nama mata kuliah");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        return pilihan;
    }

    private static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nSeluruh jadwal kuliah:");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println("Nama Matkul: " + namaMatkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
        }
    }

    private static void tampilkanJadwalHari(String hari, String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal kuliah pada hari " + hari + ":");
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Nama Matkul: " + namaMatkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
            }
        }
    }
    
    private static void tampilkanJadwalSemester(int sem, String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal kuliah pada semester " + sem + ":");
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println("Nama Matkul: " + namaMatkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
            }
        }
    }

    private static void cariMataKuliah(String nama, String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nHasil pencarian untuk mata kuliah '" + nama + "':");
        boolean found = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(nama)) {
                System.out.println("Nama Matkul: " + namaMatkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}