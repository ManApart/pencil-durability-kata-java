public class Pencil {
    private int initialDurability;

    public Pencil(int initialDurability) {
        this.initialDurability = initialDurability;
    }

    public void write(String text, Paper paper) {
        paper.addText(text);
    }

    public int getInitialDurability() {
        return initialDurability;
    }
}
