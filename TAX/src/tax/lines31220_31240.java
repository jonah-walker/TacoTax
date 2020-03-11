package tax;

import java.util.Scanner;

public class lines31220_31240 {
    public double lines31220_31240(){
        TAX t = new TAX();
        Scanner k = new Scanner(System.in);
        String in;
        System.out.print("You completed at least 200 hours of eligible volunteer firefighting services or eligible search and rescue volunteer services in the year(y/n)? ");
        in = k.next();
        if(in == "y"){
            while(true){
                System.out.print("Would you like to clim volunteer Firefighter(f) or search and rescue(s)? ");
                in = k.next();
                if (in == "f") {
                    t.arr[t.getLineIndex("31240", t.arr)].value = line31240(0);
                    return 3000;
                } else if (in == "s") {
                    t.arr[t.getLineIndex("31240", t.arr)].value = line31240(3000);
                    return 0;
                } else {
                    System.out.println("Please input s or f");
                }
            }
        }else{
            t.arr[t.getLineIndex("31240",t.arr)].value = line31240(0);
            return 0;
        }
        
    }
    public double line31240(double a){
        return a;
    }
}
