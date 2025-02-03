/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 * Experience represents a candidate with work experience.
 */
public class Experience extends Candidate {

    private int expInYear; // Years of experience
    private String proSkill; // Professional skills

    /**
     * Constructs an Experience candidate with the specified details.
     * @param candidateID the candidate's ID
     * @param firstName the candidate's first name
     * @param lastName the candidate's last name
     * @param birthYear the candidate's birth year
     * @param address the candidate's address
     * @param phone the candidate's phone number
     * @param email the candidate's email address
     * @param expInYear the candidate's years of experience
     * @param proSkill the candidate's professional skills
     */
    public Experience(String candidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, int expInYear, String proSkill) {
        super(candidateID, firstName, lastName, birthYear, address, phone, email); // Call the parent constructor
        this.expInYear = expInYear; // Set years of experience
        this.proSkill = proSkill; // Set professional skills
    }

    /**
     * Converts the experience candidate's properties to an array.
     * @return an array of the experience candidate's properties
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
            expInYear, // Get years of experience
            proSkill // Get professional skills
        };
    }

}
