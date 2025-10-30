import java.util.Scanner;

public class AreaCalculator {
    private static float pi = 3.142f;

    private static float circle(float radius) {		
        return (pi * radius * radius);
    }

    private static float square(float length) {
        return length * length;
    }

    private static float rectangle(float length, float breadth) {
        return length * breadth;
    }
    //volume calcultor

    private static float sphere(float radius) {
        return (4/3) * pi * (radius * radius * radius);
    }
    private static float cube(float sideLength) {
        return sideLength * sideLength * sideLength;
    }
    private static float cuboid(float length, float breadth, float height) {
        return length * breadth * height;
    }

    public static void main(String s[]) {
        System.out.println("Welcome to the area calculator!");
        while(true) {
            System.out.println("\nEnter 1 for circle\n" +
                              "Enter 2 for square\n" +
                              "Enter 3 for rectangle");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter the radius of the circle");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of circle of radius "+ radius + "is " + circle(radius));
            } else if (choice == 2) {
                System.out.println("Enter the length of the square");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of square of side length "+ length + " is " + square(length));
            } else if (choice == 3) {
                System.out.println("Enter the length of the rectangle");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the rectangle");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of rectangle of length "+ length + 
                                    "and breadth "+breadth+ " is " + rectangle(length,breadth));
            } else if (choice == 4){
                System.out.println( "enter the radius of the sphere" );
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("Here is the volume of sphere of radius "+ radius + "is " + sphere(radius));
            }
             else if (choice == 5) {
                System.out.println("Enter the side length of the cube");
                float sideLength = Float.parseFloat(scanner.nextLine());
                System.out.println("Here is the volume of cube of side length "+ sideLength + "is " + cubeVolume(sideLength));
            } else if (choice == 6) {
                System.out.println("Enter the length of the cuboid");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the cuboid");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the height of the cuboid");
                float height = Float.parseFloat(scanner.nextLine());
                System.out.println("Here is the volume of cuboid of length "+ length + ", breadth "+breadth+ ", and height "+height+ " is " + cuboidVolume(length,breadth,height));

             } else if (choice == 5) {
                System.out.println("Enter the side length of the cube");
                float sideLength = Float.parseFloat(scanner.nextLine());
                System.out.println("Here is the volume of cube of side length "+ sideLength + "is " + cube(sideLength));
          
            } else if (choice == 6) {
                System.out.println("Enter the length of the cuboid");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the cuboid");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the height of the cuboid");
                float height = Float.parseFloat(scanner.nextLine());
                System.out.println("Here is the volume of cuboid of length "+ length + ", breadth "+breadth+ ", and height "+height+ " is " + cuboid(length,breadth,height));   
            
            
            }else {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
