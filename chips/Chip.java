package chips;

import java.awt.Color;

public class Chip {

    private Color baseColor;
    private Color accentColor;
    private Color dotColor;
    private float value;

    public Chip() {
        baseColor = Color.BLACK;
        accentColor = Color.WHITE;
        dotColor = Color.GRAY;
        value = Float.MIN_VALUE;
    }

    public Chip(float value, Color baseColor, Color accentColor, Color dotColor) {
        this.baseColor = baseColor;
        this.accentColor = accentColor;
        this.dotColor = dotColor;
        this.value = value;
    }

    public Chip(Chip chip) {
        baseColor = new Color(chip.baseColor.getRGB());
        accentColor = new Color(chip.accentColor.getRGB());
        dotColor = new Color(chip.dotColor.getRGB());
        value = chip.getValue();
    }

    public Color getAccentColor() {
        return accentColor;
    }

    public Color getBaseColor() {
        return baseColor;
    }

    public Color getDotColor() {
        return dotColor;
    }

    public float getValue() {
        return value;
    }
}
