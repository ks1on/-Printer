package output;

public class TagPrinter implements DigitPrinter {
    @Override
    public void print(String[] digits) {
        StringBuilder[] lines = new StringBuilder[5];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = new StringBuilder();
        }

        for (String digit: digits) {
            Digits d = Digits.valueOfS(digit);
//            int di = Integer.parseInt(digit);
            for (int i = 0; i < 5; i++) {
                lines[i].append(Tags.tags[d.getValue()][i]);
//                lines[i].append(Tags.tags[di][i]);
            }
        }
        for (StringBuilder line: lines) {
            System.out.println(line);
        }
    }
}
