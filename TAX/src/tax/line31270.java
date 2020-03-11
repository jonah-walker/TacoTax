
package tax;
import java.util.Scanner;
public class line31270 {
    public double line31270(){
          Scanner k = new Scanner(System.in);
          String in;
          while(true){
            System.out.print("Did you or your spouse or common-law partner acquired a home and you did not live in another home owned by you or your spouse or common-law partner in the year of acquisition or in any of the four preceding years(y/n? ");
            in = k.next();
            if(in == "Y"){
                return 5000;
            }else if(in == "n"){
                return 0;
            }else System.out.println("Please enter y or n");
          }
    }
}
