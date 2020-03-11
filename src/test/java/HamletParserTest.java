import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
       String answer = hamletParser.ChangeHamletToLeon();
        System.out.println(answer);
       String[] splitText = answer.split(" ");
        for (int i = 0; i <splitText.length ; i++) {
            Assert.assertFalse(splitText[i].equals("Hamlet") || splitText[i].equals("hamlet"));


            }
        }


    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}