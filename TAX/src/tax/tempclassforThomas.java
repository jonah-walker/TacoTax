
package tax;

public class tempclassforThomas {
    double social_benefits_repayment, forces_police ,security_options, limited_partnership_losses_other_years;
    double non_capital_losses_other_years,net_capital_losses_other_years,capital_gains_deduction;
    double northern_residents_deductions, additional_deductions;
    
    double line23500(){
        return social_benefits_repayment;
    }
    
    double line23600(){
        double amount = arr[getLineIndex("23400", arr)].value - arr[getLineIndex("23500", arr)].value;
        if (amount <= 0) return 0;
        else return amount;
    }
    
    double line24400(){
        return forces_police;
    }
    
    double line24900(){
        return security_options;
    }
    
    double line25000(){        
        if(arr[getLineIndex("14600", arr)].value == 0.00) return arr[getLineIndex("14700", arr)].value;
        else{
            double amount = arr[getLineIndex("23400", arr)].value - (arr[getLineIndex("11700", arr)].value+arr[getLineIndex("12500", arr)].value);
            amount += arr[getLineIndex("21300", arr)].value + arr[getLineIndex("23200", arr)].value;
            return amount;
        }
    }
    
    double line25100(){
        return limited_partnership_losses_other_years;
    }
    
    double line25200(){
        return non_capital_losses_other_years;
    }
    
    double line25300(){
        return net_capital_losses_other_years;
    }
    
    double line25400(){
        return capital_gains_deduction;
    }
    
    double line25500(){
        return northern_residents_deductions;
    }
    
    double line25600(){
        return additional_deductions;
    }
    
    double line25700(){
        double amount = arr[getLineIndex("24400", arr)].value + arr[getLineIndex("24900", arr)].value + arr[getLineIndex("25000", arr)].value;
        amount += arr[getLineIndex("25100", arr)].value + arr[getLineIndex("25200", arr)].value + arr[getLineIndex("25300", arr)].value + arr[getLineIndex("25400", arr)].value;
        amount += arr[getLineIndex("25500", arr)].value + arr[getLineIndex("25600", arr)].value;
        return amount;
    }
    
    double line26000(){
        double amount = arr[getLineIndex("23600", arr)].value - arr[getLineIndex("25700", arr)].value;
        if(amount <= 0) return 0;
        else return amount;
    }
    
}
