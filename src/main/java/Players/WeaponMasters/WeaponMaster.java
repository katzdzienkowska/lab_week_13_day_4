package Players.WeaponMasters;

import Behaviours.IAttack;
import Behaviours.IDefend;
import Enums.Armour;
import Enums.Weapon;
import Players.Player;

public class WeaponMaster extends Player implements IAttack, IDefend {

    private Weapon weapon;
    private Armour armour;

    public WeaponMaster(String name, int health, Weapon weapon, Armour armour) {
        super(name, health);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int attack() {

        return this.weapon.getDamageValue() + defend();
    }

    public int defend() {
        return this.armour.getDefenceValue();
    }

    public void duel(IAttack opponent) {
        int player1 = attack();
        int player2 = opponent.attack();
        if (player1 <= player2) {
            int health = getHealth() - (player1 - player2);
            setHealth(health);
        }
    }
}
