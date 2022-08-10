import Rooms.Room;
import Enums.Treasure;
import Enums.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room swamp;


    @Before
    public void before() {
        swamp = new Room("Swamp");
    }

    @Test
    public void hasName() {
        assertEquals("Swamp", swamp.getName());
    }

    @Test
    public void canGetTreasures() {
        assertEquals(0, swamp.getTreasures().size());
    }

    @Test
    public void canGetEnemies() {
        assertEquals(0, swamp.getEnemies().size());
    }

    @Test
    public void canAddTreasuresToRoom() {
        assertEquals(0, swamp.countTheTreasures());
        swamp.addTreasure(Treasure.GOLD);
        assertEquals(1, swamp.countTheTreasures());
    }

    @Test
    public void canAddEnemiesToRoom() {
        assertEquals(0, swamp.countTheEnemies());
        swamp.addEnemy(Enemy.TROLL);
        assertEquals(1, swamp.countTheEnemies());
    }

    @Test
    public void canRemoveTreasuresToRoom() {
        assertEquals(0, swamp.countTheTreasures());
        swamp.addTreasure(Treasure.GOLD);
        swamp.addTreasure(Treasure.GEMS);
        assertEquals(2, swamp.countTheTreasures());
        swamp.removeTreasure(Treasure.GOLD);
        assertEquals(1, swamp.countTheTreasures());
    }

    @Test
    public void canRemoveEnemiesToRoom() {
        assertEquals(0, swamp.countTheEnemies());
        swamp.addEnemy(Enemy.TROLL);
        swamp.addEnemy(Enemy.ORC);
        assertEquals(2, swamp.countTheEnemies());
        swamp.removeEnemy(Enemy.TROLL);
        assertEquals(1, swamp.countTheEnemies());
    }

}
