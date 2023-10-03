package scanner;
import java.util.Scanner;

public class BankScanner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Bank name :");
	    String bankname = s.nextLine();
	    
	    System.out.println("Enter Branch name :");
	     String branchname = s.nextLine();
	    
	    System.out.println("Enter Customer name :");
	    String customername = s.nextLine();
	    
	    
	    System.out.println("Enter Acoount number :");
	    long accountnumber = s.nextLong();
		
	    System.out.println("Enter Saving balances : ");
	    double savingbalances = s.nextDouble();
	    
	    System.out.println("Enter Loan amount ");
	    double loanamount = s.nextDouble();
	    
	    
	    System.out.println("Bank name :"+ bankname);
	    System.out.println("Branch name :"+ branchname);
		System.out.println("Customer name :"+customername);
		System.out.println("Acoount number:"+accountnumber);
		System.out.println("Saving balances:"+savingbalances);
		System.out.println("Loan amount:"+loanamount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   
	}

}
