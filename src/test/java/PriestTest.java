import Enums.HealingTool;
import Enums.MythicalCreature;
import Enums.Spell;
import Players.Healers.Priest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriestTest {

    Priest priest;

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

}
