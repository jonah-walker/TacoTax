/*
made by thomas^4
 */
package tax;

import java.io.File;
import java.util.Scanner;
import tax.lines;



public class TacoSauce {
    
    public int getLineIndex(String line, lines[] arr){//get the index of the line given the line number
        for(int i = 0; i < arr.length; i++){
            if(line.equals(arr[i].getLine())){
                return i;
            }
        }
        return -1;
    }
    
    Scanner k = new Scanner(System.in);
    double line51090;
    String first_name, initial,last_name,street_name,po_box,city,Pro_tarr,postal_code,email;
    String prov_terr_endyear,prov_terr_current,prov_terr_business,partner_first_name;
    int sin,birth_year,birth_month,birth_day,deceased_year,deceased_month,deceased_day,marital_status,apt_num = 0,rr ,street_num;
    int entry_month,entry_day,depart_month,depart_day,partner_sin,partner_netincome,partner_child_care_benefit,partner_child_care_repayment;
    boolean langE;//true means language is english
    boolean decased = false,self_employed = false,partner_self_employed = false, candian_res = true,partner;
   
   public void personal_info(){ //first page of infomation   
        Scanner k = new Scanner(System.in);
        System.out.print("Please enter your First name: ");
        first_name = k.nextLine();
        System.out.print("Please enter your the initial of your middle name: ");
        initial = k.nextLine();
        System.out.print("Please enter your last name: ");
        last_name = k.nextLine();
        System.out.println("pick one of the following options for mail");
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
            System.out.print("enter rural route number(if you don't have one enter 0): ");
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
        System.out.println("6. Single");
        System.out.print("please enter the number corresponding to your Marital Status from the list above: ");
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
        System.out.print("please enter your province or territory of residence on December 31 2019:");
        prov_terr_endyear = k.nextLine();
        System.out.print("Please enter the province or territory you currently reside if diffent than mailing adress(if the same just hit enter): ");
        prov_terr_current = k.nextLine();
        System.out.print("were you self-employed in 2019(y/n)? ");
        String emp;
        emp = k.nextLine();
        if(emp == "Y"){
            self_employed = true;
            System.out.print("Please enter the province or tarritory where your business had a permanet establishment: ");
            prov_terr_business = k.nextLine();
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
   
    public boolean YorN (){
        String ur;
        System.out.println("Please enter (Y/N) for your response: ");
        ur = k.nextLine();
        if (ur.equals("Y")) return true;
        return false;
    }
   
   public double line10100(){//Employment income
        double income = 0.00;
        System.out.print("please enter employment income(box 14 of all t4 slips): ");
        income =  k.nextDouble();
        return income;
    }   
   
   //30000
    double sum1to24_for30000s;

    public double line30000() {//Employment income
        return 12069;
    }

    public double line30100(lines arr[]) {//Employment income
        double amount;//amount to put at this line
        double n = arr[getLineIndex("23600", arr)].value;//money at 23600
        if (n <= 37790) {
            amount = 7494;
        } else if (n >= 87750) {
            amount = 0;
        } else {
            amount = 7494 - (n - 37790) * 0.15;
            if (amount < 0) {
                amount = 0;
            }
        }
        return amount;
    }
    
    public double line30300() {
        String inputu;
        //month and day of 55220
        int month;
        int day;
        double localline51090 = 0;
        //amount return
        double amount = 0;
        if (marital_status <= 2) {
            System.out.println("Did your marital status change to other than married or common-law in 2019? (Y/N)");
            inputu = k.nextLine();
            if (inputu.equals("Y")) {
                System.out.println("Date of change");
                System.out.println("Month(1-12):");
                month = k.nextInt();
                System.out.println("day(1-31):");
                day = k.nextInt();
            } else {
                return 0.00;
            }
        }
        amount += 12069;
        System.out.println("Are entitled to the Canada caregiver amount for your spouse or common-law partner? (Y/N)");
        inputu = k.nextLine();
        if (inputu.equals("Y")) {
            localline51090 = 2230;
        }
        line51090 = localline51090;
        amount = amount + localline51090 - partner_netincome;
        if (amount < 0) {
            return 0.00;
        }
        return amount;
    }

    public double line30499() {
        System.out.println("Canada caregiver amount for infirm children under 18 years of age\n"
                + "Enter the number of children for whom you are claiming this amount:");
        double input;
        input = k.nextInt();
        return input;
    }

    public double line30500(lines arr[]) {
        double n = arr[getLineIndex("30499", arr)].value;//money at 30499
        return n * 2230;
    }

    public double line33099() {
        System.out.println("What is Medical expenses for self, spouse or common-law partner, and your dependent children born in 2002 or later");
        double value;
        value = k.nextInt();
        return value;
    }
    
    public double line31200(){
        double maxEI = 860.22;
        double EI = 0;
        if(self_employed == false){
            System.out.println("Please enter the amount in from box 18 and box 55 of all T4 slips: ");
            EI = k.nextDouble();
            if(EI > maxEI) EI = maxEI;
        }    
        return EI;
    }
    
    public double line31220(lines arr[]){
        String in;
        System.out.print("You completed at least 200 hours of eligible volunteer firefighting services or eligible search and rescue volunteer services in the year(y/n)? ");
        in = k.next();
        if(in == "y"){
            while(true){
                System.out.print("Would you like to clim volunteer Firefighter(f) or search and rescue(s)? ");
                in = k.next();
                if (in == "f") {
                    arr[getLineIndex("31240", arr)].value = line31240(0);
                    return 3000;
                } else if (in == "s") {
                    arr[getLineIndex("31240", arr)].value = line31240(3000);
                    return 0;
                } else {
                    System.out.println("Please input s or f");
                }
            }
        }else{
            arr[getLineIndex("31240",arr)].value = line31240(0);
            return 0;
        }
        
    }
     
    public double line31240(double a){
        return a;
    }
    
    public double line31260(lines arr[]){        
        double amount = 1222;
        double income = arr[getLineIndex("10100",arr)].value + arr[getLineIndex("10400",arr)].value;
        if(income >= amount) return amount;
        else return income;
    }
    
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
    
    public double line31900(){
        Scanner k = new Scanner(System.in);
        String in;
        double amount;
        while(true){
            System.out.println("If you received a loan under the Canada Student Loans Act, the Canada Student Financial Assistance Act, the Apprentice Loans Act, or similar provincial or territorial government laws for post-secondary education");
            System.out.print("And you would like to claim the intrest agencied the taxs you owe for the 2019 TAX year(y/n)");
            in = k.next();
            if(in == "y"){
                System.out.print("Please enter the amount you would like to claim. Due note you can claim any prevously unclaimed interest on your student loan from the past 5 years: ");
                amount = k.nextDouble();
                return amount;
            }else if(in == "n") return 0;
            else System.out.println("Please enter y or n");
        }
    }
    
    public double line31300(){
         Scanner k = new Scanner(System.in);
          String in;
          double expences;
          double amount = 16255;
          while(true){
            System.out.print("Did you adopt a child in 2019(y/n)? ");
            in = k.next();
            if (in == "y") {
                System.out.println("eligable adoption expenses ");
                System.out.println("fees paid to an adoption agency licensed by a provincial or territorial government");
                System.out.println("court costs and legal and administrative expenses related to an adoption order for the child");
                System.out.println("reasonable and necessary travel and living expenses of the child and the adoptive parents");
                System.out.println("document translation fees");
                System.out.println("mandatory fees paid to a foreign institution");
                System.out.println("any other reasonable expenses related to the adoption required by a provincial or territorial government or an adoption agency licensed by a provincial or territorial government");
                System.out.print("please input the amount of adoption expenses incurred in 2019 ");
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
    
    public double line33200(lines arr[]) {
        double n = 0.03 * arr[getLineIndex("23600", arr)].value;//money at 23600 * 0.03
        double L26 = 0;
        double L27;
        if (n > 2352) {
            L26 = n;
        } else {
            L26 = 2352.0;
        }

        double L25 = arr[getLineIndex("33099", arr)].value;//money at 33099
        L27 = L25 - L26;
        if (L27 < 0) {
            L27 = 0;
        }

        return L27 + arr[getLineIndex("31099", arr)].value;
    }

    public double line33500(lines arr[]) {
        return sum1to24_for30000s + arr[getLineIndex("32000", arr)].value;
    }

    public double line33800(lines arr[]) {
        return arr[getLineIndex("33500", arr)].value * 1.15;
    }

    public double line35000(lines arr[]) {
        return arr[getLineIndex("33800", arr)].value + arr[getLineIndex("34900", arr)].value;
    }


}
