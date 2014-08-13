/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.sicknote;

/**
 *
 * @author 209215178
 */
public class Student {
    
    private String studentBarcode;
    private String studentNumber;
    private String studentName;
    private String studentSurname;
    private int studentphNumber;
    private String studentEmail;
    private String studentDOB;
    private String studentDOR; 
    
    public Student(){};
    
    public String getStudentBarcode() {
        return studentBarcode;
    }

    public int getStudentphNumber() {
        return studentphNumber;
    }

    public void setStudentphNumber(int studentphNumber) {
        this.studentphNumber = studentphNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentBarcode(String studentBarcode) {
        this.studentBarcode = studentBarcode;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentDOR() {
        return studentDOR;
    }

    public void setStudentDOR(String studentDOR) {
        this.studentDOR = studentDOR;
    }

    @Override
    public String toString() {
        return "Student{" + "studentBarcode=" + studentBarcode + ", studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentSurname=" + studentSurname + ", studentphNumber=" + studentphNumber + ", studentEmail=" + studentEmail + ", studentDOB=" + studentDOB + ", studentDOR=" + studentDOR + '}';
    }
    
    
}
