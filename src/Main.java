import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Variables defined here.
        double km, costPerKm = 0.1 , total;
        byte type;
        int age;
        boolean isError = false;

        //Data retrieved from user.
        System.out.print("Enter distance : ");
        km = inp.nextDouble();

        System.out.print("Enter your age : ");
        age = inp.nextInt();

        System.out.print("Select your type (1 => One Way , 2 => Return ): ");
        type = inp.nextByte();
        total = km * costPerKm;

        //Age and type checked.
        if (age<12){
            total *= 0.5;
        }
        else if (age<=24) {
            total *= 0.9;
        }
        else if (age>65) {
            total *= 0.7;
        }

        switch (type){
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            case 1:
                total += total;
                break;
            default:
                isError = true;
        }

        if (!(km>=0)){
            isError = true;
        }

        //Result printed.
        if (isError){
            System.out.println("Entered wrong data !");
        }
        else{
            System.out.println("Total: " + total + " TL");
        }
    }
}