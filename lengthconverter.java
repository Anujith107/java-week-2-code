import java.util.Scanner;
class centimeter
{
    public static void main(String[] args)
    {
        
    Scanner ip=new Scanner(System.in);
    
    System.out.println("Enter a length in centimeter:");
    double cm=ip.nextDouble();
    
    double meter=cm / 100 ;
    double kilometer=cm / 100000;

    System.out.println("kilometer is:" + kilometer);
    System.out.println("meter is:" + meter);
    
    ip.close();
    }
}
