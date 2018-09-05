import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WriteOnPaperTest {

    @Test
    public void paperReturnsText() {
        Pencil pencil = new Pencil();
        String input = "She sell sea shells";

        Paper paper = new Paper();
        pencil.write(input, paper);

        Assert.assertEquals(input, paper.getPage());
    }

}