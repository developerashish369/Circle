/*Ashish Acharya
  ProjectI
  Due: Feb 12 2018
  
  Write a program called Circle.java. The radius of a circle is a double data type, and PI is a final double initialized with the value 3.14159.
The program should ask the user to input the radius of a circle from the keyboard, and prints the circle’s diameter, circumference and area.
Use the following formulas:
   diameter = 2 * radius
   circumference = 2 * PI * radius
   area = PI * radius * radius 
*/
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
   // Declaring and inuitializing constant
      final double PI = 3.14159;
   //Declaring variables
      double diameter;
      double circumference;
      double area;
		
      // Create a Scanner object
		 Scanner input = new Scanner(System.in);
		// Prompt user to enter the radius from the keyboard
      System.out.print("Enter the radius of a circle: ");
		double radius = input.nextDouble();
		

		// Comput the  diameter, circumference and area 
      diameter= 2*radius;
      circumference=2*PI*radius;
		area = radius * radius * PI;
		

		// Display results
		System.out.println("The diameter of circle is " + diameter);
		System.out.println("The circumference of circle is " + circumference);
      System.out.println("The area of circle is " + area); 
      
	}
}
