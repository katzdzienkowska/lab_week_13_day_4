package Enums;

public enum Weapon {

    SWORD(100),
    AXE(50),
    DAGGER(20),
    CLUB(15);

    private final int damageValue;

    Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
