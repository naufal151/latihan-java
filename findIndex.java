import java.util.Scanner;

public class findIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int findNumber = 0, count = 0;
        int number[] = {3, 2, 3, 12, 15, 11, 8, 10, 1, 9, 5, 4, 6};
        boolean isThere = false;

        System.out.println("Selamat datang di mencari angka dalam array");
        System.out.println("Masukkan angka yang ingin dicari: ");
        findNumber = input.nextInt();

        for (int i = 0; i < number.length; i++){
            if (findNumber == number[i]){
                isThere = true;
                count++;
            }
        }

        if (isThere = true){
            System.out.println("Angka " + findNumber + " yang anda cari dalam array");
            System.out.println("Terdapat " + count + " angka " + findNumber + " di dalam array");
            System.out.println("yaitu pada indeks ke- ");
            for (int i = 0; i < number.length; i++){
                if (findNumber == number[i]){
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.println("Angka " + findNumber + " tidak ada di dalam array");
        }
    }
}