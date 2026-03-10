// 105224030_Adrenalin Syahrobby_Pre-test_Modul 3
// Program penentuan kelayakan donor darah
import java.util.Scanner;
public class pretest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia : ");
        int usia = input.nextInt();

        System.out.print("Berat Badan : ");
        double bb = input.nextDouble();

        System.out.print("Kadar Hemoglobin : ");
        double hemo = input.nextDouble();

        System.out.println("======HASIL KELAYAKAN DONOR DARAH======");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        
        if (usia >= 17) {
            if (bb >= 45.0) {
                if (hemo >= 15.0) {
                    System.out.println("Kelayakan Donor Darah : Layak");
                } else {
                    System.out.println("Kelayakan Donor Darah : Tidak Layak, Kadar Hemoglobin Tidak Mencukupi");
                }     
            } else {
                System.out.println("Kelayakan Donor Darah : Tidak Layak, Berat Badan Tidak Mencukupi");
            }
        } else {
            System.out.println("Kelayakan Donor Darah : Tidak Layak, Usia Tidak Mencukupi");
        }
    }
}
