import java.util.Scanner;

public class input {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int moneySpent;
        int total = 0;
        
        System.out.println("Let's calculate your total money spending this week!\n");
        for (int day = 1; day < 8; day++){
            switch (day) {
                case 1:
                    System.out.println("How much money did you spend on Monday?: ");    
                    break;
                case 2:
                    System.out.println("How much money did you spend on Tuesday?: ");    
                    break;
                case 3:
                    System.out.println("How much money did you spend on wednesday?: ");    
                    break;
                case 4:
                    System.out.println("How much money did you spend on Thursday?: ");    
                    break;
                case 5:
                    System.out.println("How much money did you spend on Friday?: ");    
                    break;
                case 6:
                    System.out.println("How much money did you spend on Saturday?: ");    
                    break;
                case 7:
                    System.out.println("How much money did you spend on Sunday?: ");    
                    break;
            }
            moneySpent = input.nextInt();
            total = total + moneySpent;
            
        }
        System.out.println("Your total spending this week is " + total);
        System.out.println("And your average spending this week is " + total/7);
    }
}