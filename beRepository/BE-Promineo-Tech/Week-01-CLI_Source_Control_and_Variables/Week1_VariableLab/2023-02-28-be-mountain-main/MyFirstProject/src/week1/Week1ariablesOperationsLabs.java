package week1;

public class Week1ariablesOperationsLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Create a variable to hold the quantity of
		//             available plane seats left on a flight
		int availablePlaneSeats = 60;
		
		//2. Create a variable to hold the cost of groceries at checkout
		double costofGroceries = 200.00;
		
		//3. Create a variable to hold a persons middle initial
		char middleInitial = 'M';
		
		//4. Create a variable hold true if it's hot outside 
		//            and false if its cold outside
		boolean isHotOutside = false;
		
		//5. Create a variable to hold a customers first name
		String customerFirstName = "Lily";
		
		//6. Create a variable to hold a street address
		String streetAddress = "1515 Eubank Blvd NE";
				
		//7. Print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costofGroceries + "is the price for groceries.");
		System.out.println("The persons middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customers first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives.");
		
		//8. A customer booked 2 plane seats, 
		//             remove 2 plane seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//9. Impulse candy bar purchase, add 2.15 to the grocery total
		//             costofGroceries = costofGroceries + 2.15;
		costofGroceries += 2.15;
		System.out.println(costofGroceries);
		
		//10. The birth certificate was printed incorrectly,
		//             change the middle initial to something else
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		//11. The season has changed, update the hot outside
		//               variable to be opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		//12. Create a new variable called full name using the customers first name,
		//                  the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Smith"; 
		System.out.println(fullName);
		
		//13. Print a line to the console that introduces the customer and says they live at 
		//                  the address variable
		System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");
	}
}
