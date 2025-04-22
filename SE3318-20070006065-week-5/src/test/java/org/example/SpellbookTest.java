
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SpellbookTest {

    @Test
    public void testRetrieveSpellByIndex() {
        Spellbook book = new Spellbook();
        book.addSpell("Lumos");
        assertEquals("Lumos", book.getSpell(0));
    }

    @Test
    public void testInvalidIndex() {
        Spellbook book = new Spellbook();
        assertThrows(IndexOutOfBoundsException.class, () -> book.getSpell(5));
    }

    @Test
    public void testGetSpellsByPrefixExactMatch() {
        Spellbook book = new Spellbook();
        book.addSpell("Alohomora");
        List<String> spells = book.getSpellsByPrefix("Alo");
        assertTrue(spells.contains("Alohomora"));
    }

    @Test
    public void testGetSpellsByEmptyPrefix() {
        Spellbook book = new Spellbook();
        book.addSpell("Lumos");
        assertFalse(book.getSpellsByPrefix("").isEmpty());
    }

    @Test
    public void testGetSpellsByNoMatch() {
        Spellbook book = new Spellbook();
        book.addSpell("Lumos");
        assertTrue(book.getSpellsByPrefix("Avada").isEmpty());
    }
}
