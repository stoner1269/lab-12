public class Main {

    private static String inputTxt =
            "ЗТЕФТИ ЧЦФТ!\n" +
                    "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                    "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                    "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.\n";

    public static void main(String args[]) {
        System.out.print("Исходный текст:\n" + inputTxt);
        Decoder decoder = new Decoder();
        String[] text = inputTxt.split("\n");
        System.out.println("Расшифрованая первая строка:\n" + decoder.decode(-4, text[0]));
        System.out.println("Расшифрованая вторая строка:\n" + decoder.decode(8, text[1]));
        System.out.println("Расшифрованая третья строка:\n");
        for (int i = 1; i < 32; i++) {
            System.out.println(decoder.decode(i, text[2]));
        }
        String[] words = text[3].split(" ");
        for (int j = 0; j < words.length; j++) {
            System.out.println("Варианты расшифровки " + (j+1) + " слова:");
            for (int i = 1; i < 34; i++) {
                System.out.print(decoder.decode(i, words[j]) + " ");
            }
            System.out.println();
        }

    }
}

