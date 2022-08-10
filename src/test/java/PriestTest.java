import Enums.*;
import Players.Healers.Priest;
import Players.Player;
import Players.WeaponMasters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriestTest {

    Priest priest;
    Player player;

    @Before
    public void before() {
        priest = new Priest("Adam", 200, HealingTool.POTION);
    }

    @Test
    public void hasName() {
        assertEquals("Adam", priest.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(200, priest.getHealth());
    }

    @Test
    public void hasHealingTool() {
        assertEquals(HealingTool.POTION, priest.getHealingTool());
    }

    @Test
    public void canChangeHealingTool() {
        priest.setHealingTool(HealingTool.HERB);
        assertEquals(HealingTool.HERB, priest.getHealingTool());
    }

    @Test
    public void canHealPlayer() {
        player = new Knight("Oskar", 300, Weapon.SWORD, Armour.SILVER);
        priest.healPlayer(player);
        assertEquals(400, player.getHealth());
    }
}
