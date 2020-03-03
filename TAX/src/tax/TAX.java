
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
        
    public static void main(String[] args) throws IOException{
       Scanner k = new Scanner(System.in);
       //fist page infomation below
       //test code
       lines[] arr = new lines[142];  // new stands for create an array object
              
        //import a file of line number, initialize an array of structures
       Scanner file = new Scanner(new File ("lines.txt"));
       int numberoflines = Integer.parseInt(file.nextLine());
       for (int i = 0;i < numberoflines;i++){
           arr[i] = new lines(file.nextLine(),0);
       }
       file.close();      
       
    }
    
}
