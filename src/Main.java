import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int userInput = scanner.nextInt();
        FizzBuzz(userInput);
    }

    public static void FizzBuzz(int nums) {
        for (int num = 1; num <= nums; num++) {
            if (num % 3 == 0 && num % 5 == 0)
                System.out.println("FizzBuzz");
            else if (num % 3 == 0)
                System.out.println("Fizz");
            else if (num % 5 == 0)
                System.out.println("Buzz");
            else {
                System.out.println(num);
            }
        }
    }

}
