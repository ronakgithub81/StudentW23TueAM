/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentw23tueam;

/**
 * date: 24th Jan 2023  for PULL command
 * @author Ronak
 */
public class StudentList {
    
    public static void main(String[] args){
        
        //StudentW23Fri s1 = new StudentW23Fri("s1","ronak");
        StudentW23TueAM[] StudentList = new StudentW23TueAM[3];
        StudentList[0]=new StudentW23TueAM("s1","ronak");
        StudentList[1]=new StudentW23TueAM("s2","abc");
        StudentList[2]=new StudentW23TueAM("s3","xyz");
        
        for(int i = 0 ;i<StudentList.length;i++){
            System.out.println(StudentList[i].getStudentName());
        }
        
    }//end of main    
}//end of class
