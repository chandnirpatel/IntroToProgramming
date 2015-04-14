/**
 * Created by Chandni on 4/9/2015.
 */
public class FizzBuzz {

    public void fizzBuzz() {
        for (int number = 1; number <= 100; number++) {
            System.out.println(checkFizzBuzz(number));
        }
    }

    public String checkFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }


}
