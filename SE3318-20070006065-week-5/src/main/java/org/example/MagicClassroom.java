package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MagicClassroom {
    private List<HogwartsStudent> students;

    public MagicClassroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(HogwartsStudent student) {
        if (student != null) {
            students.add(student);
        }
    }

    public HogwartsStudent findStudent(String name) {
        for (HogwartsStudent s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public HogwartsStudent findStudentBySpell(String spell) {
        for (HogwartsStudent s : students) {
            if (s.knowsSpell(spell)) {
                return s;
            }
        }
        return null;
    }

    public List<HogwartsStudent> getStudentsByHouse(String house) {
        return students.stream()
                .filter(s -> s.getHouse().equalsIgnoreCase(house))
                .collect(Collectors.toList());
    }

    public List<HogwartsStudent> getStudentsSortedByHouse() {
        return students.stream()
                .sorted(Comparator.comparing(HogwartsStudent::getHouse))
                .collect(Collectors.toList());
    }

    public List<HogwartsStudent> getAllStudents() {
        return students;
    }
}
