
package tax;
import java.util.*;
import java.io.*;
import tax.TacoSauce.*;

 class lines {
       public String line;
       public double value;

   // constructor
    public lines(String line, double value) {
      this.line = line;
      this.value = value;
    }
       public String getLine() { return line; }
       public double getValue() { return value; }
       // setter

       public void setLine(String line) { this.line = line; }
       public void setValue(double value) { this.value = value; }
 }







public class TAX {
    
    
    
     Scanner k = new Scanner(System.in);//golbal scanner
    //variables
    String first_name, initial,last_name,street_name,po_box,city,Pro_tarr,postal_code,email;
    String prov_terr_endyear,prov_terr_curent,prov_terr_busniess,partner_first_name;
    int sin,birth_year,birth_month,birth_day,deceased_year,deceased_month,deceased_day,marital_status,apt_num = 0,rr ,street_num;
    int entry_month,entry_day,depart_month,depart_day,partner_sin,partner_netincome,partner_child_care_benefit,partner_child_care_repayment;
    boolean langE;//true means language is english
    boolean decased = false,self_employed = false,partner_self_employed = false, candian_res = true,partner;
    
    
   
     //line functions

        
   
    public static void main(String[] args) throws IOException{
       
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
       TacoSauce ts = new TacoSauce();
       ts.personal_info(); // first page
       arr[getLineIndex("10100",arr)].value = ts.line10100();
       //second page
            //someone please do this
        
            
        //line functions
       
        

       
    }
    
}
