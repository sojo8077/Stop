package Stop;

public class Logic {
    private String[] wordArr;
    private String words = "";
    private boolean stop;
    private int lineCount;
    private int charCount;
    private int wordCount;

    public boolean getStop() {
        return stop;
    }

    public void add(String input) {
        if (!stop) {
            lineCount++;
            charCount += input.length();
            words += " " + input;
        }
    }

    public void checkIfStop(String input) {
        if (input.trim().equalsIgnoreCase("stop")) {
            stop = true;
        }
    }

    public void countWords() {
        createArray();
        if (!words.isBlank()) {
            wordCount = wordArr.length;
        } else {
            wordCount = 0;
        }
    }

    public int getCharCount() {
        return charCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        String longest = "";
        StringBuilder longestWords = new StringBuilder();
        for (String word : wordArr) {
            if (word.length() > longest.length()) {
                longest = word;
                longestWords = new StringBuilder(longest);
            } else if (word.length() == longest.length()) {
                longestWords.append(" ").append(word);
            }
        }
        return longestWords.toString();
    }
    public void createArray(){
        words = words.trim().replaceAll(" +", " ");
        wordArr = words.split(" ");
    }
}
