package Stop;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StopTest {
    @Test
    public void checkIfStop() {
        Counter counter = new Counter();
        counter.checkIfStop(" stop  ");

        boolean expected = true;
        boolean actual = counter.getStop();

        assertEquals(expected, actual);
    }

    @Test
    public void addCharCount() {
        Counter counter = new Counter();
        counter.add("Hallå hej  halåå");
        counter.add("Wow");

        int expected = 19;
        int actual = counter.getCharCount();

        assertEquals(expected, actual);
    }

    @Test
    public void countWords() {
        Counter counter = new Counter();
        counter.add("      Hallå hej  halåå        ");
        counter.countWords();

        int expected = 3;
        int actual = counter.getWordCount();

        assertEquals(expected, actual);
    }

    @Test
    public void getLongestWord() {
        Counter counter = new Counter();
        counter.add("Hallå hej  halåå   ");
        counter.countWords();
        counter.getLongestWord();

        String expected = "Hallå halåå";
        String actual = counter.getLongestWord().toString();

        assertEquals(expected, actual);
    }
}
