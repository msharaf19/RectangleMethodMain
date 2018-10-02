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
		
		System.out.println("Area: ");
		System.out.println(length*width);
		
		System.out.println("Perimeter: ");
		System.out.println((2*length)+(2*width));
		
		double resultDiagnol = (Math.pow(length, 2))+(Math.pow(width, 2));
		double finalDiagnol = Math.sqrt(resultDiagnol);
		
		System.out.println("Diagnol length: ");
		System.out.printf("%.1f", finalDiagnol);
		
		
		
		

	}

}
