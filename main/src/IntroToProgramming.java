import java.io.PrintStream;

/**
 * Created by Chandni on 4/9/2015.
 */
public class IntroToProgramming {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        StarPrinter starPrinter = new StarPrinter(printStream);
        starPrinter.printNStarsInLine(1);
        starPrinter.printNStarsInLine(8);
        starPrinter.printNStarsVertically(3);
        starPrinter.printRightTriangle(3);
        starPrinter.printCenterTriangle(3);
        starPrinter.printCenterDiamond(3);
        starPrinter.printArrayElemPerLine(starPrinter.putNameinDiamond(3, "Bill"));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();

        PrimeFactors primeFactors = new PrimeFactors(30);
        printStream.println(primeFactors.generate());
    }
}
