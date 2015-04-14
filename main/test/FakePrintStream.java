import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Chandni on 4/9/2015.
 */
    public class FakePrintStream extends PrintStream {
        private String printedString;

        public FakePrintStream() {
            super(new FakeOutputStream());
        }

        @Override
        public void println(String string) {
            printedString = string;
        }

        public String printedString() {
            return printedString;
        }
    }
