package Input;

public class SplitToString implements DigitSplitter {

    @Override
    public String[] splitToString(int number) {
        return Integer.toString(number).split("");
    }
}
