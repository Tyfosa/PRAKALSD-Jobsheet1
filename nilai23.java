import java.util.Scanner;

public class nilai23 {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        Scanner scanner = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        System.out.print("Masukkan nilai tugas (0-100): ");
        nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai kuis (0-100): ");
        nilaiKuis = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        nilaiUAS = scanner.nextDouble();

        boolean valid = true;
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            valid = false;
        }
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            valid = false;
        }
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            valid = false;
        }
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            valid = false;
        }

        if (!valid) {
            System.out.println("Nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        
        String nilaiHuruf;
        String nilaiSetara;
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = "4.0";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = "3.5";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = "3.0";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = "2.5";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = "2.0";
        } else if (nilaiAkhir > 40 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = "1.0";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = "0.0";
        }

        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "Maaf anda TIDAK LULUS" : "Selamat Anda LULUS";

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println(keterangan);
    }
}