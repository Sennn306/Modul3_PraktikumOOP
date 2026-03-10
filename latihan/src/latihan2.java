import java.util.Scanner;

public class latihan2 {
    public static void main (String [] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan PIN awal : ");
        int pinAwal = input.nextInt();

        System.out.println("=====SISTEM VERIFIKASI PIN=====");
        System.out.print("Masukkan PIN : ");
        int pinInput = input.nextInt();

        int percobaan = 0;
        while (percobaan < 2) {
            if (pinInput == pinAwal){
            System.out.println("PIN benar");
            break;
            } else {
            System.out.println("PIN salah");
            }
            System.out.print("Masukkan PIN : ");
            pinInput = input.nextInt();
            percobaan++;
        }

        if (percobaan == 2) {
            System.out.println("PIN terblokir");
        }
    input.close();
    }
    
}