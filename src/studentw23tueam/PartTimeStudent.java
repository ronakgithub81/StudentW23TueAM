/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentw23tueam;

/**
 *
 * @author Ronak
 */
public class PartTimeStudent extends StudentW23TueAM{
    private int numofCourses;

    public PartTimeStudent(int numofCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numofCourses = numofCourses;
    }

    public int getNumofCourses() {
        return numofCourses;
    }

    public void setNumofCourses(int numofCourses) {
        this.numofCourses = numofCourses;
    }

   
    
    
}
