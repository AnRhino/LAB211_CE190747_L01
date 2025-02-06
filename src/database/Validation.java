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
 * Validation class provides methods to validate candidate data.
 */
public class Validation {

    /**
     * Validates the candidate ID.
     * 
     * @param id   the candidate ID to validate
     * @param type the type of candidate
     * @return the validated ID
     * @throws Exception if the ID is invalid
     */
    public static String checkId(String id, int type) throws Exception {
        // Trim and convert ID to uppercase
        id = id.trim().toUpperCase(); 
        // Check if ID is empty
        if (id.isEmpty()) { 
            // Throw exception if empty
            throw new Exception("Id must not be empty"); 
        }
        // Check if ID already exists
        if (database.Query.getIdList(type).contains(id)) { 
            // Throw exception if exists
            throw new Exception("Id already existed"); 
        }
        // Return validated ID
        return id; 
    }

    /**
     * Validates the birth year.
     * 
     * @param birthYear the birth year to validate
     * @return the validated birth year as an integer
     * @throws Exception if the birth year is invalid
     */
    public static int checkBirthYear(String birthYear) throws Exception {
        try {
            // Parse the birth year to an integer
            int birthYearInt = Integer.parseInt(birthYear);
            // Get the current year
            int yearNow = java.time.LocalDate.now().getYear();
            // Check if the birth year is within valid range
            if (birthYearInt < 1900 || birthYearInt > yearNow) {
                // Throw exception if invalid
                throw new Exception("Birth year must be between 1900 and " + yearNow);
            }
            // Return validated birth year
            return birthYearInt;
        } catch (NumberFormatException e) {
            // Throw exception if parsing fails
            throw new Exception("Birth year must be an integer");
        }
    }

    /**
     * Validates the graduation year.
     * 
     * @param graduationYear the graduation year to validate
     * @return the validated graduation year as an integer
     * @throws Exception if the graduation year is invalid
     */
    public static int checkGraduationYear(String graduationYear) throws Exception {
        try {
            // Parse the graduation year to an integer
            int graduationYearInt = Integer.parseInt(graduationYear);
            // Get the current year
            int yearNow = java.time.LocalDate.now().getYear();
            // Check if the graduation year is within valid range
            if (graduationYearInt < 1900 || graduationYearInt > yearNow) {
                // Throw exception if invalid
                throw new Exception("Graduation year must be between 1900 and " + yearNow);
            }
            // Return validated graduation year
            return graduationYearInt;
        } catch (NumberFormatException e) {
            // Throw exception if parsing fails
            throw new Exception("Graduation year must be an integer");
        }
    }

    /**
     * Validates the phone number.
     * 
     * @param phone the phone number to validate
     * @return the validated phone number
     * @throws Exception if the phone number is invalid
     */
    public static String checkPhone(String phone) throws Exception {
        // Trim the phone number
        phone = phone.trim();
        // Check if phone number is empty
        if (phone.isEmpty()) {
            // Return empty string if it is
            return "";
        }
        // Check if phone number contains only digits
        if (!phone.matches("^[0-9]+$")) {
            // Throw exception if invalid
            throw new Exception("Phone number must only contain digits");
        }
        // Check if phone number length is less than 10
        if (phone.length() < 10) {
            // Throw exception if invalid
            throw new Exception("Minimum phone number length is 10");
        }
        // Return validated phone number
        return phone;
    }

    /**
     * Validates the email address.
     * 
     * @param email the email address to validate
     * @return the validated email address
     * @throws Exception if the email address is invalid
     */
    public static String checkEmail(String email) throws Exception {
        // Trim the email address
        email = email.trim();
        // Check if email address is empty
        if (email.isEmpty()) {
            // Return empty string if it is
            return "";
        }
        // Check if email address matches the regex pattern
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            // Throw exception if invalid
            throw new Exception("Email is invalid");
        }
        // Return validated email address
        return email;
    }

    /**
     * Validates the candidate's name.
     * 
     * @param name the name to validate
     * @return the validated name
     * @throws Exception if the name is invalid
     */
    public static String checkName(String name) throws Exception {
        // Trim and replace multiple spaces with a single space
        name = name.trim().replaceAll(" +", " ");
        // Check if name is empty
        if (name.isEmpty()) {
            // Throw exception if empty
            throw new Exception("Name must not be empty");
        }
        // Return validated name
        return name;
    }

    /**
     * Validates the years of experience.
     * 
     * @param expInYear the years of experience to validate
     * @return the validated years of experience as an integer
     * @throws Exception if the years of experience are invalid
     */
    public static int checkExpInYear(String expInYear) throws Exception {
        try {
            // Parse the years of experience to an integer
            int expInYearInt = Integer.parseInt(expInYear);
            // Check if the years of experience are within valid range
            if (expInYearInt < 0 || expInYearInt > 100) {
                // Throw exception if invalid
                throw new Exception("Year of Experience must be between 0 and 100");
            }
            // Return validated years of experience
            return expInYearInt;
        } catch (NumberFormatException e) {
            // Throw exception if parsing fails
            throw new Exception("Year of Experience must be an integer");
        }
    }
}
