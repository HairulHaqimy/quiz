import java.util.Scanner;

public class Laptop2 {
	
     String brand , colour ;
     double storage ;
     
     Scanner s = new Scanner(System.in);

	//setter
     
     public void setColour() {
	 System.out.println("Enter laptop colour");
	 this.colour = s.nextLine();
	}

	public void setBrand() {
	System.out.println("Enter laptop brand");
	this.brand = s.nextLine();
		
	}

	public void setStorage() {
	System.out.println("Enter laptop storage");
	this.storage = s.nextDouble();
		
	}

	//getter
	
	public String getColour() {
	return this.colour;
	
	}

	public String getBrand() {
	return this.brand;
	
	}

	public Double getStorage() {
	return this.storage;
	
	}
	
   
}


	




	
