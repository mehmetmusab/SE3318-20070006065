package org.example;

/**
 * Base class for all characters in the game.
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    /**
     * Constructs a new character.
     */
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Unknown";
        }
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void defend() {
        health += 10; // simple defend implementation
    }

    /**
     * Abstract special attack method.
     */
    public abstract void specialAttack(Character opponent);

    public boolean isDefeated() {
        return health <= 0;
    }
}
