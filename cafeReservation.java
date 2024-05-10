import java.util.Scanner;

public class cafeReservation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name, gender, day;
        int age;
        double appearance, budget;

        System.out.println("Selamat datang di reservasi Cafe Padepokan 79!\n");

        System.out.println("Siapa nama anda?: ");
        name = input.next();
        System.out.println("Apa gender anda? (M/F): ");
        gender = input.next();
        System.out.println("Berapa umur anda?: ");
        age = input.nextInt();
        System.out.println("Berapa budget yang anda miliki?: ");
        budget = input.nextDouble();
        System.out.println("Seberapa menarikkah penampilan anda menurut anda? (1-10): ");
        appearance = input.nextDouble();
        System.out.println("Untuk hari apa anda akan reservasi?: ");
        day = input.next();

        if (day.equalsIgnoreCase("Senin")){
            if (age >= 20 && age <=30 && budget >= 500){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Young Night hari Senin telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, Senin hanyalah untuk Young Night");
            }
        }
        else if (day.equalsIgnoreCase("Selasa")){
            if (age >= 31 && age <= 50 && budget >= 250){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Oldest Night hari selasa telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, Selasa hanyalah untuk Oldest Night");
            }
        }
        else if (day.equalsIgnoreCase("Rabu")){
            if (age >= 20 && age <= 35 && gender.equalsIgnoreCase("f") && appearance >= 8.0 && budget >= 300){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Ladies Night hari rabu telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, Rabu hanyalah untuk Ladies Night");
            }
        }
        else if (day.equalsIgnoreCase("kamis")){
            if (gender.equalsIgnoreCase("f") && age >= 21 && age <=30 && appearance >= 8 && budget >= 300){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Party Night For Single hari Kamis telah berhasil");
            }
            else if (gender.equalsIgnoreCase("m") && age >= 21 && age <=30 && budget >= 1000){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Party Night For Single hari Kamis telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, Kamis hanyalah untuk Party Night For Single");
            }
        }
        else if (day.equalsIgnoreCase("jumat")){
            if (gender.equalsIgnoreCase("f") && age >= 31 && age >= 45 && budget >= 1000){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Women Night hari jumat telah berhasil");
            }
            else if (gender.equalsIgnoreCase("m") && age >= 21 && age <= 25 && appearance >= 8){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Women Night hari jumat telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, Jumat hanyalah untuk Women Night");
            }
        }
        else {
            if (age >= 18 && age <= 60 && budget >= 100){
                System.out.println("Terima kasih " + name + " atas reservasinya.");
                System.out.println("Selamat reservasi anda untuk Weekend Freedom hari " + day + " telah berhasil");
            }
            else {
                System.out.println("Maaf reservasi anda belum berhasil, " + day + " hanyalah untuk Weekend Freedom");
            }
        }

    }
}