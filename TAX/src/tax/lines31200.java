package tax;

import java.util.Scanner;

public class lines31200 {
    public double line31200(){
        Scanner k = new Scanner(System.in);
        double maxEI = 860.22;
        double EI = 0;
       // TacoSauce ts = new TacoSauce();
        if(ts.self_employed == false){
            System.out.println("Please enter the amount in from box 18 and box 55 of all T4 slips: ");
            EI = k.nextDouble();
            if(EI > maxEI) EI = maxEI;
        }    
        return EI;
    }
}
