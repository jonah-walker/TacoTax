
package tax;

public class tempclassforThomas {
    double gross_business_income=0, net_business_income, gross_professional_income, net_professional_income,gross_commission_income,net_commission_income; //self-employment income
    double gross_farming_income, net_farming_income, gross_fishing_income, net_fishing_income;    //self-employment income
    double workers_compensation_benefits, social_assistance,net_federal_supplements ;
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
    public double line14700(){     
        return arr[getLineIndex("14400", arr)].value + arr[getLineIndex("14500", arr)].value + arr[getLineIndex("14600", arr)].value;
    }
    public double line15000(){
        double sum = arr[getLineIndex("10100", arr)].value + arr[getLineIndex("10400", arr)].value + arr[getLineIndex("11300", arr)].value + arr[getLineIndex("11400", arr)].value;
        sum += arr[getLineIndex("11500", arr)].value + arr[getLineIndex("11600", arr)].value + arr[getLineIndex("11700", arr)].value + arr[getLineIndex("11900", arr)].value + arr[getLineIndex("12000", arr)].value;
        sum += arr[getLineIndex("12100", arr)].value + arr[getLineIndex("12200", arr)].value + arr[getLineIndex("12500", arr)].value + arr[getLineIndex("12600", arr)].value + arr[getLineIndex("12700", arr)].value;
        sum += arr[getLineIndex("12800", arr)].value + arr[getLineIndex("12900", arr)].value + arr[getLineIndex("13000", arr)].value + arr[getLineIndex("13010", arr)].value + arr[getLineIndex("13500", arr)].value;
        sum += arr[getLineIndex("13700", arr)].value + arr[getLineIndex("13900", arr)].value + arr[getLineIndex("14100", arr)].value + arr[getLineIndex("14300", arr)].value + arr[getLineIndex("14700", arr)].value;
        return sum;
    }
}
