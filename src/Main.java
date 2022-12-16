import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, discount, ageDiscount, returnType, total , normal=0;
        int type , age;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = inp.nextInt();

        System.out.println("Enter the distance : ");
        distance = inp.nextInt();

        System.out.println("Please select your type : 1=> OneWay 2=> Return");
        type = inp.nextInt();

        if((distance>0)&&(age>0)&&(type ==1)||(type==2)){
            normal = distance * 0.10;
            if(age<12){
                ageDiscount = normal*0.50;
                discount = normal-ageDiscount;
                total = discount;
                if(type==2){
                    returnType = discount*0.20;
                    total = discount-returnType;
                }
                System.out.println("Ticket price="+ total);
            }


        } else if (age>=12 && age<=24) {
            ageDiscount = normal *  0.10;
            discount = normal - ageDiscount;
            total = discount;
            if(type==2){
                returnType = discount*0.20;
                total = discount-returnType;
            }
            System.out.println("Ticket price: "+total);

        } else if (age>65) {
            ageDiscount = normal * 0.30;
            discount = normal - ageDiscount;
            total = ageDiscount;
            if(type==2){
                returnType = discount*0.20;
                total = discount-returnType;
            }
            System.out.println("Ticket price: "+total);

        }
        else{
            System.out.println("Entered wrong data!");
        }


    }
}