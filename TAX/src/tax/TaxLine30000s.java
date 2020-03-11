/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

public static int getLineIndex(String line, lines[] arr){//get the index of the line given the line number
        for(int i = 0; i < arr.length; i++){
            if(line.equals(arr[i].getLine())){
                return i;
            }
        }
        return -1;
    }

public class TaxLine30000s {

    double line51090;
    double sum1to24_for30000s;
    
    public double line30000(){//Employment income
        return 12069;
    } 
    
    public double line30100(){//Employment income
        double amount;//amount to put at this line
        double n = arr[getLineIndex("23600", arr)];//money at 23600
        if(n<=37790) amount = 7494;
        else if(n>=87750) amount = 0;
        else{
            amount = 7494 - (n-37790) * 0.15;
            if(amount<0) amount = 0;
        }
        return amount;
    }
        
    public double line30300(){
        String inputu;
        //month and day of 55220
        int month;
        int day;
        //
        double localline51090 = 0;
        //amount return
        double amount = 0;
        if (ts.marital_status <= 2){
            System.out.println("Did your marital status change to other than married or common-law in 2019? (Y/N)");
            inputu = k.nextLine();
            if(inputu.equals("Y")){
                System.out.println("Date of change");
                System.out.println("Month(1-12):");
                month = k.nextInt();
                System.out.println("day(1-31):");
                day = k.nextInt();       
            }else return 0.00;
        }
        amount += 12069;
        System.out.println("Are entitled to the Canada caregiver amount for your spouse or common-law partner? (Y/N)");
        inputu = k.nextLine();
        if(inputu.equals("Y")) localline51090 = 2230;
        line51090 = localline51090;
        amount = amount + localline51090 - ts.partner_netincome;
        if(amount<0) return 0.00;
        return amount;
    }
    
    //still needs work
    public double line30400(){ 
        String inputu;
        //month and day of 55290
        int month;
        int day;
        if (ts.marital_status > 2){
            System.out.println("Did your marital status change married or common-law in 2019? (Y/N)");
            inputu = k.nextLine();
            if(inputu.equals("Y")){
                System.out.println("Date of change");
                System.out.println("Month(1-12):");
                month = k.nextInt();
                System.out.println("day(1-31):");
                day = k.nextInt();       
            }else return 0.00;
        }
    }
    
    //still needs work
    public double line30425(){
        
    }
    
    //still needs work
    public double line30450(){
        
    }
    
    public double line30499(){
        System.out.println("Canada caregiver amount for infirm children under 18 years of age\n" +
"Enter the number of children for whom you are claiming this amount:");
        double input;
        input = k.nextInt;
        return input;
    }
    
    public int line30500(){
        double n = arr[getLineIndex("30499", arr)];//money at 30499
        return n*2230;
    }
    
    
    public double line33099(){
        System.out.println("What is Medical expenses for self, spouse or common-law partner, and your dependent children born in 2002 or later");
        double value;
        value = k.nextInt;
        return value;
    }
    
    public double line33199(){//need more work
        return 0;
    }
    
    public double line33200(){
        double n = 0.03*arr[getLineIndex("23600", arr)];//money at 23600 * 0.03
        double L26 = 0;
        double L27;
        if(n>2352) L26 = n;
        else L26 = 2352.0;
        
        double L25 = arr[getLineIndex("33099", arr)];//money at 33099
        L27 = L25 - L26;
        if(L27<0) L27 = 0;
        
        return L27 + arr[getLineIndex("31099", arr)];
    }
    
    public double line33500(){
        return sum1to24_for30000s + arr[getLineIndex("32000", arr)];
    }
    
    public double line33800(){
        return arr[getLineIndex("33500", arr)] * 1.15;
    }
    
    public double line34900(){//needs more work
        return 0;
    }
    
    public double line35000(){
        return arr[getLineIndex("33800", arr)] + arr[getLineIndex("34900", arr)]
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
