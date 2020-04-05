/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;
import java.util.*;
import tax.TacoSauce;


public class line10000s {
    
    Scanner k = new Scanner(System.in);
    
    boolean goLine11905 = false;
    
    public boolean YorN (){
        String ur;
        System.out.println("Please enter (Y/N) for your response: ");
        ur = k.nextLine();
        if (ur.equals("Y")) return true;
        return false;
    }
    
    public double line10105(){//
        double income = 0.00;
        System.out.println("please enter your exempt income for emergency volunteer services(box 87 of all t4 slips): ");
        income =  k.nextDouble();
        return income;
    }   
    
    public double line10120(){//
        double income = 0.00;
        System.out.println("please enter your commision recieved as an employee(box 42 of all T4 slips): ");
        income =  k.nextDouble();
        return income;
    }   
    
    public double line10130(){
        System.out.println("Have you recieved Wage-loss replacement contributions?");
        if(YorN() == false) return 0.0;
        System.out.println("please go to the following link to the guide that finds your amount");
        System.out.println("https://www.canada.ca/en/revenue-agency/services/tax/individuals/topics/about-your-tax-return/tax-return/completing-a-tax-return/personal-income/line-10130-wage-loss-replacement-contributions.html");
        double income = 0.00;
        System.out.println("please enter the amount you have calculated: ");
        income =  k.nextDouble();
        return income;
    }
    
    public double line10400(){//
        double income = 0.00;
        System.out.println("please enter the employment income not reported on a T4 slip: ");
        income =  k.nextDouble();
        return income;
    }
    
    public double line11600(){
        if(marital_status > 2) return 0.0;
        System.out.println("Do you have an Elected split-pension amount?");
        if(YorN() == false) return 0.0;
        System.out.println("You will have to complete form T1032 if you have not done so, which could be found in the link below: ");
        System.out.println("https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/t1032/t1032-fill-19e.pdf");
        double income = 0.00;
        System.out.println("please enter the amount in line G of the T1032 form: ");
        income =  k.nextDouble();
        return income;
    }
    
    public double line11700(){ //not finished
//        System.out.println("Are you eligible for Universal Child Care Benefit(UCCB) and recieved the RC62 slip?");
//        if(YorN() == false) return 0.0;
        double amount = 0.00;
//        System.out.println("please refer to your RC62 slip and input the amount in box 10: ");
//        income =  k.nextDouble();
        return amount;
    }
    
    public double line11701(){ //not finished
        return 0;
    }
    
    public double line11900(){
        System.out.println("Have you recieved a T4E slip?");
        if(YorN() == false) return 0.0;
        goLine11905 = true;
        System.out.println("please enter the amount for Employment insurance and other benefits. This could be found on (box 14 of the T4E slip");
        double income = 0.00;
        income =  k.nextDouble();
        return income;
    }
    
    public double line11905(){
        if(goLine11905 == false) return 0;
        double amount;
        double a2;
        System.out.println("Report the amount of the employment insurance maternity and parental benefits you received in 2019.");
        System.out.println("This amount can be found on the letter you received from Employment and Social Development Canada (ESDC).");
        System.out.println("If such situation do not apply to you, please input '0' :");
        amount = k.nextDouble();
        System.out.println("Please input the amount of provincial parental insurance plan (PPIP) maternity and parental benefits (box 36 of your T4E slip)");
        a2 = k.nextDouble();
        amount += a2;
        return amount;
    }
    
    public double line12700(){
         System.out.println("Do you have a capitcal gain or loss in 2019?");
        if(YorN() == false) return 0.0;
        System.out.println("please complete schedule 3 in the following link");
        System.out.println("https://www.canada.ca/content/dam/cra-arc/formspubs/pbg/t1032/t1032-fill-19e.pdf");
        double income = 0.00;
        System.out.println("If you have a Taxable capital gain (positive number on line 19900 at schedule 3), input that number. Otherwise please input 0.");
        income =  k.nextDouble();
        return income;
    }
}
