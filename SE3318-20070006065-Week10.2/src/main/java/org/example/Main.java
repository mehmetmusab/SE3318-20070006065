package org.example;

/**
 * Entry point of the Character Battle game.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.addCharacter(new Warrior("Thor", 100, 25));
        game.addCharacter(new Mage("Gandalf", 80, 30));
        game.startGame();
    }
}
