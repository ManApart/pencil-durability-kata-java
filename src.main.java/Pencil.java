public class Pencil {
    private int initialDurability;
    private int currentDurability;

    public Pencil(int initialDurability) {
        this.initialDurability = initialDurability;
        this.currentDurability = initialDurability;
    }

    public void write(String text, Paper paper) {
        for (char letter : text.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                currentDurability -= 2;
            } else {
                currentDurability--;
            }

            paper.addText(new String(new char[]{letter}));
        }
    }

    public int getInitialDurability() {
        return initialDurability;
    }

    public int getCurrentDurability() {
        return currentDurability;
    }
}
