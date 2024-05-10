import java.util.Scanner;

public class pigDice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int roll, turnTotal;
        int ptot = 0;
        int ctot = 0;
        String choice = "";

        do {
            if (ptot < 100){
                turnTotal = 0;
                System.out.println("Komputer memiliki " + turnTotal + " poin");

                do {
                    roll = 1 + (int)(Math.random()*6);
                    System.out.println("Komputer mengocok angka " + roll);
                    if (roll == 1){
                        System.out.println("Giliran komputer berakhir");
                        turnTotal = 0;
                    }
                    else {
                        turnTotal += roll;
                        System.out.println("Komputer memiliki " + turnTotal + " poin sejauh ini");
                        if (turnTotal < 10){
                            System.out.println("Komputer akan mengocok lagi");
                        }
                    }
                }
                while (roll != 1 && turnTotal < 10);
                ctot += turnTotal;
                System.out.println("Komputer mengakhiri putaran dengan " + ctot + " poin");
            }
            turnTotal = 0;
            System.out.println("Kamu memiliki " + ptot + " poin");

            do {
                roll = 1 + (int)(Math.random()*6);
                System.out.println("Kamu mengocok angka " + roll);
                if (roll == 1){
                    System.out.println("Itu akhir dari giliranmu");
                    turnTotal = 0;
                }
                else {
                    turnTotal += roll;
                    System.out.println("Kamu memiliki " + turnTotal + "poin sejauh ini");
                    System.out.println("Apakah kamu ingin mengocok lagi atau tahan? (kocok/tahan)");
                    choice = input.next();
                }
            }
            while (roll != 1 && choice.equalsIgnoreCase("kocok"));

            ptot += turnTotal;
            System.out.println("Kamu mengakhiri putaran dengan " + ptot + " poin");
        }
        while (ptot < 50 && ctot < 50);

        if (ptot > ctot){
            System.out.println("Player menang!");
        }
        else {
            System.out.println("Komputer menang!");
        }
    }
}