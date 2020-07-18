package Home_construct;


	
	import java.util.Scanner;


	public class MainProgram {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			Construction_Cost construct=new Construction_Cost();
			double total_area;
			int material_std;
			System.out.println("Enter the total area of the house in square feet : ");
			total_area=sc.nextDouble();
			System.out.println("Enter the choice of your material for house :\nFor standard material choose '0'\nFor above standard material choose '1'\nFor high standard material choose '3'\nFor high standard and fully automated home choose '5'\n");
			material_std=sc.nextInt();
			//calling the method of Construction_Cost to calculate total cost
			construct.calculate_cost(total_area, material_std);
			sc.close();
		}
	}
