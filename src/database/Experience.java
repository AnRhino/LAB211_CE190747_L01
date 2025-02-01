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
public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience(String candidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, int expInYear, String proSkill) {
        super(candidateID, firstName, lastName, birthYear, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
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
            getPhone(),
            getEmail(),
            expInYear,
            proSkill
        };
    }

}
