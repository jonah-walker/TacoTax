
package tax;

public class tempclassforThomas2 {
    double pension_adjustment, registered_pension_plan_deduction, RRSP_deduction, PRPP_employer_contributions, deduction_for_elected_split_pension, annual_union_or_professional_dues;
    double universal_child_care_benefit_repayment, child_care_expenses, disability_supports_deduction , moving_expenses;
    double gross_business_investment_loss, allowable_deduction_business_investment_loss, total_support_payments, allowable_deduction_support_payments;
    double carrying_charges_and_interest_expenses, deduction_CPP_or_QPP_contributions_self_employment, deduction_for_CPP_or_QPP_enhanced_contributions_employment_income;
    double exploration_and_development_expenses, other_employment_expenses, clergy_residence_deduction, other_deductions;
    
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
    
    public double line23300(){
        //Add lines 20700, 20800, 21000 to 21500, 21700, 21900, 22000, and
       // 22100 to 23200.
       double sum = arr[getLineIndex("20700", arr)].value + arr[getLineIndex("20800", arr)].value + arr[getLineIndex("21000", arr)].value + arr[getLineIndex("21200", arr)].value + arr[getLineIndex("21300", arr)].value;
       sum += arr[getLineIndex("21400", arr)].value + arr[getLineIndex("21500", arr)].value + arr[getLineIndex("21700", arr)].value + arr[getLineIndex("21900", arr)].value + arr[getLineIndex("22000", arr)].value;
       sum += arr[getLineIndex("22100", arr)].value + arr[getLineIndex("22200", arr)].value + arr[getLineIndex("22215", arr)].value + arr[getLineIndex("22400", arr)].value + arr[getLineIndex("22900", arr)].value;
       sum += arr[getLineIndex("23100", arr)].value + arr[getLineIndex("23200", arr)].value;
       return sum;
    }
    
    public double line23400(){
        double sum = arr[getLineIndex("15000", arr)].value - arr[getLineIndex("23300", arr)].value;
        if(sum < 0) return 0;
        else return sum;
    }
    
}
