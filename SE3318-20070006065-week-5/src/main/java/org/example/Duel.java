package org.example;

import java.util.Random;

public class Duel {

    /**
     * @requires s1 != null && s2 != null && spell != null
     * @effects Starts a duel and prints result
     */
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        System.out.println(s1.getName() + " vs " + s2.getName() + " using spell: " + spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("Draw! Neither knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins!");
        } else {
            Random rand = new Random();
            HogwartsStudent winner = rand.nextBoolean() ? s1 : s2;
            System.out.println("Both know the spell. " + winner.getName() + " wins by magic strength!");
        }
    }
}