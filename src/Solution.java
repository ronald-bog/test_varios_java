import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Ingrese las palabras (ingrese 'fin' para terminar):");

        while (true) {
            String word = scanner.next();
            if (word.equals("fin")) {
                break;
            }
            words.add(word);
        }

        Collections.sort(words, (o1, o2) -> {
            return Integer.compare(o1.length(), o2.length());
        });

        System.out.println("Palabras ordenadas por longitud:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
