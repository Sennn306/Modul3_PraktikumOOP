import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan operasi " + "(+,-,*,/) : ");
        String pilihan = input.nextLine();

        System.out.print("Masukkan angka pertama : ");
        float angka1 = input.nextFloat();

        System.out.print("Masukkan angka kedua : ");
        float angka2 = input.nextFloat();

        switch (pilihan) {
            case "+":
                System.out.println(angka1 + angka2);
                break;
            case "-":
                System.out.println(angka1 - angka2);
                break;
            case "*":
                System.out.println(angka1 * angka2);
                break;
            case "/":
                if (angka2 == 0) {
                    System.out.println("Pembagian dengan nol tidak dapat dilakukan");
                    break;
                } else {
                System.out.println(angka1 / angka2);
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        input.close();
    }
    
}
