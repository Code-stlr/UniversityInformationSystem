
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Language language;

    /**
     * @param email 
     * @param password
     */
    public void login(String email, String password) {
        // TODO implement here
    }

    /**
     * 
     */
    public void logout() {
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
    public void toString() {
        // TODO implement here
    }

    /**
     * @param o
     */
    public void equals(Object o) {
        // TODO implement here
    }

    /**
     * 
     */
    public void hashCode() {
        // TODO implement here
    }

}