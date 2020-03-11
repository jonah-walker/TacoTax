
package tax;
import java.util.Scanner;

public class line31260 {
    public double line31260(){
        TAX t = new TAX();
        Scanner k = new Scanner(System.in);
        double amount = 1222;
        double income = t.arr[t.getLineIndex("10100",t.arr)].value + t.arr[t.getLineIndex("10400",t.arr)].value;
        if(income >= amount) return amount;
        else return income;
    }
}
