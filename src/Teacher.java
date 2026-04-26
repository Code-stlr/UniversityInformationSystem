
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Teacher extends Employee implements Researcher {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    private TeacherType teacherType;


    /**
     * 
     */
    public void viewCourses() {
        // TODO implement here
    }

    /**
     * @param student 
     * @param course 
     * @param mark
     */
    public void putMark(Student student, Course course, Mark mark) {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewStudents() {
        // TODO implement here
    }

    /**
     * @param student 
     * @param urgency
     */
    public void sendComplaint(Student student, UrgencyLevel urgency) {
        // TODO implement here
    }

    /**
     * @param course
     */
    public void manageCourse(Course course) {
        // TODO implement here
    }

    /**
     * 
     */
    public void getInfo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getHIndex() {
        // TODO implement Researcher.getHIndex() here
    }

    /**
     * @param c
     */
    public void printPapers(Comparator c) {
        // TODO implement Researcher.printPapers() here
    }

    /**
     * 
     */
    public void getPapers() {
        // TODO implement Researcher.getPapers() here
    }

    /**
     * @param paper
     */
    public void addPaper(ResearchPaper paper) {
        // TODO implement Researcher.addPaper() here
    }

    /**
     * @param project
     */
    public void joinProject(ResearchProject project) {
        // TODO implement Researcher.joinProject() here
    }

}