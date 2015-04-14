import com.sun.deploy.util.StringUtils;

import java.io.PrintStream;
import java.util.ArrayList;


/**
 * Created by Chandni on 4/9/2015.
 */

public class StarPrinter {
    private PrintStream printStream;
    private String symbol = "*";
    private String space = " ";

    public StarPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public String lineOfSpacesThenSymbols(int numberOfSpaces, int numberOfStars) {
        String lineOfSpacesThenSymbols = "";
        lineOfSpacesThenSymbols += repeatChar(numberOfSpaces, space);
        lineOfSpacesThenSymbols += repeatChar(numberOfStars, symbol);
        return lineOfSpacesThenSymbols;
    }

    private String repeatChar(int number, String character) {
        String result = "";
        for(int i = number; i > 0; i--){
            result += character;
        }
        return result;
    }

    public void printArrayElemPerLine(ArrayList<String> lines){
        String printString ="";
        printString = StringUtils.join(lines, System.getProperty("line.separator"));
        printStream.println(printString);
    }

    public void printNStarsInLine(int numberOfStars) {
        String result = lineOfSpacesThenSymbols(0, numberOfStars);
        printStream.println(result);
    }

    public void printNStarsVertically(int numberOfStars) {
        ArrayList<String> result = new ArrayList<String>();
        int numberOfStarsPerLine = 1;
        int numberOfSpacesPerLine = 0;
        for(int i = numberOfStars; i > 0; i--) {
            result.add(lineOfSpacesThenSymbols(numberOfSpacesPerLine, numberOfStarsPerLine));
        }
        printArrayElemPerLine(result);
    }

    public void printRightTriangle(int numberOfStars) {
        printArrayElemPerLine(RightTriangle(numberOfStars));
    }

    public ArrayList<String> RightTriangle(int numberOfStars) {
        ArrayList<String> result = new ArrayList<String>();
        int numberOfStarsPerLine = 0;
        for(int i = numberOfStars; i > 0; i--) {
            numberOfStarsPerLine = numberOfStars - i + 1;
            result.add(lineOfSpacesThenSymbols(0, numberOfStarsPerLine));
        }
        return result;
    }

    public ArrayList<String> LeftTriangle(int numberOfStars) {
        ArrayList<String> result = new ArrayList<String>();
        int numberOfStarsPerLine = 0;
        for(int i = numberOfStars; i > 0; i--) {
            numberOfStarsPerLine = numberOfStars - i + 1;
            result.add(lineOfSpacesThenSymbols(i - 1, numberOfStarsPerLine));
        }
        return result;
    }

    public ArrayList<String> centerTriangle(int height) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> leftTriangle = LeftTriangle(height);
        ArrayList<String> rightTriangle = RightTriangle(height - 1);
        for (int i = 0; i < leftTriangle.size(); i++) {
            if (i == 0) {
                result.add(leftTriangle.get(i));
            } else {
                result.add(leftTriangle.get(i) + rightTriangle.get(i - 1));
            }
        }
        return result;
    }

    public void printCenterTriangle(int numberOfLines) {
        printArrayElemPerLine(centerTriangle(numberOfLines));
    }

    public ArrayList<String> bottomOfDiamond(int height) {
        ArrayList<String> result = new ArrayList<String>();
        for (int j = height; j > 0; j--) {
            result.add(lineOfSpacesThenSymbols(height - j + 1, 2 * (j - 1) + 1));
        }
        return result;
    }

    public ArrayList<String> centerDiamond(int longestLineNumber) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> top = centerTriangle(longestLineNumber);
        ArrayList<String> bottom = bottomOfDiamond(longestLineNumber - 1);
        result.addAll(top);
        result.addAll(bottom);
        return result;
    }

    public void printCenterDiamond(int longestLineNumber) {
        printArrayElemPerLine(centerDiamond(longestLineNumber));
    }

    public ArrayList<String> putNameinDiamond(int longestLineNumber, String name) {
        ArrayList<String> result = centerDiamond(longestLineNumber);
        result.remove(longestLineNumber - 1);
        result.add(longestLineNumber - 1, name);
        return result;
    }
}
