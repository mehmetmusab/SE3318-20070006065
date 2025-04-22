package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class WizardExamTest {

    @Test
    public void testPassWhenAllSpellsKnown() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        student.learnSpell("Expelliarmus");
        student.learnSpell("Lumos");
        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Lumos"));
        assertTrue(exam.pass(student));
    }

    @Test
    public void testFailWhenNotAllSpellsKnown() {
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 5);
        student.learnSpell("Lumos");
        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Lumos"));
        assertFalse(exam.pass(student));
    }

    @Test
    public void testEvaluatePrintsCorrectResult() {
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 5);
        student.learnSpell("Lumos");
        WizardExam exam = new WizardExam(Arrays.asList("Lumos"));
        exam.evaluate(student);
    }
}
