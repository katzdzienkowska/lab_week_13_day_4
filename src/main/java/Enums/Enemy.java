package Enums;

public enum Enemy {

    TROLL(100),
    ORC(80);

    private final int attackValue;

    Enemy(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
