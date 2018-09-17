package pencilDurability;

public class Paper {
    String text = "";

    public String getPage() {
        return text;
    }

    public void addText(String text) {
        this.text += text;
    }
}
