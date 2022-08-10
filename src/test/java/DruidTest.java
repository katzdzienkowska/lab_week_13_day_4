import Enums.MythicalCreature;
import Enums.Spell;
import Players.SpellCasters.Druid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DruidTest {

    Druid druid;

    @Before
    public void before() {
        druid = new Druid("White", 600, Spell.IMMOBILISATION, MythicalCreature.DRAGON);
    }

    @Test
    public void hasName() {
        assertEquals("White", druid.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(600, druid.getHealth());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spell.IMMOBILISATION, druid.getSpell());
    }

    @Test
    public void hasMythicalCreature() {
        assertEquals(MythicalCreature.DRAGON, druid.getMythicalCreature());
    }

    @Test
    public void canChangeSpell() {
        druid.setSpell(Spell.FIREBALL);
        assertEquals(Spell.FIREBALL, druid.getSpell());
    }

    @Test
    public void canChangeMythicalCreature() {
        druid.setMythicalCreature(MythicalCreature.OGRE);
        assertEquals(MythicalCreature.OGRE, druid.getMythicalCreature());
    }

}
