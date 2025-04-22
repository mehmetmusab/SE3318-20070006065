package org.example;

import java.util.HashSet;
import java.util.Set;

public class HogwartsStudent {
    private String name;
    private String house;
    private int year;
    private Set<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }

    /**
     * @requires spell != null && !spellsLearned.contains(spell)
     * @effects Adds spell to student's known spells
     * @return true if spell added, false otherwise
     */
    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) return false;
        return spellsLearned.add(spell);
    }

    /**
     * @requires spell != null
     * @effects Checks if student knows spell
     * @return true if known, false otherwise
     */
    public boolean knowsSpell(String spell) {
        return spell != null && spellsLearned.contains(spell);
    }

    public String getName() { return name; }

    public String getHouse() { return house; }

    public int getYear() { return year; }

    public Set<String> getSpellsLearned() { return spellsLearned; }

    @Override
    public String toString() {
        return name + " (" + house + ", Year " + year + ")";
    }
}