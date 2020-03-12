
package tax;
import java.util.Scanner;
public class line31300 {
    public double line31300(){
         Scanner k = new Scanner(System.in);
          String in;
          double expences;
          double amount = 16255;
          while(true){
            System.out.print("Did you adopted a child in 2019(y/n)? ");
            in = k.next();
            if (in == "y") {
                System.out.println("eiagiable adoption expences ");
                System.out.println("fees paid to an adoption agency licensed by a provincial or territorial government");
                System.out.println("court costs and legal and administrative expenses related to an adoption order for the child");
                System.out.println("reasonable and necessary travel and living expenses of the child and the adoptive parents");
                System.out.println("document translation fees");
                System.out.println("mandatory fees paid to a foreign institution");
                System.out.println("any other reasonable expenses related to the adoption required by a provincial or territorial government or an adoption agency licensed by a provincial or territorial government");
                System.out.print("please input the amount of adoption expences incurred in 2019 ");
                expences = k.nextDouble();
                if(expences >= amount) return amount;
                else return expences;
            } else if (in == "n") {
                return 0;
            } else {
                System.out.println("Please enter y or n");
            }
        }
    }
}
