package Enums;

public enum MythicalCreature {

    OGRE(50),
    DRAGON(100);

    private final int protectionValue;

    MythicalCreature(int protectionValue) {
        this.protectionValue = protectionValue;
    }

    public int getProtectionValue() {
        return protectionValue;
    }
}
