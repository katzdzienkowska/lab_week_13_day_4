package Players.Healers;

import Behaviours.IHeal;
import Enums.HealingTool;
import Players.Player;

public class Healer extends Player implements IHeal {

    private HealingTool healingTool;

    public Healer(String name, int health, HealingTool healingTool) {
        super(name, health);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public int heal() {
        return this.healingTool.getHealingValue();
    }

    public void healPlayer(Player player) {
        player.setHealth(player.getHealth() + heal());
    }
}
