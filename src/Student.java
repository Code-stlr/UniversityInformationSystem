
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private double gpa;

    /**
     * 
     */
    private int credits;

    /**
     * 
     */
    private int year;

    /**
     * 
     */
    private String major;

    /**
     * 
     */
    public void viewCourses() {
        // TODO implement here
    }

    /**
     * @param course
     */
    public void registerForCourse(Course course) {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewMarks() {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewTranscript() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getTranscript() {
        // TODO implement here
    }

    /**
     * @param teacher 
     * @param rating
     */
    public void rateTeacher(Teacher teacher, int rating) {
        // TODO implement here
    }

    /**
     * @param org
     */
    public void joinOrganization(StudentOrganization org) {
        // TODO implement here
    }

    /**
     * 
     */
    public void getInfo() {
        // TODO implement here
    }

    /**
     * @param course 
     * @return
     */
    public boolean canRegister(Course course) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public int getTotalCredits() {
        // TODO implement here
        return 0;
    }

    /**
     * @param course 
     * @return
     */
    public void dropCourse(Course course) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean checkRetakeLimit() {
        // TODO implement here
        return false;
    }

}