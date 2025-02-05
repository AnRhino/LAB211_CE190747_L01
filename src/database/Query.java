/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;

/**
 * L01 - Create a Java console program to manage Candidates of company
 * 
 * @author Nguyen Ho Phuoc An - CE190747
 * 
 * Last modified: 5/2/2025
 */
/**
 * Query class provides methods to manage candidate data.
 */
public class Query {

    private static final ArrayList<Candidate> experienceList = new ArrayList<>();
    private static final ArrayList<Candidate> fresherList = new ArrayList<>();
    private static final ArrayList<Candidate> intershipList = new ArrayList<>();

    /**
     * Retrieves the list of candidates based on the specified type.
     * 
     * @param type the type of candidates to retrieve
     * @return the list of candidates
     */
    public static ArrayList<Candidate> getList(int type) {
        // Switch based on the candidate type
        switch (type) {
            // Return the experience list for type 0
            case 0:
                return experienceList;
            // Return the fresher list for type 1
            case 1:
                return fresherList;
            // Return the internship list for type 2
            case 2:
                return intershipList;
        }
        // Return null if the type is invalid
        return null;
    }

    /**
     * Adds a new candidate to the specified list.
     * 
     * @param candidate the candidate to add
     * @param type      the type of candidate
     */
    public static void addNew(Candidate candidate, int type) {
        // Get the appropriate list based on the candidate type
        ArrayList<Candidate> list = getList(type);
        // Add the new candidate to the list
        list.add(candidate);
    }

    /**
     * Deletes a candidate from the specified list.
     * 
     * @param candidate the candidate to delete
     * @param type      the type of candidate
     */
    public static void delete(Candidate candidate, int type) {
        // Get the appropriate list based on the candidate type
        ArrayList<Candidate> list = getList(type);
        // Remove the candidate from the list
        list.remove(candidate);
    }

    private static ArrayList<Candidate> findById(ArrayList<Candidate> list, String id, boolean matchCase,
            boolean matchWord) {
        // Create a list to store found candidates
        ArrayList<Candidate> findList = new ArrayList<>();
        // Iterate through each candidate in the list
        list.forEach(candidate -> {
            // Check if matching by word
            if (matchWord) {
                // Check if matching case-sensitive
                if (matchCase) {
                    // Add candidate if ID matches exactly
                    if (candidate.getId().equals(id)) {
                        findList.add(candidate);
                    }
                } else {
                    // Add candidate if ID matches ignoring case
                    if (candidate.getId().equalsIgnoreCase(id)) {
                        findList.add(candidate);
                    }
                }
            } else {
                // Check if matching case-sensitive
                if (matchCase) {
                    // Add candidate if ID contains the search string
                    if (candidate.getId().contains(id)) {
                        findList.add(candidate);
                    }
                } else {
                    // Add candidate if ID contains the search string ignoring case
                    if (candidate.getId().contains(id.toUpperCase())) {
                        findList.add(candidate);
                    }
                }
            }
        });
        // Return the list of found candidates
        return findList;
    }

    private static ArrayList<Candidate> findByName(ArrayList<Candidate> list, String name, boolean matchCase,
            boolean matchWord) {
        // Create a list to store found candidates
        ArrayList<Candidate> findList = new ArrayList<>();
        // Iterate through each candidate in the list
        list.forEach(candidate -> {
            // Check if matching by word
            if (matchWord) {
                // Check if matching case-sensitive
                if (matchCase) {
                    // Add candidate if first or last name matches exactly
                    if (candidate.getFirstName().equals(name)
                            || candidate.getLastName().equals(name)) {
                        findList.add(candidate);
                    }
                } else {
                    // Add candidate if first or last name matches ignoring case
                    if (candidate.getFirstName().equalsIgnoreCase(name)
                            || candidate.getLastName().equalsIgnoreCase(name)) {
                        findList.add(candidate);
                    }
                }
            } else {
                // Check if matching case-sensitive
                if (matchCase) {
                    // Add candidate if first or last name contains the search string
                    if (candidate.getFirstName().contains(name)
                            || candidate.getLastName().contains(name)) {
                        findList.add(candidate);
                    }
                } else {
                    // Add candidate if first or last name contains the search string ignoring case
                    if (candidate.getFirstName().toLowerCase().contains(name.toLowerCase())
                            || candidate.getLastName().toLowerCase().contains(name.toLowerCase())) {
                        findList.add(candidate);
                    }
                }
            }
        });
        // Return the list of found candidates
        return findList;
    }

    public static ArrayList<Candidate> find(String id, String name, boolean matchCase, boolean matchWord, int type) {
        // Get the appropriate list based on the candidate type
        ArrayList<Candidate> list = getList(type);
        // If an ID is provided, search by ID
        if (!id.isEmpty()) {
            list = findById(list, id, matchCase, matchWord);
        }
        // If a name is provided, search by name
        if (!name.isEmpty()) {
            list = findByName(list, name, matchCase, matchWord);
        }
        // Return the final list of candidates
        return list;
    }

    public static Object[] getPropertiesById(String id, int type) {
        // Get the appropriate list based on the candidate type
        ArrayList<Candidate> list = getList(type);
        // Retrieve the candidate's properties by ID
        return findById(list, id, true, true).get(0).toArrayOfProperties();
    }

    public static ArrayList<String> getIdList(int type) {
        // Get the appropriate list based on the candidate type
        ArrayList<Candidate> list = getList(type);
        // Create a list to store candidate IDs
        ArrayList<String> idList = new ArrayList<>();
        // Iterate through each candidate in the list
        list.forEach(candidate -> {
            // Add the candidate's ID to the ID list
            idList.add(candidate.getId());
        });
        // Return the list of candidate IDs
        return idList;
    }
}
