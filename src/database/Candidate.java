/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 * L01 - Create a Java console program to manage Candidates of company
 * 
 * @author Nguyen Ho Phuoc An - CE190747
 * 
 * Last modified: 5/2/2025
 */
/**
 * Candidate is an abstract class representing a candidate with personal
 * details.
 */
public abstract class Candidate {

    private String id; // Candidate ID
    private String firstName; // Candidate first name
    private String lastName; // Candidate last name
    private int birthYear; // Candidate birth year
    private String address; // Candidate address
    private String phone; // Candidate phone number
    private String email; // Candidate email address

    /**
     * Constructs a Candidate with the specified details.
     * 
     * @param id        the candidate's ID
     * @param firstName the candidate's first name
     * @param lastName  the candidate's last name
     * @param birthYear the candidate's birth year
     * @param address   the candidate's address
     * @param phone     the candidate's phone number
     * @param email     the candidate's email address
     */
    public Candidate(String id, String firstName, String lastName, int birthYear, String address, String phone,
            String email) {
        this.id = id; // Set candidate ID
        this.firstName = firstName; // Set candidate first name
        this.lastName = lastName; // Set candidate last name
        this.birthYear = birthYear; // Set candidate birth year
        this.address = address; // Set candidate address
        this.phone = phone; // Set candidate phone number
        this.email = email; // Set candidate email address
    }

    /**
     * Retrieves the candidate ID.
     * 
     * @return the candidate ID
     */
    public String getId() {
        return id; // Return candidate ID
    }

    /**
     * Retrieves the candidate's birth year.
     * 
     * @return the candidate birth year
     */
    public int getBirthYear() {
        return birthYear; // Return candidate birth year
    }

    /**
     * Retrieves the candidate's address.
     * 
     * @return the candidate address
     */
    public String getAddress() {
        return address; // Return candidate address
    }

    /**
     * Retrieves the candidate's phone number.
     * 
     * @return the candidate phone number
     */
    public String getPhone() {
        return phone; // Return candidate phone number
    }

    /**
     * Retrieves the candidate's email address.
     * 
     * @return the candidate email address
     */
    public String getEmail() {
        return email; // Return candidate email address
    }

    /**
     * Retrieves the candidate's first name.
     * 
     * @return the candidate first name
     */
    public String getFirstName() {
        return firstName; // Return candidate first name
    }

    /**
     * Retrieves the candidate's last name.
     * 
     * @return the candidate last name
     */
    public String getLastName() {
        return lastName; // Return candidate last name
    }

    /**
     * Converts the candidate's properties to an array.
     * 
     * @return an array of the candidate's properties
     */
    public abstract Object[] toArrayOfProperties();
}
