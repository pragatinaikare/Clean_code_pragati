package compound;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	public class Main_Program {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		    Scanner sc=new Scanner (System.in);
			Simple_and_Compound sim_com=new Simple_and_Compound();
			double amount, rate_of_interest, year;
		    System.out.println("Enter the amount:");
		    amount=sc.nextDouble();	    
		    System. out. println("Enter the No.of years:");
		    year=sc.nextDouble();	    
		    System. out. println("Enter the Rate of  interest");
		    rate_of_interest=sc.nextDouble();
		    //callling the method of other class to calculate the simple and compund interest
		    sim_com.calculate_interest(amount, rate_of_interest, year);
		    sc.close();


		}


	}

