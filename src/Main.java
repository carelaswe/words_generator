import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letters = "йцукенгшщзхъфывапролджэячсмитьбюё";
        StringBuilder words = new StringBuilder();
        System.out.print("Введите количество слов : ");
        int wordsCount = scan.nextInt();
        System.out.print("Введите длинну слов : ");
        int wordsLength = scan.nextInt();
        int spaces = wordsCount - 1;
        int symbols = wordsLength * wordsCount + spaces;
        for (int s = 0; words.length() < symbols; s++) {
            if (s != 0 && s % wordsLength == 0) words.append(" ");
            int symbol = (int) (Math.random() * letters.length());
            char c = letters.charAt(symbol);
            words.append(c);
        }
        System.out.print(words);
    }
}