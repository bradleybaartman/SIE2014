/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.sicknote;

import java.io.Serializable;

/**
 *
 * @author 209215178
 */
public class Subject implements Serializable{
    
    private String subjectCode;
    private String subjectName;
    private String subjectDescription;
    private String subjectLevel;    
    
    public Subject(){}

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(String subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    @Override
    public String toString() {
        return "Subject{" + "Subject Code: " + subjectCode + ", Subject Name: " + subjectName + ", Subject Description: " + subjectDescription + " Subject Level: " + subjectLevel + '}';
    }
    
    
}
