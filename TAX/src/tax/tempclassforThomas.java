
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
    
    
    //new lines after 30000
    double eligible_dependant_amount, canada_caregiver_amount_partner_dependant, canada_caregiver_amount_infirm_dependant;
    double cpp_employment_income,cpp_self_employment_income, home_accessibility_expenses, pension_income_amount;
    double disability_amount_self, disability_amount_dependant, tuition_education_amount, tuition_amount_child;
    double amounts_transferred_partner, medical_expenses_other_dependants, donations_gifts;
    
    double line30400(){
        return eligible_dependant_amount;
    }
    
    double line30425(){
        return canada_caregiver_amount_partner_dependant;
    }
    
   double line30450(){
       return canada_caregiver_amount_infirm_dependant;
   }
    
  double line30800(){
      return cpp_employment_income;
  }
  
  double line31000(){
      return cpp_self_employment_income;
  }
  
  double line31285(){
      return home_accessibility_expenses;
  }
  
  double line31400(){
      return pension_income_amount;
  }
  
  double line31600(){
      return disability_amount_self;
  }
  
  double line31800(){
      return disability_amount_dependant;
  }
  
  double line32300(){
      return tuition_education_amount;
  }
  
  double line32400(){
      return tuition_amount_child;
  }
  
  double line32600(){
      return amounts_transferred_partner;
  }
  double line33199(){
      return medical_expenses_other_dependants;
  }
  
  double line34900(){
      return donations_gifts;
  }
  
}
