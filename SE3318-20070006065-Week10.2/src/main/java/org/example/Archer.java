package org.example;

/**
 * Archer character class.
 */
public class Archer extends Character {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }

    @Override
    public void defend() {
        health += 5; // Archer's custom defend
    }
}
