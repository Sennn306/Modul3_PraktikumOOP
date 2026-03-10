import java.util.Scanner;
public class posttest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int saldo = 500000;
        int pilihan;
        System.out.println("=====SISTEM MENU ATM (SIMULASI)");
        do {
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda : Rp" + saldo);
                    System.out.println("=============");
                    break;
                case 2:
                    System.out.print("Masukkan Jumlah Setor Tunai: Rp");
                    int setor = input.nextInt();
                    saldo += setor;
                    System.out.println("Saldo Anda Sekarang : Rp" + saldo);
                    System.out.println("=============");
                    break;
                case 3:
                    System.out.print("Masukkan Jumlah Tarik Tunai : Rp");
                    int tarik = input.nextInt();
                    if (tarik > saldo) {
                        System.out.println("Saldo Anda Tidak Mencukupi");
                        System.out.println("=============");
                    } else {
                        if (saldo - tarik < 50000){
                            System.out.println("Penarikan Gagal, Saldo Mencapai Batas Minimal");
                            System.out.println("=============");
                        } else {
                        saldo -= tarik;
                        System.out.println("Saldo Anda Sekarang: Rp" + saldo);
                        System.out.println("=============");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        } while (pilihan != 4);
    input.close();
    }
}

