import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WriteOnPaperTest {

    @Test
    public void pencilWritesTextToPaper() {
        Pencil pencil = new Pencil();
        String input = "Down by the sea shore";

        Paper paper = new Paper();
        pencil.write(input, paper);

        Assert.assertEquals(input, paper.getPage());
    }

    @Test
    public void pencilAddsTextToPaper() {
        Pencil pencil = new Pencil();
        String first = "first part";
        String second = "second part";

        Paper paper = new Paper();
        pencil.write(first, paper);
        pencil.write(second, paper);

        Assert.assertEquals(first+second, paper.getPage());
    }

}
