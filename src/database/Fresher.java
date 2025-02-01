/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author PeterNguyen
 */
public class Fresher extends Candidate {

    private final int graduationYear;
    private final String graduationRank;
    private final String university;

    public Fresher(String candidateID, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, int graduationYear, String graduationRank, String university) {
        super(candidateID, firstName, lastName, yearOfBirth, address, phone, email);
        this.graduationYear = graduationYear;
        this.graduationRank = graduationRank;
        this.university = university;
    }

    @Override
    public Object[] toArrayOfProperties() {
        return new Object[]{
            getId(),
            getFirstName(),
            getLastName(),
            getBirthYear(),
            getAddress(),
            getPhone(),
            getEmail(),
            graduationYear,
            graduationRank,
            university
        };
    }

}
