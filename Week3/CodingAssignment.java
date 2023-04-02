
public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int difference = ages[ages.length-1] - ages[0];
		System.out.println("Difference between first and last elements" + difference);
		int newAge = 31;
		int[] newAges = new int[ages.length+1];
		for (int i = 0; i < ages.length; i++) {
			newAges[i] = ages[i];
	}
		newAges[newAges.length-1] = newAge;
		difference = newAges[newAges.length-1] = newAges[0];
		System.out.println("Difference in ages with new age" + difference);
	}

public class Main {
	public static void main(String[] args) {
		String[]names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum = 0;
		for(String name : names) {
			sum += name.length();
		}
		double average =(double) sum / name.length();
		System.out.println("Average number of letters per name: " + average);
			
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
			concatenatedNames.append(name.append(""));
		}
		System.out.println("Names: " + concatenatedNames.toString().trim());
		}

// you can access the last element of an array with this,
//	array.length-1;
// you can access the first element in an array like this, 
//   	array[0];
	
public class Main {
	public static void main(String[] args) {
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		for(int i = 0; i < names.length; i++) {
			int nameLength = names[i].length();
			System.out.println(names[i] + "has" + nameLength + "letters");
		}
		int sum = 0;
		for(int i = 0; i < nameLength.length; i++) {
			sum += nameLength[i];
		}
		system.out.println("The sum of name lengths is" + sum);
	}
	
	String firstName = "Kyle";
	String lastName = "Tsosie";
	String fullName = getFullName(firstName, lastName);
	System.out.println(fullName);
	
	public static String getFullName(string firstName, String lastName) {
		return firstName + "" + lastName;
	}
	
	public static boolean sumGreaterThan100(int[] arr) {
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum > 100;
	}
	public static double calculateAverage(double[] arr) {
	    double sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum / arr.length;
	}
	public static double calculateAverage(double[] arr) {
	    double sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum / arr.length;
	}
	public static boolean compareAverages(double[] arr1, double[] arr2) {
	    double sum1 = 0;
	    double sum2 = 0;
	    for (double num : arr1) {
	        sum1 += num;
	    }
	    for (double num : arr2) {
	        sum2 += num;
	    }
	    double avg1 = sum1 / arr1.length;
	    double avg2 = sum2 / arr2.length;
	    return avg1 > avg2;
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    if (isHotOutside && moneyInPocket > 10.50) {
	        return true;
	    } else {
	        return false;
	    }
	}
	public static double calculateSleepHours(double timeInBed, double timeAwake) {
	    double sleepHours = timeInBed - timeAwake;
	    return sleepHours;
	}
//This code would be helpful for metric tracking to see how hours slept would affect certain days. 

}