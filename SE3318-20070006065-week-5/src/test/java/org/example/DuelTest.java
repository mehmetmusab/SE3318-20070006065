package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuelTest {

    @Test
    public void testDuelBothKnowSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Expelliarmus");
        Duel.start(harry, draco, "Expelliarmus");
    }

    @Test
    public void testDuelOnlyOneKnowsSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        harry.learnSpell("Expelliarmus");
        Duel.start(harry, draco, "Expelliarmus");
    }

    @Test
    public void testDuelNeitherKnowsSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        Duel.start(harry, draco, "Avada Kedavra");
    }

    @Test
    public void testDuelWithNullSpellOrStudent() {
        assertThrows(IllegalArgumentException.class, () ->
                Duel.start(null, new HogwartsStudent("Draco", "Slytherin", 5), "Lumos"));
        assertThrows(IllegalArgumentException.class, () ->
                Duel.start(new HogwartsStudent("Harry", "Gryffindor", 5), null, "Lumos"));
        assertThrows(IllegalArgumentException.class, () ->
                Duel.start(new HogwartsStudent("Harry", "Gryffindor", 5), new HogwartsStudent("Draco", "Slytherin", 5), null));
    }
}
