import java.util.Scanner;

public class RoomCalculator {
	public static void main (String []args) {
		String again;
		Scanner input = new Scanner (System.in);
		do {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
			
			System.out.print("Enter Length:");
			int length = input.nextInt();
			
			System.out.print("Enter Width:");
			int width = input.nextInt();
			
			int area = length * width;
			int perimeter = (length * 2) + (width * 2);
			System.out.println("Area:" + area); 
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("Do you want to know the volume?");
			boolean calcVolume = input.next().equalsIgnoreCase("y");
				if(calcVolume) {
					System.out.print("Enter height of room:");
					int height = input.nextInt();
					int volume = length*width*height;
					System.out.println("Volume:" + volume);
					}
			
			
			System.out.println("Do you wish to continue? (y/n)");
			again = input.next();
			
			} while (again.equalsIgnoreCase("y"));	
		input.close();
	}
}