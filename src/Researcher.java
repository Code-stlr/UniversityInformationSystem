
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Researcher {

    /**
     * 
     */
    public void getHIndex();

    /**
     * @param c
     */
    public void printPapers(Comparator c);

    /**
     * 
     */
    public void getPapers();

    /**
     * @param paper
     */
    public void addPaper(ResearchPaper paper);

    /**
     * @param project
     */
    public void joinProject(ResearchProject project);

}