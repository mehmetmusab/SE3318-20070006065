package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Main game engine class.
 */
public class Game {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void startGame() {
        int turn = 0;
        boolean gameOver = false;

        while (!gameOver) {
            Character attacker = characters.get(turn % characters.size());
            Character defender = characters.get((turn + 1) % characters.size());

            attacker.specialAttack(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
                gameOver = true;
            }

            turn++;
        }
    }
}
