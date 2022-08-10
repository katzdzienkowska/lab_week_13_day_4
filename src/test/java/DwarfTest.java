import Enums.Armour;
import Enums.Weapon;
import Players.WeaponMasters.Dwarf;
import Players.WeaponMasters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Zoltan", 200, Weapon.AXE, Armour.BRONZE);
    }

    @Test
    public void hasName() {
        assertEquals("Zoltan", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(200, dwarf.getHealth());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(Armour.BRONZE, dwarf.getArmour());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.setWeapon(Weapon.DAGGER);
        assertEquals(Weapon.DAGGER, dwarf.getWeapon());
    }

    @Test
    public void canChangeArmour() {
        dwarf.setArmour(Armour.GOLD);
        assertEquals(Armour.GOLD, dwarf.getArmour());
    }

}
