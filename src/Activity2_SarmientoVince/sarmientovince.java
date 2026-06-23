
package Activity2_SarmientoVince;

import Activity2.*;


public class sarmientovince {
    public static void main(String[] args) {
         double income = 50000;  
         double foodAllowance = 15000;
         double transportation = 2500;  
         double rent = 4500;  
         double utilityBill = 3500;   
         
         System.out.println("Income: "+income);
         System.out.println("Food Allowance: "+foodAllowance*100/income+"%");
         System.out.println("Transportaion: "+transportation*100/income+"%");
         System.out.println("Rent: "+rent*100/income+"%");
         System.out.println("Utility Bill: "+utilityBill*100/income+"%");
         System.out.println("Remaining Balance: "+(int)(income-foodAllowance-transportation-rent-utilityBill));
    }
}
