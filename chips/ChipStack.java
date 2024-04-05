package chips;

public class ChipStack {

    private Chip chip;
    private int chipCount;

    public ChipStack(Chip chip) {
        this.chip = chip;
        this.chipCount = 0;
    }

    public ChipStack(Chip chip, int chipCount) {
        this.chip = chip;
        this.chipCount = chipCount;
    }

    public Chip getChip() {
        return chip;
    }

    public int getChipCount() {
        return chipCount;
    }

    public void addChips(int addChips) {
        chipCount += addChips;
    }

    public void throwChip() {
        chipCount--;
    }

    public void throwChips(int chipThrow) {
        chipCount -= chipThrow;
    }

    public float stackValue() {
        return chip.getValue() * chipCount;
    }

    public float getChipValue() {
        return chip.getValue();
    }

}
