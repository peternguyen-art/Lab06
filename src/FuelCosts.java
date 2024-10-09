import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gallon = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double cost;
        double distance;
        boolean done=false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter number of gallons of gas your tank can hold ");
            if(in.hasNextDouble()){
                gallon = in.nextDouble();
                done=true;
                if (gallon <=0){
                    System.out.println("Please enter a positive number");
                    done=false;
                }
            }else{
                System.out.println("Please enter a valid number");
                in.nextLine();
            }
        }while(!done);
        do {
            System.out.print("Enter your fuel efficiency in miles per gallon ");
            if(in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                done=true;
                if (fuelEfficiency <=0){
                    System.out.println("Please enter a positive number");
                    done=false;
                }
            }else{
                System.out.println("Please enter a valid number");
                in.nextLine();
            }
        }while(!done);
        do {
            System.out.print("Enter the price of gas per gallon ");
            if(in.hasNextDouble()){
                gasPrice = in.nextDouble();
                done=true;
                if (gasPrice <=0){
                    System.out.println("Please enter a positive number");
                    done=false;
                }
            }else{
                System.out.println("Please enter a valid number");
                in.nextLine();
            }
        }while(!done);

        cost= gasPrice * (100.0/fuelEfficiency);
        distance = gallon * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is %.2f \n", cost);
        System.out.printf("The distance you can go with a full tank of gas is %.2f \n", distance);


    }
}
