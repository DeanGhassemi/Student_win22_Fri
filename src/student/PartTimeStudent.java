/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author deang
 */
public class PartTimeStudent extends Student{
    
    private int numCourses;

    public PartTimeStudent(String name, String address, int numCourses) {
        super(name, address);
        this.numCourses = numCourses;
    }
    
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    
}
