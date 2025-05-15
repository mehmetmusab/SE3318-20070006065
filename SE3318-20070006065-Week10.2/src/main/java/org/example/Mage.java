package org.example;

/**
 * Mage character class.
 */
public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 30);
    }

    @Override
    public void defend() {
        health += 8; // Mage's defend
    }
}
