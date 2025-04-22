package org.example;

import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        HogwartsStudent luna = new HogwartsStudent("Luna", "Ravenclaw", 4);

        System.out.println("Learning Spells:");
        System.out.println("Harry learns Expelliarmus: " + harry.learnSpell("Expelliarmus"));
        System.out.println("Draco learns Serpensortia: " + draco.learnSpell("Serpensortia"));
        System.out.println("Luna learns Lumos: " + luna.learnSpell("Lumos"));

        Spellbook book = new Spellbook();
        book.addSpell("Expelliarmus");
        book.addSpell("Expecto Patronum");
        book.addSpell("Lumos");
        book.addSpell("Levicorpus");

        System.out.println("\nSpells starting with 'Ex': " + book.getSpellsByPrefix("Ex"));

        MagicClassroom classRoom = new MagicClassroom();
        classRoom.addStudent(harry);
        classRoom.addStudent(draco);
        classRoom.addStudent(luna);

        System.out.println("\nFind by name: " + classRoom.findStudent("Luna"));
        System.out.println("Find by spell (Lumos): " + classRoom.findStudentBySpell("Lumos"));
        System.out.println("Students in Gryffindor: " + classRoom.getStudentsByHouse("Gryffindor"));
        System.out.println("Students sorted by house: " + classRoom.getStudentsSortedByHouse());

        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Lumos"));
        exam.evaluate(harry);
        exam.evaluate(luna);

        System.out.println("\nDuel 1:");
        Duel.start(harry, draco, "Expelliarmus");

        System.out.println("\nDuel 2:");
        Duel.start(luna, draco, "Levicorpus");
    }
}
