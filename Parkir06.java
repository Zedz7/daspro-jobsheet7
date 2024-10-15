import java.util.Scanner;

public class Parkir06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 Mobil 2 Motor 0 Keluar): ");
            jenis = sc.nextInt();
            if (jenis == 0 ) {
                break;
            } else if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500; 
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
                System.out.println("Total yang harus dibayar adalah Rp " + total);
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silahkan masukkkan ulang");
            }
        }
    }
}