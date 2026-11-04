
package com.ups.studentmanagement.service;

import com.ups.studentmanagement.dao.StudentDAO;
import com.ups.studentmanagement.model.Student;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public void addStudent(int id, String name) {
        Student student = new Student(id, name);
        dao.addStudent(student);
    }

    public void viewStudents() {
        dao.viewStudents();
    }

    public void updateStudent(int id, String name) {
        dao.updateStudent(id, name);
    }

    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }
}
