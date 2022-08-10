package Players.SpellCasters;

import Behaviours.IAttack;
import Behaviours.IDefend;
import Enums.MythicalCreature;
import Enums.Spell;
import Players.Player;

public class SpellCaster extends Player implements IAttack, IDefend {

    private Spell spell;
    private MythicalCreature mythicalCreature;

    public SpellCaster(String name, int health, Spell spell, MythicalCreature mythicalCreature) {
        super(name, health);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public Spell getSpell() {
        return spell;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public int attack() {

        return this.spell.getDamageValue() + defend();
    }

    public int defend() {
        return this.mythicalCreature.getProtectionValue();
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
