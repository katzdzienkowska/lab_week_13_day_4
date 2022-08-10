package Enums;

public enum Spell {

    FIREBALL(150),
    LIGHTNING_STRIKE(100),
    IMMOBILISATION(60);

    private final int damageValue;

    Spell(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
