import java.util.Scanner;

public class Bioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0, hargaTiket = 50000;
        double totalPenjualan = 0;
        char lanjut = 'y';
        double totalHarga;

        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Silahkan masukkan ulang");
                    continue;
                }
                totalHarga = jumlahTiket * hargaTiket;

                if (jumlahTiket > 10) {
                    totalHarga *= 0.85;
                } else if (jumlahTiket > 4) {
                    totalHarga *= 0.90;
                }

                totalTiketTerjual += jumlahTiket;
                totalPenjualan += totalHarga;

                System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah Rp " + totalHarga);

                System.out.print("Apakah anda ingin lanjut? (y/n): ");
                lanjut = sc.next().charAt(0);
        }

        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini : Rp " + totalPenjualan);
    }
}
