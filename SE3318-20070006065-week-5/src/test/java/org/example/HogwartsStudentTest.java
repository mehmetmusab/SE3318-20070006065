package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HogwartsStudentTest {

    @Test
    public void testLearnValidSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        assertTrue(student.learnSpell("Expelliarmus"));
        assertTrue(student.knowsSpell("Expelliarmus"));
    }

    @Test
    public void testLearnNullSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        assertFalse(student.learnSpell(null));
    }

    @Test
    public void testLearnDuplicateSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        student.learnSpell("Lumos");
        assertFalse(student.learnSpell("Lumos"));
    }

    @Test
    public void testKnowsSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        student.learnSpell("Expecto Patronum");
        assertTrue(student.knowsSpell("Expecto Patronum"));
        assertFalse(student.knowsSpell("Avada Kedavra"));
    }
}
