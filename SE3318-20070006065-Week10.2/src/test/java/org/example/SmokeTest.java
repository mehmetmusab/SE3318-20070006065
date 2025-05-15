package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmokeTest {

    @Test
    public void testWarriorAttack() {
        Character warrior = new Warrior("TestWarrior", 100, 20);
        Character mage = new Mage("TestMage", 80, 15);
        warrior.specialAttack(mage);
        assertTrue(mage.getHealth() < 80);
    }

    @Test
    public void testDefendIncreasesHealth() {
        Character mage = new Mage("TestMage", 70, 15);
        mage.defend();
        assertEquals(78, mage.getHealth());
    }
}
