import java.util.Scanner;

public class booleanExpression {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int mtk, ipa, bing, bind;
        int passingGradeSMK = 73;
        int passingGradeSastra = 75;
        int passingGradeTIK = 80;
        boolean isPassingSMK, isPassingSastra, isPassingTIK;

        System.out.println("Selamat datang di ujian masuk SMK Padepokan 79");
        System.out.println("Silakan masukkan nilai-nilai anda apakah anda dapat lolos ujian masuk");

        System.out.println("Masukkan nilai Matematika anda: ");
        mtk = input.nextInt();
        
        System.out.println("Masukkan nilai IPA anda: ");
        ipa = input.nextInt();

        System.out.println("Masukkan nilai Bahasa Inggris anda: ");
        bing = input.nextInt();

        System.out.println("Masukkan nilai Bahasa Indonesia anda: ");
        bind = input.nextInt();

        isPassingSMK = (mtk + ipa + bind + bing)/4 >= passingGradeSMK;
        isPassingSastra = (bind + bing)/2 >= passingGradeSastra;
        isPassingTIK = (mtk + ipa)/2 >= passingGradeTIK;

        System.out.println("\nHasil perhitungan nilai anda adalah sebagai berikut: \n");
        System.out.println("Hasil masuk SMK Padepokan 79 adalah: " + isPassingSMK);
        System.out.println("Hasil masuk jurusan sastra adalah: " + isPassingSastra);
        System.out.println("Hasil masuk jurusan TIK adalah: " + isPassingTIK);
    }
}