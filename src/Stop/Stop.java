package Stop;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Counter counter = new Counter();
        String input;

        System.out.println("Skriv valfri text. \nOm du vill avsluta skriv \"stop\" på en ny rad och tryck enter.");
        while (!counter.getStop()) {
            input = scan.nextLine();
            counter.checkIfStop(input);
            counter.add(input);
        }
        counter.countWords();
        System.out.println("Antal rader: " + counter.getLineCount());
        System.out.println("Antal tecken: " + counter.getCharCount());
        System.out.println("Antal ord: " + counter.getWordCount());
        System.out.println("Längsta ord: " + counter.getLongestWord());
        //System.out.println("Alla ord: " + counter.getWords());
    }
}
