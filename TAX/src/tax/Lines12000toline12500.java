package tax;
import java.util.Scanner;
public class Lines12000toline12500 {
    Scanner k = new Scanner(System.in);
    public double line12000(){
        String in;
        double amount = 0.0;
        while(true){
            System.out.print("Did you recive dividends  from taxable Canadian corporation(s)(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.println("please comeplet the worksheet for the linked below");
                System.out.println("worksheet(page 1 part 1): https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/5000-d1/5000-d1-19e.pdf");
                System.out.println("Info on line 12000: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12000-taxable-amount-dividends-eligible-other-than-eligible-taxable-canadian-corporations.html");
                System.out.print("enter the calulated amount: ");
                amount = k.nextDouble();
                       
                break;
            }else if(in == "n") break;
            else System.out.println("Please enter y or n");
        }
        return amount;
    }
    public double line12010(){ //TODO: set up this function to work when called.
        String in;
        double amount = 0.00;
        while (true) {
            System.out.println("Did you recive any other than eligible dividends(y/n): ");
            in = k.next();
            if (in == "y") {
                System.out.println("please comeplet the worksheet for the linked below");
                System.out.println("worksheet(page 1 part 1): https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/5000-d1/5000-d1-19e.pdf");
                System.out.println("Info on line 12000: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12000-taxable-amount-dividends-eligible-other-than-eligible-taxable-canadian-corporations.html");
                System.out.print("please enter the Taxable amount of dividends other than eligible dividends(line12010): ");
                amount = k.nextDouble();
            } else if (in == "n") {
                break;
            } else {
                System.out.println("Please enter y or n");
            }
        } 
        return amount;
    }
    public double line12100(){
        String in;
        double amount = 0.0;
        while(true){
            System.out.print("Did you recive any Interest and other investment income(y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.println("please comeplet the worksheet for the linked below");
                System.out.println("worksheet(page 1 part 2): https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/5000-d1/5000-d1-19e.pdf");
                System.out.println("Info on line 12000: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-12100-interest-other-investment-income.html");
                System.out.print("enter the calulated amount: ");
                amount = k.nextDouble();               
                break;
            }else if(in == "n") break;
            else System.out.println("Please enter y or n");
        }
        return amount;
    }
    
    public double line12200(){
        String in;
        double amount = 0.0;
        while(true){
            System.out.print("were you a limited or non-active partners for a busniness (y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter net partnership income or loss: ");
                amount = k.nextDouble();               
                break;
            }else if(in == "n") break;
            else System.out.println("Please enter y or n");
        }
        return amount;
    }
    
    public double line12500(){
        String in;
        double amount = 0.0;
        while(true){
            System.out.print("Did you recive any Registered disability savings plan income (y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter Registered disability savings plan income (box 131 of the T4A slip): ");
                amount = k.nextDouble();               
                break;
            }else if(in == "n") break;
            else System.out.println("Please enter y or n");
        }
        return amount;
    }
    
    public double line12599andline12600(){
        String in;
        double amount = 0.0;
        double amount2 = 0.0;
        while(true){
            System.out.print("Did you recive any rental income (y/n): ");
            in = k.next();
            if(in == "y"){
                System.out.println("Please complet the workshett below:");
                System.out.println("worksheet: https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/t776/t776-fill-19e.pdf");
                System.out.print("please enter total gross rental income(8299 of the worksheet): ");
                amount = k.nextDouble();       
                System.out.print("please enter rental net income or loss (9946 of the worksheet): ");
                amount2 = k.nextDouble();
                arr[getLineIndex("12600", arr)].value = amount2;
                break;
            }else if(in == "n") break;
            else System.out.println("Please enter y or n");
        }
        return amount;
    }
   
    
}
