
package tax;

import java.util.Scanner;

public class line31900 {
    public double line31900(){
        Scanner k = new Scanner(System.in);
        String in;
        double amount;
        while(true){
            System.out.println("If you received a loan under the Canada Student Loans Act, the Canada Student Financial Assistance Act, the Apprentice Loans Act, or similar provincial or territorial government laws for post-secondary education");
            System.out.print("And you would like to claim the intrest agencied the taxs you owe for the 2019 TAX year(y/n)");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter the amount you would like to claim. Due note you can claim any prevously unclaimed interest on your student loan from the past 5 years: ");
                amount = k.nextDouble();
                return amount;
            }else if(in == "n") return 0;
            else System.out.println("Please enter y or n");
        }
    }
}
