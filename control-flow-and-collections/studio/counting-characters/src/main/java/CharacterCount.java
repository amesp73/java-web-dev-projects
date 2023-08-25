import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

//        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = input.nextLine();
        sentence.replaceAll("[A-Za-z0-9]", "");

        char[] charactersInString = sentence.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCounter = new HashMap<>();


        for (char character : charactersInString) {
//            System.out.println(character);
            if (charCounter.containsKey(character)) {
                charCounter.put(character, charCounter.get(character) + 1);
            } else {
                charCounter.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        for (char i = 0; i < charactersInString.length; i++ ) {
//
//            char x = sentence.charAt(i);
//            if ()
//        }

    }
}
