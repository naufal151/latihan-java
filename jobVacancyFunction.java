import java.util.Scanner;

public class jobVacancyFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, lulusan, gender, posisi;
        int pengalaman, umur;
        double penampilan;

        System.out.println("Selamat datang di rekrutmen PT. Padepokan 79");
        System.out.println("==========================================");
        System.out.println("Silakan masukkan data diri anda: \n");

        System.out.println("Siapa nama anda: ");
        nama = input.next();

        System.out.println("Berapa umur anda: ");
        umur = input.nextInt();

        System.out.println("Apa jenis kelamin anda (Pria/Wanita): ");
        gender = input.next();

        System.out.println("Apa jenjang terakhir pendidikan anda (SMK/D3/S1): ");
        lulusan = input.next();

        System.out.println("Berapa pengalaman bekerja yang anda miliki: ");
        pengalaman = input.nextInt();
        
        System.out.println("Seberapa menarikkah penampilan anda (1-10): ");
        penampilan = input.nextDouble();

        System.out.println("Posisi apa yang akan anda lamar (Koordinator/Admin/SPV): ");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("koordinator")){
            if (validateKoordinator(umur, gender, lulusan, pengalaman)){
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Selamat " + nama + ", anda berhasil lolos untuk posisi Koordinator");
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Maaf " + nama + ", anda belum berhasil lolos untuk posisi Koordinator");
            }
        }
        else if (posisi.equalsIgnoreCase("admin")){
            if (validateAdmin(umur, gender, lulusan, pengalaman, penampilan)){
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Selamat " + nama + ", anda berhasil lolos untuk posisi Admin");
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Maaf " + nama + ", anda belum berhasil lolos untuk posisi Admin");
            }
        }
        else if (posisi.equalsIgnoreCase("spv")){
            if (validateSPV(umur, lulusan, pengalaman)){
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Selamat " + nama + ", anda berhasil lolos untuk posisi SPV");
            }
            else {
                System.out.println("Terima kasih " + nama + " atas lamarannya");
                System.out.println("Maaf " + nama + ", anda belum berhasil lolos untuk posisi SPV");
            }
        }
        else {
            System.out.println("Maaf saat ini kami tidak membuka lamaran untuk posisi tersebut");
        }
    }

    public static boolean validateKoordinator(int umur, String gender, String lulusan, int pengalaman){
        boolean reqKoor1, reqKoor2, result;

        reqKoor1 = gender.equalsIgnoreCase("pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("smk") || lulusan.equalsIgnoreCase("d3")) && pengalaman >= 2;
        reqKoor2 = gender.equalsIgnoreCase("pria") && umur >= 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 5;
        
        if (reqKoor1 || reqKoor2){
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }

    public static boolean validateAdmin(int umur, String gender, String lulusan, int pengalaman, double penampilan){
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        reqAdmin1 = gender.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("d3") && (penampilan >= 8 || pengalaman >= 1);
        reqAdmin2 = gender.equalsIgnoreCase("wanita") && umur >= 25 && lulusan.equalsIgnoreCase("s1") && penampilan >= 8 && pengalaman >= 3;
        reqAdmin3 = gender.equalsIgnoreCase("pria") && umur >= 20 && umur <= 30 && penampilan >= 8 && (lulusan.equalsIgnoreCase("d3") || lulusan.equalsIgnoreCase("s1")) && pengalaman >= 2;

        if (reqAdmin1 || reqAdmin2 || reqAdmin3){
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }

    public static boolean validateSPV(int umur, String lulusan, int pengalaman){
        boolean reqSPV1, reqSPV2, result;

        reqSPV1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 1;
        reqSPV2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("d3") && pengalaman >= 4;

        if (reqSPV1 || reqSPV2){
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
}