/*
made by thomas^4
 */
package tax;

import java.util.Scanner;

/**
 *
 * @author Tvert
 */
public class TacoSauce {

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
}
