package pencilDurability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteOnPaperTest {
    private Pencil pencil;

    @Before
    public void setup(){
        pencil = new Pencil(400);
    }

    @Test
    public void pencilWritesTextToPaper() {
        String input = "Down by the sea shore";

        Paper paper = new Paper();
        pencil.write(input, paper);

        Assert.assertEquals(input, paper.getPage());
    }

    @Test
    public void pencilAddsTextToPaper() {
        String first = "first part";
        String second = "second part";

        Paper paper = new Paper();
        pencil.write(first, paper);
        pencil.write(second, paper);

        Assert.assertEquals(first+second, paper.getPage());
    }

    @Test
    public void pencilHasAnInitialDurability() {
        Assert.assertEquals(400, pencil.getInitialDurability());
    }

    @Test
    public void pencilLosesDurabilityAsItWritesLowercaseLetters() {
        String input = "input";

        Paper paper = new Paper();
        pencil.write(input, paper);

        Assert.assertEquals(400 - input.length(), pencil.getCurrentDurability());
    }

    @Test
    public void pencilLosesDurabilityAsItWritesCapitalLetters() {
        String input = "INPUT";

        Paper paper = new Paper();
        pencil.write(input, paper);

        Assert.assertEquals(400 - 2*input.length(), pencil.getCurrentDurability());
    }

}
