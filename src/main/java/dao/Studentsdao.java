package dao;

import Interface.sesion9;
import models.Students;

import java.util.ArrayList;

public class Studentsdao implements sesion9 {

    ArrayList<Students> students = new ArrayList<>();

    @Override
    public boolean store(object object) {
        Students student = (Students) object;
        try {
            students.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByName(String name) {

        for (Students student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }

        System.out.println("No se encontró el estudiante");

    }
}
