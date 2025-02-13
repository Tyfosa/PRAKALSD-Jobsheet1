import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 3, 3, 4, 2, 3, 2, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        
        System.out.println("Program Menghitung IP Semester");
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            
            if (nilaiAngka[i] >= 80) nilaiHuruf[i] = "A";
            else if (nilaiAngka[i] >= 73) nilaiHuruf[i] = "B+";
            else if (nilaiAngka[i] >= 65) nilaiHuruf[i] = "B";
            else if (nilaiAngka[i] >= 60) nilaiHuruf[i] = "C+";
            else if (nilaiAngka[i] >= 50) nilaiHuruf[i] = "C";
            else if (nilaiAngka[i] >= 39) nilaiHuruf[i] = "D";
            else nilaiHuruf[i] = "E";
            
            switch (nilaiHuruf[i]) {
                case "A": bobotNilai[i] = 4.0; break;
                case "B+": bobotNilai[i] = 3.5; break;
                case "B": bobotNilai[i] = 3.0; break;
                case "C+": bobotNilai[i] = 2.5; break;
                case "C": bobotNilai[i] = 2.0; break;
                case "D": bobotNilai[i] = 1.0; break;
                default: bobotNilai[i] = 0.0;
            }
        }
        
        double totalBobot = 0, totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        double ipSemester = totalBobot / totalSKS;
        
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("===========================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai", "Huruf", "Bobot");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("===========================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        
    }
}
