import Enums.Armour;
import Enums.MythicalCreature;
import Enums.Spell;
import Enums.Weapon;
import Players.SpellCasters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Hurin", 500, Spell.LIGHTNING_STRIKE, MythicalCreature.OGRE);
    }

    @Test
    public void hasName() {
        assertEquals("Hurin", wizard.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, wizard.getHealth());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spell.LIGHTNING_STRIKE, wizard.getSpell());
    }

    @Test
    public void hasMythicalCreature() {
        assertEquals(MythicalCreature.OGRE, wizard.getMythicalCreature());
    }

    @Test
    public void canChangeSpell() {
        wizard.setSpell(Spell.FIREBALL);
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canChangeMythicalCreature() {
        wizard.setMythicalCreature(MythicalCreature.DRAGON);
        assertEquals(MythicalCreature.DRAGON, wizard.getMythicalCreature());
    }

}
