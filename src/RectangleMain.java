import java.util.Scanner;

// Mae Sharaf 
public class RectangleMain {

	public static void main(String[] args) 
	{
		System.out.print("Please input the length of a rectangle: ");
		
		Scanner in = new Scanner(System.in);
		double  length = in.nextDouble();
		in.nextLine();
		
		System.out.print("Please input the width of the rectangle: ");
		
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.printf("%-16s", "Area: ");
		System.out.printf("%3.1f",length*width);
		System.out.print("\n");
		
		System.out.printf("%-16s", "Perimeter: ");
		System.out.printf("%3.1f", (2*length)+(2*width));
		System.out.print("\n");
		
		double resultDiagnol = (Math.pow(length, 2))+(Math.pow(width, 2));
		double finalDiagnol = Math.sqrt(resultDiagnol);
		
		System.out.printf("%-10s", "Diagnol length: ");
		System.out.printf("%3.1f", finalDiagnol);
		
		
		
		

	}

}
