public class Decoder {
    private String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String decode(int shift, String str) {
        String[] symbols = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String symbol : symbols) {
            if (isLetter(symbol)) {
                int pos = shift + abc.indexOf(symbol);
                if (pos > 32) pos = pos - 33;
                if (pos < 0) pos = pos + 33;
                stringBuilder.append(abc.charAt(pos));
            }
            else stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }

    public boolean isLetter(String symbol) {
        return abc.contains(symbol);
    }
}
