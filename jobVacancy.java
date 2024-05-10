import java.util.Scanner;

public class jobVacancy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, gender, lulusan, posisi;
        int umur;
        double pengalaman, penampilan;

        System.out.println("Selamat datang di rekrutmen PT. Padepokan 79\n");
        System.out.println("===========================================");
        System.out.println("Silakan masukkan data diri anda di bawah ini\n");

        System.out.println("Siapa nama anda: ");
        nama = input.next();

        System.out.println("Berapa umur anda: ");
        umur = input.nextInt();

        System.out.println("Apa jenis kelamin anda (Pria/Wanita): ");
        gender = input.next();

        System.out.println("Apa jenjang pendidikan terakhir anda (SMK/D3/S1): ");
        lulusan = input.next();

        System.out.println("Berapa tahun pengalaman kerja yang anda miliki: ");
        pengalaman = input.nextDouble();

        System.out.println("Seberapa menarik penampilan anda (1-10): ");
        penampilan = input.nextDouble();

        System.out.println("Posisi apa yang akan anda lamar (Koordinator, Admin, SPV): ");
        posisi = input.next();

        // Persyaratan Koordinator
        if (posisi.equalsIgnoreCase("koordinator")){
            if (gender.equalsIgnoreCase("pria") && (lulusan.equalsIgnoreCase("smk") || lulusan.equalsIgnoreCase("d3"))){
                if (umur >= 21 && umur <= 30 && pengalaman >= 2){
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi Koordinator");
                }
            }
            else if (gender.equalsIgnoreCase("pria") && lulusan.equalsIgnoreCase("s1")){
                if (umur >= 30 && pengalaman >= 5){
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi Koordinator");
                }
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Mohon maaf lamaran anda belum berhasil untuk lanjut ke tahap selanjutnya");
            }
    
        }
        
        // Persyaratan Admin
        else if (posisi.equalsIgnoreCase("admin")){
            if (gender.equalsIgnoreCase("wanita")){
                if (lulusan.equalsIgnoreCase("d3") && umur >= 20 && umur <= 25 && (penampilan >= 8 || pengalaman >= 1)){
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi Admin");
                }
                else if (lulusan.equalsIgnoreCase("s1") && umur >= 25 && penampilan >= 8 && pengalaman >= 3){
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi Admin");
                }
                else {
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Mohon maaf lamaran anda belum berhasil untuk lanjut ke tahap selanjutnya");
                }
            }
            else if (gender.equalsIgnoreCase("pria")){
                if (umur >= 20 && umur <= 30 && penampilan >= 8 && pengalaman >= 2 && (lulusan.equalsIgnoreCase("d3") || lulusan.equalsIgnoreCase("s1"))){
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi Admin");
                }
                else {
                    System.out.println("Terima kasih " + nama + " atas lamarannya");
                    System.out.println("Mohon maaf lamaran anda belum berhasil untuk lanjut ke tahap selanjutnya");
                }
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Mohon maaf lamaran anda belum berhasil untuk lanjut ke tahap selanjutnya");
            }    
        }
        
        // Persyaratan SPV
        else if (posisi.equalsIgnoreCase("spv")){
            if (lulusan.equalsIgnoreCase("d3") && umur >= 25 && umur <= 35 && pengalaman >= 4){
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi SPV");
            }
            else if (lulusan.equalsIgnoreCase("s1") && umur >= 23 && umur <= 30 && pengalaman >= 1){
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Selamat anda berhasil lolos ke tahap selanjutnya dalam rekrutmen posisi SPV");
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Mohon maaf lamaran anda belum berhasil untuk lanjut ke tahap selanjutnya");
            }
        }

        else {
            System.out.println("Mohon maaf saat ini tidak ada lowongan untuk posisi yang anda lamar");
        }
    }
}