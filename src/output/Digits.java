package output;

public enum Digits {
    zero(0),
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9);

    private int value;

    Digits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Digits valueOfS(String value) {
        return values()[Integer.parseInt(value)];
    }

    public int plus(Digits another) {
        return value + another.getValue();
    }
}
