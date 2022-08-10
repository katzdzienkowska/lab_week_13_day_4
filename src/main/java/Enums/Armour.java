package Enums;

public enum Armour {

    BRONZE(50),
    SILVER(100),
    GOLD(150);

    private final int defenceValue;

    Armour(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
