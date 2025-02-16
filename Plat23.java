import java.util.Scanner;

public class Plat23 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N', },
            {'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.print("Nama kota: ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    if (KOTA[i][j] != '\0') {
                        System.out.print(KOTA[i][j]);
                    }
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}
