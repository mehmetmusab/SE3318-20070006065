package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class MagicClassroomTest {

    @Test
    public void testAddValidStudent() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 5);
        classroom.addStudent(student);
        assertNotNull(classroom.findStudent("Hermione"));
    }

    @Test
    public void testAddNullStudent() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(null);
        assertEquals(0, classroom.getAllStudents().size());
    }

    @Test
    public void testFindStudentByName() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 5);
        classroom.addStudent(student);
        assertEquals(student, classroom.findStudent("Ron"));  // Düzeltildi!
    }

    @Test
    public void testFindStudentBySpell() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Neville", "Gryffindor", 5);
        student.learnSpell("Lumos");
        classroom.addStudent(student);
        List<HogwartsStudent> result = Arrays.asList(classroom.findStudentBySpell("Lumos"));
        assertTrue(result.contains(student));
    }


    @Test
    public void testListStudentsByHouseSorting() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student1 = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent student2 = new HogwartsStudent("Draco", "Slytherin", 5);
        HogwartsStudent student3 = new HogwartsStudent("Luna", "Ravenclaw", 5);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        List<HogwartsStudent> gryffindors = classroom.getStudentsByHouse("Gryffindor");
        assertTrue(gryffindors.contains(student1));
    }
}
