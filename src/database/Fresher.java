/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 * Fresher represents a candidate who has recently graduated.
 */
public class Fresher extends Candidate {

    private final int graduationYear; // Graduation year
    private final String graduationRank; // Graduation rank
    private final String university; // University name

    /**
     * Constructs a Fresher candidate with the specified details.
     * @param candidateID the candidate's ID
     * @param firstName the candidate's first name
     * @param lastName the candidate's last name
     * @param yearOfBirth the candidate's birth year
     * @param address the candidate's address
     * @param phone the candidate's phone number
     * @param email the candidate's email address
     * @param graduationYear the candidate's graduation year
     * @param graduationRank the candidate's graduation rank
     * @param university the candidate's university
     */
    public Fresher(String candidateID, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, int graduationYear, String graduationRank, String university) {
        super(candidateID, firstName, lastName, yearOfBirth, address, phone, email); // Call the parent constructor
        this.graduationYear = graduationYear; // Set graduation year
        this.graduationRank = graduationRank; // Set graduation rank
        this.university = university; // Set university name
    }

    /**
     * Converts the fresher candidate's properties to an array.
     * @return an array of the fresher candidate's properties
     */
    @Override
    public Object[] toArrayOfProperties() {
        return new Object[]{
            getId(), // Get candidate ID
            getFirstName(), // Get candidate first name
            getLastName(), // Get candidate last name
            getBirthYear(), // Get candidate birth year
            getAddress(), // Get candidate address
            getPhone(), // Get candidate phone number
            getEmail(), // Get candidate email address
            graduationYear, // Get graduation year
            graduationRank, // Get graduation rank
            university // Get university name
        };
    }

}
