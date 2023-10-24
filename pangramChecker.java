package arrayslogical;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangramChecker {

    public static boolean isPangram(String sentence) {
        
        sentence = sentence.replaceAll(" ", "").toLowerCase();

       
        Set<Character> characters = new HashSet<>();

       
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }

       
        return characters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}

