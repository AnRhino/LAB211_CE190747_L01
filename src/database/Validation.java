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
public class Validation {

    public static String checkId(String id, int type) throws Exception {
        id = id.trim().toUpperCase();
        if (id.isEmpty()) {
            throw new Exception("Id must not be empty");
        }
        if (database.Query.getIdList(type).contains(id)) {
            throw new Exception("Id already existed");
        }
        return id;
    }

    public static int checkBirthYear(String birthYear) throws Exception {
        try {
            int birthYearInt = Integer.parseInt(birthYear);
            int yearNow = java.time.LocalDate.now().getYear();
            if (birthYearInt < 1900 || birthYearInt > yearNow) {
                throw new Exception("Birth year must be between 1900 and " + yearNow);
            }
            return birthYearInt;
        } catch (NumberFormatException e) {
            throw new Exception("Birth year must be an integer");
        }
    }

    public static int checkGraduationYear(String graduationYear) throws Exception {
        try {
            int graduationYearInt = Integer.parseInt(graduationYear);
            int yearNow = java.time.LocalDate.now().getYear();
            if (graduationYearInt < 1900 || graduationYearInt > yearNow) {
                throw new Exception("Graduation year must be between 1900 and " + yearNow);
            }
            return graduationYearInt;
        } catch (NumberFormatException e) {
            throw new Exception("Graduation year must be an integer");
        }
    }

    public static String checkPhone(String phone) throws Exception {
        phone = phone.trim();
        if (phone.isEmpty()) {
            return "";
        }
        if (!phone.matches("^[0-9]+$")) {
            throw new Exception("Phone number must only contain digits");
        }
        if (phone.length() < 10) {
            throw new Exception("Minimum phone number length is 10");
        }
        return phone;
    }

    public static String checkEmail(String email) throws Exception {
        email = email.trim();
        if (email.isEmpty()) {
            return "";
        }
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new Exception("Email is invalid");
        }
        return email;
    }

    public static String checkName(String name) throws Exception {
        name = name.trim().replaceAll(" +", " ");
        if (name.isEmpty()) {
            throw new Exception("Name must not be empty");
        }
        return name;
    }

    public static int checkExpInYear(String expInYear) throws Exception {
        try {
            int expInYearInt = Integer.parseInt(expInYear);
            if (expInYearInt < 0 || expInYearInt > 100) {
                throw new Exception("Year of Experience must be between 0 and 100");
            }
            return expInYearInt;
        } catch (NumberFormatException e) {
            throw new Exception("Year of Experience must be an integer");
        }
    }
}
