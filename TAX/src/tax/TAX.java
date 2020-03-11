
package tax;
import java.util.*;
import java.io.*;

 class lines {
       public String line;
       public double value;

   // constructor
   public lines(String line, double value) {
    // constructor
    public lines(String line, int value) {

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
    
    public static int getLineIndex(String line, lines[] arr){//get the index of the line given the line number
        for(int i = 0; i < arr.length; i++){
            if(line.equals(arr[i].getLine())){
                return i;
            }
        }
        return -1;
    }
    
    
    lines[] arr = new lines[142];  // new stands for create an array object
    
     Scanner k = new Scanner(System.in);//golbal scanner
    //variables
    String first_name, initial,last_name,street_name,po_box,city,Pro_tarr,postal_code,email;
    String prov_terr_endyear,prov_terr_curent,prov_terr_busniess,partner_first_name;
    int sin,birth_year,birth_month,birth_day,deceased_year,deceased_month,deceased_day,marital_status,apt_num = 0,rr ,street_num;
    int entry_month,entry_day,depart_month,depart_day,partner_sin,partner_netincome,partner_child_care_benefit,partner_child_care_repayment;
    boolean langE;//true means language is english
    boolean decased = false,self_employed = false,partner_self_employed = false, candian_res = true,partner;
    
    
    /* public void personal_info(){ //first page of infomation     
        System.out.print("Please enter your First name: ");
        first_name = k.nextLine();
        System.out.print("Please enter your the inital of you  name: ");
        initial = k.nextLine();
        System.out.print("Please enter your last name: ");
        last_name = k.nextLine();
        System.out.println("pick one of the folling options for mail");
        System.out.println("1. Mailing adress");
        System.out.println("2. PO box");
        int option;
        option = k.nextInt();
        if(option ==  1){
            System.out.print("Please enter your apartment number (if you don't live in an apartment enter 0): ");
            apt_num = k.nextInt();
            System.out.print("Plase enter your street number: ");
            street_num = k.nextInt();
            System.out.print("please enter your street's name: ");
            street_name = k.nextLine();
        }else{
            System.out.print("Please enter PO box: ");
            po_box = k.nextLine();
            System.out.print("enter rural rote number(if you don't have one enter 0): ");
            rr = k.nextInt();
        }
        System.out.print("Please enter your email: ");
        email = k.nextLine();
        System.out.print("please enter your SIN number: ");
        sin = k.nextInt();
        System.out.print("please enter the year you were born: ");
        birth_year = k.nextInt();
        System.out.print("please enter the month you were born: ");
        birth_month = k.nextInt();
        System.out.print("plase enter the day you were born: ");
        birth_day = k.nextInt();
        System.out.print("Is this return for a deceased person (y/n): ");
        String tempinput;
        tempinput = k.nextLine();
        if(tempinput == "Y"){
            decased = true;
            System.out.print("please enter the year of death: ");
            deceased_year = k.nextInt();
            System.out.print("please enter the month of death: ");
            deceased_month = k.nextInt();
            System.out.print("plase enter the day of death: ");
            deceased_day = k.nextInt();
        }
        System.out.println("Marital Status");
        System.out.println("1. Married ");
        System.out.println("2. Living common-law");
        System.out.println("3. Widowed");
        System.out.println("4. Divorced");
        System.out.println("5. Separated");
        System.out.println("6. single");
        System.out.print("please enter the number corrsponding to your Marital Status from the list above: ");
        marital_status = k.nextInt();
        if(marital_status <= 2){
            partner = true;
            String out_mar;
            if(marital_status == 1) out_mar = "spouse";
            else out_mar = "common-law partner";
            System.out.print("please enter your " + out_mar + " SIN number: ");
            partner_sin = k.nextInt();
            System.out.print("please enter your " + out_mar + " first name: ");
            partner_first_name = k.nextLine();
            System.out.print("please enter your " + out_mar + " net income: ");
            partner_netincome = k.nextInt();
            System.out.print("please enter your " + out_mar + "universal child care benefit(UCCB) on their tax return(line 11700): ");
            partner_child_care_benefit = k.nextInt();
            System.out.print("please enter your " + out_mar + "universal child care benefit(UCCB) repayment on their tax return (line 21300): ");
            partner_child_care_repayment = k.nextInt();
            System.out.print("was your " + out_mar + " self-employed in 2019 (y/n): ");
            String mar_input;
            mar_input = k.nextLine();
            if(mar_input == "y") partner_self_employed = true;
        }
        System.out.print("plase enter your province or tarritory of residence on December 31 2019:");
        prov_terr_endyear = k.nextLine();
        System.out.print("Please enter the province or tarritory you currently reside if diffent than mailing adress(if the same just hit enter): ");
        prov_terr_curent = k.nextLine();
        System.out.print("were you self-employed in 2019(y/n)? ");
        String emp;
        emp = k.nextLine();
        if(emp == "Y"){
            self_employed = true;
            System.out.print("Please enter the province or tarritory where your business had a permanet establishment: ");
            prov_terr_busniess = k.nextLine();
        }
        String entry;
        System.out.print("Did you became a resident of Canada for income tax purpoeses in 2019(y/n)? ");
        entry = k.nextLine();
        if(entry == "y"){
            System.out.print("please enter the month of entry: ");
            entry_month = k.nextInt();
            System.out.print("Plase enter the day of entry: ");
            entry_day = k.nextInt();
        }else{
            System.out.print("Did you cease being a resident of Canada for income tax purpoeses in 2019(y/n)? ");
            entry = k.nextLine();
            if(entry == "y"){
                System.out.print("please enter the month of departure: ");
                depart_month = k.nextInt();
                System.out.print("please enter the day of departure: ");
                depart_day = k.nextInt();               
            }
        }
    
     
     
     }
*/
     //line functions
    public double line10100(){//Employment income
        double income = 0.00;
        System.out.print("please enter employment income(box 14 of all t4 slips): ");
        income =  k.nextDouble();
        return income;
    }    
        
   
    public static void main(String[] args) throws IOException{
       
       //fist page infomation below
       //test code
       
              
        //import a file of line number, initialize an array of structures
       Scanner file = new Scanner(new File ("lines.txt"));
       int numberoflines = Integer.parseInt(file.nextLine());
       for (int i = 0;i < numberoflines;i++){
           arr[i] = new lines(file.nextLine(),0);
       }
       file.close();
       TacoSauce ts = new TacoSauce();
       ts.personal_info(); // first page
       //second page
            //someone please do this
        
            
        //line functions
       
        

       
    }
    
}
