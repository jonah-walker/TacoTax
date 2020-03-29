package tax;

import java.util.Scanner;

public class line11300to11500 {
     Scanner k = new Scanner(System.in);
    public double line11300(){
        String in;
        double amount = 0.00;
        while(true){
            System.out.print("Do you receive a Old age security pension(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter your Old age security pension amount (box 18 of the T4A(OAS) slip): ");
                amount = k.nextDouble();
                break;
            }else if(in == "n") break;
            else System.out.println("Please input y or n");
        }
        return amount;
    }
    
    
    public double line11400(){
        String in;
        double amount = 0.00;
        while(true){
            System.out.print("Do you receive CPP or QPP benefits(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter the ammount of CPP or QPP benefits you received (box 20 of the T4A(P) slip): ");
                amount = k.nextDouble();
                break;
            }else if(in == "n") break;
            else System.out.println("Please input y or n");
        }
        return amount;
    
    }
    
    
    public double line11410(){
        String in;
        double amount = 0.00;
        while(true){
            System.out.print("Do you receive Disability benefits included on line 11400(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter the ammount of Disability benefits included on line 11400 (box 16 of the T4A(P) slip): ");
                amount = k.nextDouble();
                break;
            }else if(in == "n") break;
            else System.out.println("Please input y or n");
        }
        return amount;
    }
    
    
   public double line11500(){
        String in;
        double amount = 0.00;
        while(true){
            System.out.print("Do you receive any Other pensions and superannuation payments in 2019 tax year(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter the ammount shown in box 016 of your T4A slips and box 31 of your T3 slips: ");
                amount = k.nextDouble();
                break;
            }else if(in == "n") break;
            else System.out.println("Please input y or n");
        }
        return amount;
    }


}
