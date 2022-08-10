package Rooms;
import Enums.Enemy;
import Enums.Treasure;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Treasure> treasures;
    private ArrayList<Enemy> enemies;

    public Room(String name) {
        this.name = name;
        this.treasures = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void removeTreasure(Treasure treasure) {
        this.treasures.remove(treasure);
    }

    public void removeEnemy(Enemy enemy) {
        this.enemies.remove(enemy);
    }

    public int countTheTreasures() {
        return this.treasures.size();
    }

    public int countTheEnemies() {
        return this.enemies.size();
    }
}
