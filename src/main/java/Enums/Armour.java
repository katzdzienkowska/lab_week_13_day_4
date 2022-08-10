package Enums;

public enum Armour {

    JACKET(100),
    TROUSERS(60),
    BOOTS(50),
    GLOVES(30),
    HELMET(70);

    private final int defenceValue;

    Armour(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
