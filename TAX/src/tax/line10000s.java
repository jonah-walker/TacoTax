/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;
import java.util.*;
import tax.TacoSauce;

/**
 *
 * @author caixu
 */
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
        System.out.print("please enter your exempt income for emergency volunteer services(box 87 of all t4 slips): ");
        income =  k.nextDouble();
        return income;
    }   
    
    public double line10120(){//
        double income = 0.00;
        System.out.print("please enter your commision recieved as an employee(box 42 of all T4 slips): ");
        income =  k.nextDouble();
        return income;
    }   
    
    public double line10130(){//Employment income
        System.out.println("Haave you recieved Wage-loss replacement contributions? (Y/N)");

        double income = 0.00;
        System.out.print("please enter the amount you have calculated: ");
        income =  k.nextDouble();
        return income;
    }
    
}
