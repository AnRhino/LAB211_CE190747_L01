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
 */
/**
 * Internship represents a candidate who is currently an intern.
 */
public class Internship extends Candidate {

    private String majors; // Candidate's majors
    private String semester; // Candidate's semester
    private String university; // Candidate's university

    /**
     * Constructs an Internship candidate with the specified details.
     * 
     * @param candidateID the candidate's ID
     * @param firstName   the candidate's first name
     * @param lastName    the candidate's last name
     * @param birthYear   the candidate's birth year
     * @param address     the candidate's address
     * @param phone       the candidate's phone number
     * @param email       the candidate's email address
     * @param majors      the candidate's majors
     * @param semester    the candidate's semester
     * @param university  the candidate's university
     */
    public Internship(String candidateID, String firstName, String lastName, int birthYear, String address,
            String phone, String email, String majors, String semester, String university) {
        super(candidateID, firstName, lastName, birthYear, address, phone, email); // Call the parent constructor
        this.majors = majors; // Set majors
        this.semester = semester; // Set semester
        this.university = university; // Set university name
    }

    /**
     * Converts the internship candidate's properties to an array.
     * 
     * @return an array of the internship candidate's properties
     */
    @Override
    public Object[] toArrayOfProperties() {
        return new Object[] {
                getId(), // Get candidate ID
                getFirstName(), // Get candidate first name
                getLastName(), // Get candidate last name
                getBirthYear(), // Get candidate birth year
                getAddress(), // Get candidate address
                getPhone(), // Get candidate phone number
                getEmail(), // Get candidate email address
                majors, // Get majors
                semester, // Get semester
                university // Get university name
        };
    }

}
