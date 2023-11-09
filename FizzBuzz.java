/**
 * This a FizzBuzz Program that prints "Fizz" if divisible by 3, and "Buzz" if divisible by 5 for numbers from 1 to 100
 * @author Conor
 * Date Last Modified: 11/8/2023
 **/

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String str = " ";
            if (i % 3 == 0) {
                str += "Fizz";
            }
            if (i % 7 == 0) {
                str += "Buzz";
            }
            //If it is not either, just add the number to the string
            else if ((i % 3 != 0) && (i % 7 != 0)) {
                str += i;
            }
            //Prints the string after the loop iteration, its reset each iteration
            System.out.println(str);
        }
    }
}