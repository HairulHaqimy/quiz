
import java.util.Scanner;

public class Laptop2 {
	
     String brand , colour ;
     double storage ;
     
     Scanner s = new Scanner(System.in);
	
    public void specification() {
    	 
    	 System.out.println("Enter Brand, colour and storage : ");
    	 String a = s.nextLine();
    	 String b = s.nextLine();
    	 double c = s.nextDouble();
    	 
    	 System.out.println("Laptop brand > " + a );
    	 System.out.println("Colour > " + b );
    	 System.out.println("Laptop storage > " + c + " GB ");
    	 
     }
    	 
     
    	 void Quantity() {
       	  System.out.println("Enter the price : RM ");
       	  double d = s.nextDouble();
         	  System.out.println("Enter the quantity : ");
         	  int phone = s.nextInt();
         	
             int totalItem = (int) (phone * d) ;
             System.out.println("Total price item : RM " + totalItem); 
             System.out.println("\n--next--");
         }
     
     
    	 void totalPrice() {
    			System.out.println("How many laptop do you want to buy?");
    			int quantity = s.nextInt();
    			System.out.println("Enter the price");
    			double money = s.nextDouble();
    			double totalPrice = quantity*money;
    			System.out.println("Total price of the laptop:"+ totalPrice);
     
     
     
     }




	