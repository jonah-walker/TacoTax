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
    
    public double line10130(){//Employment income
        System.out.println("Have you recieved Wage-loss replacement contributions? (Y/N)");
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
    
}
