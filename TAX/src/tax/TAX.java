
package tax;
import java.util.*;
import java.io.*;
 class lines {
       public String line;
       public int value;

   // constructor
   public lines(String line, int value) {
      this.line = line;
      this.value = value;
   }
       public String getLine() { return line; }
       public int getValue() { return value; }
       // setter

       public void setLine(String line) { this.line = line; }
       public void setValue(int value) { this.value = value; }
 }
public class TAX {
    static int line10100(){//Employment income
        return 0;
    }
     
        
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       //fist page infomation below
       //test code
       lines[] arr = new lines[100];  // new stands for create an array object
        arr[0] = new lines("Peter", 100); // new stands for create an employee object
        arr[1] = new lines("Mary", 90);
       System.out.println(arr[0].line);
       //import a file of line number, initialize an array of structures
       
       
       
    }
    
}
