import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class HighOrLow {
    public static void main(String[] args) {
        int guessNumber = 0;
        boolean done=false;
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1;
        do {
            System.out.print("Enter your guess ");
            if (in.hasNextInt())
            {
                guessNumber = in.nextInt();
                done=true;
                if (guessNumber<1||guessNumber>10)
                {
                System.out.println("Please enter amount in between 1 and 10");
                in.nextLine();
                done=false;
                }
            }else{
                System.out.println("You enter an invalid value");
                in.nextLine();
            }
        } while (!done);
        if (guessNumber<val){
            System.out.println("Your guess is too small");
        } else if (guessNumber>val) {
            System.out.println("Your guess is too big");
        }else {
            System.out.println("You guessed correctly");
        }
        System.out.println("The correct number is "+val);
    }
}