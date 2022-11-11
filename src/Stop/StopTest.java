package Stop;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StopTest {
    @Test
    public void checkIfStop() {
        Logic logic = new Logic();
        logic.checkIfStop(" stop  ");

        boolean expected = true;
        boolean actual = logic.getStop();

        assertEquals(expected, actual);
    }

    @Test
    public void addCharCount() {
        Logic logic = new Logic();
        logic.add("Hallå hej  halåå");
        logic.add("Wow");

        int expected = 19;
        int actual = logic.getCharCount();

        assertEquals(expected, actual);
    }

    @Test
    public void countWords() {
        Logic logic = new Logic();
        logic.add("      Hallå hej  halåå        ");
        logic.createArray();
        logic.countWords();

        int expected = 3;
        int actual = logic.getWordCount();

        assertEquals(expected, actual);
    }

    @Test
    public void getLongestWord() {
        Logic logic = new Logic();
        logic.add("Hallå hej  halåå   ");
        logic.createArray();
        logic.getLongestWord();

        String expected = "Hallå halåå";
        String actual = logic.getLongestWord();

        assertEquals(expected, actual);
    }
}
