import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int realNumber = rand.nextInt(10);
        int guess;

        System.out.println("Selamat datang di game tebak angka");
        System.out.println("Anda harus menebak angka antara 1 sampai 10 dalam tiga kali tebakan");
        System.out.println("Tebak angka anda");

        for (int i = 0; i < 3; i++){
            guess = input.nextInt();
            
            if (i != 2){
                if (guess < 1 || guess > 10){
                    System.out.println("Salah, angka anda di luar batasan permainan");
                    System.out.println("Tebak lagi: ");
                }
                else if (guess > realNumber){
                    System.out.println("Salah, pilih angka yang lebih kecil");
                    System.out.println("Tebak lagi: ");
                }
                else if (guess < realNumber){
                    System.out.println("Salah, pilih angka yang lebih besar");
                    System.out.println("Tebak lagi: ");
                }
                else {
                    System.out.println("Benar, angkanya adalah " + realNumber);
                    break;
                }
            }
            else {
                if (guess == realNumber){
                    System.out.println("Benar, angkanya adalah " + realNumber);
                }
                else {
                    System.out.println("Maaf kesempatan anda habis, jawabannya adalah " + realNumber);
                }                
            }
        }
    }
}