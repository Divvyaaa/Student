/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author srini
 */
public class PartTimeStudent extends Students {

    private int numCourses;

    public PartTimeStudent(String studentId, String studentName, int numCourse) {
        super(studentId, studentName);
        this.numCourses = numCourse;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
