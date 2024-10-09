import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double degreeC = 0;
        double degreeF;
        boolean done=false;
        //test for Bad Input
        do
        {
            System.out.print("Enter your Celsius degree ");
            if (in.hasNextDouble())
            {
                degreeC = in.nextDouble();
                done = true;
            }
            else {
                System.out.println("You have to enter a valid degree number");
                in.nextLine();
            }
        } while(!done);
        degreeF= (degreeC*1.8)+32;
        System.out.println("Your Fahrenheit degree is "+degreeF);
    }
}
