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
public class Internship extends Candidate {

    private String majors;
    private String semester;
    private String university;

    public Internship(String candidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, String majors, String semester, String university) {
        super(candidateID, firstName, lastName, birthYear, address, phone, email);
        this.majors = majors;
        this.semester = semester;
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
            majors,
            semester,
            university
        };
    }

}
