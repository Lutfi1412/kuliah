import java.util.Scanner;
import java.text.DecimalFormat;

public class La2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###");
        double toyota, avanza, fortuner, mobil;
        toyota = 100000000;
        avanza = 500000000;
        fortuner = 300000000;
        mobil = 78000000;

        System.out.println("=== Selamat Datang Di Toko Mobil TOKTOK ===");
        System.out.println("List Harga Mobil");
        System.out.println("1. Toyota Rp. 100.000.000");
        System.out.println("2. Avanza Rp. 500.000.000");
        System.out.println("3. Fortuner Rp. 300.0000.000");
        System.out.println("4. Mobil F1 Rp. 78.000.000");
        System.out.println();
        System.out.println("diskon yang kami tawarkan : ");
        System.out.println("Beli 2 Diskon : 10%");
        System.out.println("Beli 3-5 Diskon : 20%");
        System.out.println("Beli lebih dari 5 Diskon : 50%");
        System.out.println("============================================");

        System.out.println("apakah anda tertarik dengan penawaran kami? [Y/N]");
        String lanjutgak = input.next().toUpperCase();

        if (lanjutgak.equals("Y")) {

            System.out.println("beli berapa mobil ");
            int berapa = input.nextInt();

            System.out.println("pilih mobil mana ?");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    if (berapa == 1) {
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(toyota) + " IYA!");
                    } else if (berapa < 3) {
                        toyota = (toyota * berapa) - (toyota * berapa * 0.1);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(toyota) + " IYA!");
                    } else if (berapa <= 5) {
                        toyota = (toyota * berapa) - ((toyota * 0.2) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(toyota) + " IYA!");
                    } else if (berapa > 5) {
                        toyota = (toyota * berapa) - ((toyota * 0.5) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(toyota) + " IYA!");
                    }
                    break;
                case 2:
                    if (berapa == 1) {
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(avanza) + " IYA!");
                    } else if (berapa < 3) {
                        avanza = (avanza * berapa) - (avanza * 0.1) * berapa;
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(avanza) + " IYA!");
                    } else if (berapa <= 5) {
                        avanza = (avanza * berapa) - ((avanza * 0.2) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(avanza) + " IYA!");
                    } else if (berapa > 5) {
                        avanza = (avanza * berapa) - ((avanza * 0.5) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(avanza) + " IYA!");
                    }
                    break;
                case 3:
                    if (berapa == 1) {
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(fortuner) + " IYA!");
                    } else if (berapa < 3) {
                        fortuner = (fortuner * berapa) - ((fortuner * 0.1) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(fortuner) + " IYA!");
                    } else if (berapa <= 5) {
                        fortuner = (fortuner * berapa) - ((fortuner * 0.2) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(fortuner) + " IYA!");
                    } else if (berapa > 5) {
                        fortuner = (fortuner * berapa) - ((fortuner * 0.5) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(fortuner) + " IYA!");
                    }
                    break;
                case 4:
                    if (berapa == 1) {
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(mobil) + " IYA!");
                    } else if (berapa < 3) {
                        mobil = (mobil * berapa) - (mobil * 0.1) * berapa;
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(mobil) + " IYA!");
                    } else if (berapa <= 5) {
                        mobil = (mobil * berapa) - ((mobil * 0.2) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(mobil) + " IYA!");
                    } else if (berapa > 5) {
                        mobil = (mobil * berapa) - ((mobil * 0.5) * berapa);
                        System.out.println("Anda memesan " + berapa + " mobil");
                        System.out.println("Harganya " + formatter.format(mobil) + " IYA!");
                    }
                    break;
                default:
                    System.out.println("pilihan tidak tersedia.");
            }
        } else if (lanjutgak.equals("N")) {
            System.out.println("Baik, Terimakasih");
        } else {
            System.out.println("inputan tidak valid");
        }
    }
}
