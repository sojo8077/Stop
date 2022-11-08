package Stop;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();
        String input;

        System.out.println("Skriv valfri text. \nOm du vill avsluta skriv \"stop\" på en ny rad och tryck enter.");
        while (!logic.getStop()) {
            input = scan.nextLine();
            logic.checkIfStop(input);
            logic.add(input);
        }
        logic.countWords();
        System.out.println("Antal rader: " + logic.getLineCount() +
                "\nAntal tecken: " + logic.getCharCount() +
                "\nAntal ord: " + logic.getWordCount() +
                "\nLängsta ord: " + logic.getLongestWord());
    }
}
