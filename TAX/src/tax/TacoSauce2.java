
package tax;

import java.io.File;
import java.util.Scanner;
import tax.lines;

public class TacoSauce2 {
    
    //General Utility Functions: these functions can be called in other methods for utility functions
    public int getLineIndex(String line, lines[] arr){//get the index of the line given the line number
        for(int i = 0; i < arr.length; i++){
            if(line.equals(arr[i].getLine())){
                return i;
            }
        }
        System.out.println("Error: "+line+" was not found.");
        return -1;
    } //get the index of a line insude the line array
    
    public boolean YorN (){
        String ur;
        System.out.println("Please enter (Y/N) for your response: ");
        ur = k.nextLine();
        if (ur.equals("Y")) return true;
        return false;
    } //ask user yes or no question and return a boolean value
    
    
    //Globle Variables
    //General variables
    Scanner k = new Scanner(System.in);
    
    //Basic Personal Info Variables
    String first_name, initial,last_name,street_name,po_box,city,Pro_tarr,postal_code,email;
    String prov_terr_endyear,prov_terr_current,prov_terr_business,partner_first_name;
    int sin,birth_year,birth_month,birth_day,deceased_year,deceased_month,deceased_day,marital_status,apt_num = 0,rr ,street_num;
    int entry_month,entry_day,depart_month,depart_day,partner_sin,partner_netincome,partner_child_care_benefit,partner_child_care_repayment;
    boolean langE;//true means language is english
    boolean decased = false,self_employed = false,partner_self_employed = false, candian_res = true,partner;
   
    //variables acquired from users that will need to be filled later
    //the 10000's lines
    double Employment_Income; //done
    double Tax_exempt_income_emergency_volunteers; //done
    double Commision; //done
    double Wage_Loss_Replacement_Contributions;//done
    double Other_Employment_Income; //done
    double Old_Age_Security_Pension; //done
    double CPP_or_QPP_Benefits; //done
    double Disability_Benefits;  //done
    double Other_pensions_and_superannuation; //done
    double Elected_splitpension_amount; //done
    double UCCB;//done,but needs special attention for this one. Look up line 17000 when organizing.
    double UCCB_To_Dependent;//done,but needs special attention for this one. Look up line 17001 when organizing.
    double EI_and_other_Benefits;//done
    double EI_maternity_and_parental_benefits;//done
    double All_Taxable_Divident_Canadian_Corportations;//done
    double Other_Than_Eligible_Taxable_Divident_Canadian_Corportations;//done
    double Interest_and_other_investment_income;//done
    double Net_partnership_income;//done
    double Registered_disability_savings_plan_income;//done
    double Gross_Rental_Income;//done
    double Net_Rental_Income;//done
    double Taxable_Capital_Gains;//done
    double Total_Support_Payment_Received;//done
    double Taxable_Support_Payment_Received;//done
    double RRSP_Income;//done
    double Other_Income;//done
    String Other_Income_Specify;//done
    double Other_Taxables;//done
    double gross_business_income=0, net_business_income, gross_professional_income, net_professional_income,gross_commission_income,net_commission_income; //self-employment income
    double gross_farming_income, net_farming_income, gross_fishing_income, net_fishing_income;    //self-employment income
    double workers_compensation_benefits, social_assistance,net_federal_supplements ;
    //the 20000's variables
    double pension_adjustment, registered_pension_plan_deduction, RRSP_deduction, PRPP_employer_contributions, deduction_for_elected_split_pension, annual_union_or_professional_dues;
    double universal_child_care_benefit_repayment, child_care_expenses, disability_supports_deduction , moving_expenses;
    double gross_business_investment_loss, allowable_deduction_business_investment_loss, total_support_payments, allowable_deduction_support_payments;
    double carrying_charges_and_interest_expenses, deduction_CPP_or_QPP_contributions_self_employment, deduction_for_CPP_or_QPP_enhanced_contributions_employment_income;
    double exploration_and_development_expenses, other_employment_expenses, clergy_residence_deduction, other_deductions;
 
   //User Input Functions
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
   }//ask for basic personal information
   
   public void F_Employment_Income(){//ask for employment income
        System.out.print("please enter employment income(box 14 of all t4 slips): ");
        Employment_Income =  k.nextDouble();
   }
   
   public void F_Tax_exempt_income_emergency_volunteers(){//ask for Tax_exempt_income_emergency_volunteers
        System.out.println("please enter your exempt income for emergency volunteer services(box 87 of all t4 slips): ");
        Tax_exempt_income_emergency_volunteers =  k.nextDouble();
    }
   
   public void F_Commision(){//asks Commision from the user
        System.out.println("please enter your commision recieved as an employee(box 42 of all T4 slips): ");
        Commision =  k.nextDouble();
   }
   
   public void F_Wage_Loss_Replacement_Contributions(){
        System.out.println("Please report your total contributions to your wage-loss replacement plan shown in the supporting documents from your employer or insurance company.: ");
        Wage_Loss_Replacement_Contributions =  k.nextDouble();
   }
   
   public void F_Other_Employment_Income(){
        System.out.println("please enter the employment income not reported on a T4 slip: ");
        Other_Employment_Income =  k.nextDouble();
   }
   
   public void F_Old_Age_Security_Pension(){
        System.out.print("Please enter your Old age security pension amount (box 18 of the T4A(OAS) slip): ");
        Old_Age_Security_Pension = k.nextDouble();;
   }
   
   public  void F_CPP_or_QPP_Benefits(){
       System.out.print("Please enter the ammount of CPP or QPP benefits you received (box 20 of the T4A(P) slip): ");
       CPP_or_QPP_Benefits = k.nextDouble();
   }
   
   public void F_Disability_Benefits(){
        double amount = 0.00;
        System.out.print("Please enter the ammount of Disability benefits included on line 11400 (box 16 of the T4A(P) slip): ");
        amount = k.nextDouble();
        Disability_Benefits = amount;
   }
   
   public void F_Other_pensions_and_superannuation(){
        double amount = 0.00;
        System.out.print("If you received any Other pensions and superannuation payments in 2019 tax year, please enter the ammount shown in box 016 of your T4A slips and box 31 of your T3 slips: ");
        amount = k.nextDouble();
        Other_pensions_and_superannuation = amount;
   }
   
   public void F_Elected_splitpension_amount(){
       System.out.println("Please enter the elected split-pension amount. You will have to complete form T1032 if you have not done so, which could be found in the link below: ");
       System.out.println("https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/t1032/t1032-fill-19e.pdf");
       System.out.println("please enter the amount in line G of the T1032 form: ");
       Elected_splitpension_amount = k.nextDouble();
   }
   
   public void F_UCCB(){
       System.out.println("For Universal Child Care Benefit, please enter box 10 of the RC62 slip: ");
       UCCB = k.nextDouble();
   }
   
   public void F_UCCB_To_Dependent(){
       UCCB_To_Dependent = 0.0;
   }
   
   public void F_EI_and_other_Benefits(){
       System.out.println("please enter the amount for Employment Insurance and other benefits. This could be found on box 14 of the T4E slip");
       EI_and_other_Benefits = k.nextDouble();
   }
   
   public void F_EI_maternity_and_parental_benefits(){
        double amount;
        double a2;
        System.out.println("Report the amount of the employment insurance maternity and parental benefits you received in 2019.");
        System.out.println("This amount can be found on the letter you received from Employment and Social Development Canada (ESDC).");
        System.out.println("If such situation do not apply to you, please input '0' :");
        amount = k.nextDouble();
        System.out.println("Please input the amount of provincial parental insurance plan (PPIP) maternity and parental benefits (box 36 of your T4E slip)");
        a2 = k.nextDouble();
        amount += a2;
       EI_maternity_and_parental_benefits = amount;
   }
   
   public void F_All_Taxable_Divident_Canadian_Corportations(){
       System.out.println("Please enter line 7 on the T1-2019 worksheet");
       All_Taxable_Divident_Canadian_Corportations = k.nextDouble();
   }
          
   public void F_Other_Than_Eligible_Taxable_Divident_Canadian_Corportations(){
       System.out.println("Please enter line 3 on the T1-2019 worksheet");
       Other_Than_Eligible_Taxable_Divident_Canadian_Corportations = k.nextDouble();
   }
   
   public void F_Interest_and_other_investment_income(){
       System.out.println("Please enter line 11 on the T1-2019 worksheet: ");
       Interest_and_other_investment_income = k.nextDouble();
   }
   
   public void F_Net_partnership_income(){
       System.out.print("Please enter net partnership income or loss: ");
       Net_partnership_income = k.nextDouble();               
   }
   
   public void F_Registered_disability_savings_plan_income(){
       System.out.print("Please enter Registered disability savings plan income (box 131 of the T4A slip): ");
       Registered_disability_savings_plan_income = k.nextDouble();       
   }
   
   public void F_Gross_Rental_Income(){
       System.out.print("Please enter your gross rental income: ");
       Gross_Rental_Income = k.nextDouble();  
   }
   
   public void F_Net_Rental_Income(){
       System.out.print("Please enter your net rental income: ");
       Net_Rental_Income = k.nextDouble();  
   }

   public void F_Taxable_Capital_Gains(){
       System.out.println("If you have a Taxable capital gain (positive number on line 19900 in schedule 3), input that number. Otherwise please input 0.");
       Taxable_Capital_Gains = k.nextDouble();
   }
   
   public void F_Total_Support_Payment_Received (){
       System.out.println("Please input the total support payment recieved.");
       System.out.println("For more information, please visit: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/lines-12799-12800-support-payments-received.html");
       System.out.println("Total support payment recieved: ");
       Total_Support_Payment_Received = k.nextDouble();
   }
   
   public void F_Taxable_Support_Payment_Received(){
       System.out.println("Please input the taxable support payment recieved.");
       System.out.println("For more information, please visit: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/lines-12799-12800-support-payments-received.html");
       System.out.println("Taxable support payment recieved: ");
       Taxable_Support_Payment_Received = k.nextDouble();
   }
   
   public void F_RRSP_Income(){
       System.out.println("For your RRSP income, enter the total of amounts shown in boxes 16, 18, 28, and 34 of your T4RSP slips.");
       System.out.println("Also include the amounts from boxes 20, 22, and 26, unless your spouse or common-law partner made a contribution to your RRSP in 2016, 2017, or 2018.");
       System.out.println("If this is the case, see https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/rrsps-related-plans/making-withdrawals/withdrawing-spousal-common-law-partner-rrsps.html");
       System.out.print("Enter the amount here: ");
       RRSP_Income = k.nextDouble();
   }
   
   public void F_Other_Income(){
       System.out.println("Please input other income not reported elsewhere here.");
       System.out.println("For more information, please visit: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-13000-other-income.html");
       System.out.print("Enter the amount here: ");
       Other_Income = k.nextDouble();
       System.out.print("Please Specify the income: ");
       Other_Income_Specify = k.nextLine();
   }
   
   public void F_Other_Taxables(){
       System.out.println("Please input Taxable scholarship, fellowships, bursaries, and artists' project grants.");
       System.out.print("Enter the amount here: ");
       Other_Taxables = k.nextDouble();
   }
   
   public void F_gross_business_income(){
       System.out.println("For your self-employment, what is your gross business income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       gross_business_income = k.nextDouble();
   }
   
   public void F_net_business_income(){
       System.out.println("For your self-employment, what is your net business income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       net_business_income = k.nextDouble();
   }
   
   public void F_gross_professional_income(){
       System.out.println("For your self-employment, what is your gross professional income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       gross_professional_income = k.nextDouble();
   }
   
   public void F_net_professional_income(){
       System.out.println("For your self-employment, what is your net professional income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       net_professional_income = k.nextDouble();
   }
   
   public void F_gross_commission_income(){
       System.out.println("For your self-employment, what is your gross commission income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       gross_commission_income = k.nextDouble();
   }
   
   public void F_net_commission_income(){
       System.out.println("For your self-employment, what is your net commission income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       net_commission_income = k.nextDouble();
   }
   
   public void F_gross_farming_income(){
       System.out.println("For your self-employment, what is your gross farming income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       gross_farming_income = k.nextDouble();
   }
   
   public void F_net_farming_income(){
       System.out.println("For your self-employment, what is your net farming income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       net_farming_income = k.nextDouble();
   }
   
   public void F_gross_fishing_income(){
       System.out.println("For your self-employment, what is your gross fishing income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       gross_fishing_income = k.nextDouble();
   }
   
   public void F_net_fishing_income(){
       System.out.println("For your self-employment, what is your net fishing income?");
       System.out.println("For more information about self-employment income, please refer: https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/self-employment-income-lines-13499-14299-gross-income-lines-13500-14300-net-income.html");
       System.out.print("Enter the amount here: ");
       net_fishing_income = k.nextDouble();
   }
   
   
   
   //Variables needed for Line Computation Functions
    double sum1to24_for30000s;
   
   //Line Computation Functions
   public double line10100()//Employment income
   { 
        return Employment_Income;
    }   
   
   public double line10105()//Tax_exempt_income_emergency_volunteers
   {
        return Tax_exempt_income_emergency_volunteers;
    }
   
   public double line10120()//Commision
   {
        return Commision;
    }
   
   public double line10130()//Wage-loss replacement contributions
   {
        return Wage_Loss_Replacement_Contributions;
   }
   
   public double line10400()//Other employment income
   {
        return Other_Employment_Income;
    }
   
   public double line11300()//Old age security pension
   {
       return Old_Age_Security_Pension;
   }
   
   public double line11400()//CPP or QPP benefits
   {
       return CPP_or_QPP_Benefits;
   }
   
   public double line11410()//Disability benefits
   {
       return Disability_Benefits;
   }
   
   public double line11500()//Other pensions and superannuation
   {
       return Other_pensions_and_superannuation;
   }
   
   public double line11600()//Elected split-pension amount
   {
       return Elected_splitpension_amount;
   }
   
   public double line11700()//UCCB
   {
       return UCCB;
   }
   
   public double line11701()//UCCB amount designated to a dependant
   {
       return UCCB_To_Dependent;
   }
   
   public double line11900()//Employment insurance and other benefits
   {
       return EI_and_other_Benefits;
   }
   
   public double line11905()//EI_maternity and parental benefits
   {
       return EI_maternity_and_parental_benefits;
   }
   
   public double line12000() //Taxable amount of dividends from taxable Canadian corporations
   {
       return All_Taxable_Divident_Canadian_Corportations;
   }
   
   public double line12010() //Taxable amount of dividends other than eligible dividends from taxable Canadian corporations
   {
        return Other_Than_Eligible_Taxable_Divident_Canadian_Corportations;
   }
   
   public double line12100() //Interest and other investment income
   {
       return Interest_and_other_investment_income;
   }
   
   public double line12200() //Net partnership income: limited or non-active partners only
   {
       return Net_partnership_income;
   }
   
   public double line12500() //Registered disability savings plan income
   {
       return Registered_disability_savings_plan_income;
   }
   
   public double line12599() //Gross Rental income
   {
       return Gross_Rental_Income;
   }
   
   public double line12600() //Net Rental income
   {
       return Net_Rental_Income;
   }
   
   public double line12700() //Taxable capital gains
   {
       return Taxable_Capital_Gains;
   }
   
   public double line12799() //Total Support payments received
   {
       return Total_Support_Payment_Received;
   }
   
   public double line12800() //Taxable Support payments received
   {
       return Taxable_Support_Payment_Received;
   }
   
   public double line12900() //RRSP income
   {
       return RRSP_Income;
   }
   
   public double line13000() //Other income
   {
       return Other_Income;
   }
   
   public double line13010() //Taxable scholarship, fellowships, bursaries, and artists' project grants
   {
       return Other_Taxables;
   }
   
   public double line13499(){
        return gross_business_income;
    }
   
    public double line13500(){
        return net_business_income;
    }
    
    public double line13699(){
        return gross_professional_income;
    }
    
    public double line13700(){
        return net_professional_income;
    }
    
    public double line13899(){
        return gross_commission_income;
    }
    
    public double line13900(){
        return net_commission_income;
    }
    
    public double line14099(){
        return gross_farming_income;
    }
    
    public double line14100(){
        return net_farming_income;
    }
    
    public double line14299(){
        return gross_fishing_income;
    }
    
    public double line14300(){
        return net_fishing_income;
    }
    
    public double line14400(){
        return workers_compensation_benefits;          
    }
    
    public double line14500(){
        return social_assistance; 
    }
    
    public double line14600(){
       return net_federal_supplements;
    }
    
    public double line14700(lines arr[]){     
        return arr[getLineIndex("14400", arr)].value + arr[getLineIndex("14500", arr)].value + arr[getLineIndex("14600", arr)].value;
    }
    
    public double line15000(lines arr[]){
        double sum = arr[getLineIndex("10100", arr)].value + arr[getLineIndex("10400", arr)].value + arr[getLineIndex("11300", arr)].value + arr[getLineIndex("11400", arr)].value;
        sum += arr[getLineIndex("11500", arr)].value + arr[getLineIndex("11600", arr)].value + arr[getLineIndex("11700", arr)].value + arr[getLineIndex("11900", arr)].value + arr[getLineIndex("12000", arr)].value;
        sum += arr[getLineIndex("12100", arr)].value + arr[getLineIndex("12200", arr)].value + arr[getLineIndex("12500", arr)].value + arr[getLineIndex("12600", arr)].value + arr[getLineIndex("12700", arr)].value;
        sum += arr[getLineIndex("12800", arr)].value + arr[getLineIndex("12900", arr)].value + arr[getLineIndex("13000", arr)].value + arr[getLineIndex("13010", arr)].value + arr[getLineIndex("13500", arr)].value;
        sum += arr[getLineIndex("13700", arr)].value + arr[getLineIndex("13900", arr)].value + arr[getLineIndex("14100", arr)].value + arr[getLineIndex("14300", arr)].value + arr[getLineIndex("14700", arr)].value;
        return sum;
    }
   
    public double line20600(){
        return pension_adjustment;
    }
    
    public double line20700(){
        return registered_pension_plan_deduction;
    }
    
    public double line20800(){
       return RRSP_deduction;
    }
    
    public double line20810(){
        return PRPP_employer_contributions;
    }
    
    public double line21000(){
        return deduction_for_elected_split_pension;
    }
    
    public double line21200(){
        return annual_union_or_professional_dues;
    }
    
    public double line21300(){
        return universal_child_care_benefit_repayment;
    }
    
    public double line21400(){
        return child_care_expenses;
    }
    
    public double line21500(){
        return disability_supports_deduction;
    }
    
    public double line21699(){
        return gross_business_investment_loss;
    }
    
    public double line21700(){
        return allowable_deduction_business_investment_loss;
    }
    
    public double line21900(){
        return moving_expenses;
    }
    
    public double line21999(){
        return total_support_payments;
    }
    
    public double line22000(){
        return allowable_deduction_support_payments;
    }
    
    public double line22100(){
        return carrying_charges_and_interest_expenses;
    }
    
    public double line22200(){
        return deduction_CPP_or_QPP_contributions_self_employment;
    }
    
    public double line22215(){
        return deduction_for_CPP_or_QPP_enhanced_contributions_employment_income;
    }
    
    public double line22400(){
        return exploration_and_development_expenses;
    }
    
    public double line22900(){
        return other_employment_expenses;
    }
    
    public double line23100(){
        return clergy_residence_deduction;
    }
    
    public double line23200(){
        return other_deductions;
    }
    
    public double line23300(lines arr[]){
        //Add lines 20700, 20800, 21000 to 21500, 21700, 21900, 22000, and
       // 22100 to 23200.
       double sum = arr[getLineIndex("20700", arr)].value + arr[getLineIndex("20800", arr)].value + arr[getLineIndex("21000", arr)].value + arr[getLineIndex("21200", arr)].value + arr[getLineIndex("21300", arr)].value;
       sum += arr[getLineIndex("21400", arr)].value + arr[getLineIndex("21500", arr)].value + arr[getLineIndex("21700", arr)].value + arr[getLineIndex("21900", arr)].value + arr[getLineIndex("22000", arr)].value;
       sum += arr[getLineIndex("22100", arr)].value + arr[getLineIndex("22200", arr)].value + arr[getLineIndex("22215", arr)].value + arr[getLineIndex("22400", arr)].value + arr[getLineIndex("22900", arr)].value;
       sum += arr[getLineIndex("23100", arr)].value + arr[getLineIndex("23200", arr)].value;
       return sum;
    }
    
    public double line23400(lines arr[]){
        double sum = arr[getLineIndex("15000", arr)].value - arr[getLineIndex("23300", arr)].value;
        if(sum < 0) return 0;
        else return sum;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //Functions that still needs to be modified for rhe new version:
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
