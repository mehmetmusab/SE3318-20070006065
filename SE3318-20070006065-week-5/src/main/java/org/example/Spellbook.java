package org.example;


import java.util.ArrayList;
import java.util.List;

public class Spellbook {
    private List<String> allSpells;

    public Spellbook() {
        this.allSpells = new ArrayList<>();
    }

    /**
     * @requires spell != null && spell is not already in allSpells
     * @effects Adds the spell to the spellbook
     */
    public void addSpell(String spell) {
        if (spell != null && !allSpells.contains(spell)) {
            allSpells.add(spell);
        }
    }

    /**
     * @requires index >= 0 && index < allSpells.size()
     * @effects Returns spell at the given index
     */
    public String getSpell(int index) {
        return allSpells.get(index);
    }

    /**
     * Declarative Spec 1:
     * @requires prefix != null
     * @effects Returns list of spells starting with prefix
     *
     * Declarative Spec 2:
     * @requires prefix is a non-empty string
     * @effects Resulting list includes only spells s such that s.startsWith(prefix)
     *
     * Declarative Spec 3:
     * @requires allSpells != null
     * @effects The result contains every spell in allSpells where spell begins with prefix
     */
    public List<String> getSpellsByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String spell : allSpells) {
            if (spell.startsWith(prefix)) {
                result.add(spell);
            }
        }
        return result;
    }

    /**
     * @effects Returns full list of all spells in the spellbook
     */
    public List<String> getAllSpells() {
        return allSpells;
    }
}