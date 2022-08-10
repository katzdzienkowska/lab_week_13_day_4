import Enums.Armour;
import Enums.Weapon;
import Players.WeaponMasters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Oskar", 300, Weapon.SWORD, Armour.SILVER);
    }

    @Test
    public void hasName() {
        assertEquals("Oskar", knight.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(300, knight.getHealth());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.SWORD, knight.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(Armour.SILVER, knight.getArmour());
    }

    @Test
    public void canChangeWeapon() {
        knight.setWeapon(Weapon.DAGGER);
        assertEquals(Weapon.DAGGER, knight.getWeapon());
    }

    @Test
    public void canChangeArmour() {
        knight.setArmour(Armour.GOLD);
        assertEquals(Armour.GOLD, knight.getArmour());
    }
}
