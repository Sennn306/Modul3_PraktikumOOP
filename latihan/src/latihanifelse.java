import java.util.Scanner;
public class latihanifelse {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan usia : ");
        int usia = input.nextInt();

        if (usia > 17) {
            System.out.println("Anda boleh donor");
            System.out.print("Masukkan berat badan : ");
            double berat = input.nextInt();
            if (berat > 45.0) {
                System.out.println("Anda boleh donor");
                System.out.print("Masukkan kadar HB : ");
                double hb = input.nextDouble();
                if (hb > 12.0) {
                    System.out.println("Anda boleh donor");
                } else {
                    System.out.println("Anda belum boleh donor");
                }
            } else {
                System.out.println("Anda belum boleh donor");
            }
        } else {
            System.out.println("Anda belum boleh donor");
        }


    }
    input.close();
}
