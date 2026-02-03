import java.util.Scanner;

class CircleRadius {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double r = ip.nextDouble();

        double diameter = 2 * r;
        System.out.println("Diameter of circle: " + diameter);
        
        double circum = 2*3.14*r;
        System.out.println("circumference of circle: " + circum);
        
        double Area = 3.14*r*r;
        System.out.println("Area of circle: " + Area);

        ip.close();
    }
}
