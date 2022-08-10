package Enums;

public enum Treasure {

    GOLD(300),
    GEMS(50);

    private final int treasureValue;

    Treasure(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
