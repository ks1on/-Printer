package output;

import Input.DigitSplitter;
import Input.NumberReader;
import Input.ReadFromInt;
import Input.SplitToString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberReader reader = new ReadFromInt(scanner.nextInt());

        DigitSplitter splitter = new SplitToString();

        DigitPrinter printer = new TagPrinter();
        printer.print(splitter.splitToString(reader.readNumber()));
    }
}
