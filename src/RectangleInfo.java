import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args){
        double width=0;
        double height=0;
        double diagonal;
        double area;
        double perimeter;
        boolean done=false;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Enter the width of the rectangle ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
                if (width <=0){
                    System.out.println("Width can't be less than or equal 0");
                    in.nextLine();
                    done=false;
                }
            }
            else {
                System.out.println("You have to enter a valid value");
                in.nextLine();
            }
        } while(!done);
        do
        {
            System.out.print("Enter the height of the rectangle ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
                if (height <=0){
                    System.out.println("Height can't be less than or equal 0");
                    in.nextLine();
                    done=false;
                }
            }
            else {
                System.out.println("You have to enter a valid value");
                in.nextLine();
            }
        } while(!done);
        area=width*height;
        perimeter=(width+height)*2;
        diagonal= Math.sqrt(width*width+height*height);
        System.out.printf("Area of the rectangle is %.2f \n", area);
        System.out.printf("Perimeter of the rectangle is %.2f \n", perimeter);
        System.out.printf("Diagonal of the rectangle is %.2f \n", diagonal);

    }
}
