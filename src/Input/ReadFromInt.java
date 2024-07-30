package Input;

public class ReadFromInt implements NumberReader {
    private int number;
    public ReadFromInt(int number) {
        this.number = number;
    }

    @Override
    public int readNumber() {
        return number;
    }
}
