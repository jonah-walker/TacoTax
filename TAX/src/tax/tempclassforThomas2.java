
package tax;

public class tempclassforThomas2 {
  //temp variables for calulating fedral tax on taxable income
  double tax_table_value = 0; //call fedtaxtable after line 26000
   
  //nornal //40000s variables
  double fed_tax_split_income;
  
  void fedtaxtable(){
      double taxable_income = arr[getLineIndex("26000", arr)].value;
      if(taxable_income <= 47630){
          tax_table_value =  taxable_income * 0.15;
      }else if(taxable_income <= 95259){
          tax_table_value = (taxable_income-47630) * 0.205 + 7145;
      }else if(taxable_income <=147667){
          tax_table_value = (taxable_income -  95259) * 0.26 + 16908;
      }else if(taxable_income <= 210371){
          tax_table_value = (taxable_income - 147667) * 0.29 + 30535;
      }else{
          tax_table_value = (taxable_income-210371) *   0.33 + 48719;
      }
  }
  
  double line40424(){
      return fed_tax_split_income;
  }
  
  double line40400(){
      return  arr[getLineIndex("40424", arr)].value + tax_table_value;
  }
  
  
}
