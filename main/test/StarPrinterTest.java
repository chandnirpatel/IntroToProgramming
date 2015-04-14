import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by Chandni on 4/9/2015.
 */
public class StarPrinterTest extends TestCase {

    public static void testPrintNis1Stars() {
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 1;
        starPrinter.printNStarsInLine(numberOfStars);
        assertEquals("*", printStream.printedString());
    }

    public static void testPrint3Stars() {
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 3;
        starPrinter.printNStarsInLine(numberOfStars);
        assertEquals("***", printStream.printedString());
    }

    public static void testPrintNVertically(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 3;
        String result = "*" + System.getProperty("line.separator")
                + "*" + System.getProperty("line.separator")
                + "*";
        starPrinter.printNStarsVertically(numberOfStars);
        assertEquals(result, printStream.printedString());
    }

    public static void testPrintNis1Vertically(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 1;
        String result = "*";
        starPrinter.printNStarsVertically(numberOfStars);
        assertEquals(result, printStream.printedString());
    }

    public static void testPrintRightTriangle(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 3;
        String result = "*" + System.getProperty("line.separator")
                + "**" + System.getProperty("line.separator")
                + "***";
        starPrinter.printRightTriangle(numberOfStars);
        assertEquals(result, printStream.printedString());
    }

    public static void testLeftTriangleUp(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 3;
        String result = "  *" + System.getProperty("line.separator")
                + " **" + System.getProperty("line.separator")
                + "***";
        ArrayList<String> answer = starPrinter.LeftTriangle(numberOfStars);
        starPrinter.printArrayElemPerLine(answer);
        assertEquals(result, printStream.printedString());
    }

    public static void testCenterTriangle() {
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfLines = 3;
        String result = "  *" + System.getProperty("line.separator")
                + " ***" + System.getProperty("line.separator")
                + "*****";
        starPrinter.printCenterTriangle(numberOfLines);
        assertEquals(result, printStream.printedString());
    }

    public static void  testLineOfSpacesThenSymbols(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int numberOfStars = 1;
        int numberOfSpaces = 2;
        String result = "  *";
        String answer = starPrinter.lineOfSpacesThenSymbols(numberOfSpaces, numberOfStars);
        assertEquals(result, answer);
    }

    public static void testCenteredDiamond(){
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        int longestLineNumber = 3;
        String result = "  *" + System.getProperty("line.separator")
                + " ***" + System.getProperty("line.separator")
                + "*****" + System.getProperty("line.separator")
                + " ***" + System.getProperty("line.separator")
                + "  *";
        starPrinter.printCenterDiamond(longestLineNumber);
        assertEquals(result, printStream.printedString());
    }

    public static void testPrintPerLine() {
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        String expectedResult = "a" + System.getProperty("line.separator") + "b";
        starPrinter.printArrayElemPerLine(stringArrayList);
        assertEquals(expectedResult, printStream.printedString());
    }
    
    public static void testUpsideDownCenterTriangle(){
        int height = 2;
        ArrayList<String> result = new ArrayList<>();
        result.add(" ***");
        result.add("  *");
        FakePrintStream printStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(printStream);
        ArrayList answer = starPrinter.bottomOfDiamond(height);
        assertEquals(result, answer);

    }
    
    public static void testDiamondWithName() {
        String name = "Name";
        ArrayList<String> result = new ArrayList<String>();
        result.add(" *");
        result.add("Name");
        result.add(" *");

        FakePrintStream fakePrintStream = new FakePrintStream();
        StarPrinter starPrinter = new StarPrinter(fakePrintStream);

        ArrayList<String> answer = starPrinter.putNameinDiamond(2, name);

        assertEquals(result, answer);

    }



}