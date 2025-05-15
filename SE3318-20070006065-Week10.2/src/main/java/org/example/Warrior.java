package org.example;

/**
 * Warrior character class.
 */
public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 10);
    }

    @Override
    public void defend() {
        health += 12; // Warrior's defend
    }
}
