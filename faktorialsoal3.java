package latihanukl;
//latihan utk menghitung faktorial
//soal mudah 3
import java.util.Scanner;
public class faktorialsoal3 {
    static long factorial(int n) {
       long result = 1;
         for (int i = 1; i <= n; i++) {
              result *= i;
         }
         return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah nilai positif");
        int bilangan = input.nextInt();

        System.out.println("Faktorial dari " + bilangan + " adalah: " + factorial(bilangan));
        input.close();
    }
}
