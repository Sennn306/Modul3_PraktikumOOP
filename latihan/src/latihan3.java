
public class latihan3 {
    public static void main (String [] args) throws Exception {
       for (int i = 1; i <= 50; i++) {
           if (i % 3 == 0 || i % 5 == 0) {
            continue;
           }
           System.out.println(i);
       }
    }
}