/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;

/**
 *
 * @author PeterNguyen
 */
public class Query {

    private static final ArrayList<Candidate> experienceList = new ArrayList<>();
    private static final ArrayList<Candidate> fresherList = new ArrayList<>();
    private static final ArrayList<Candidate> intershipList = new ArrayList<>();

    public static ArrayList<Candidate> getList(int type) {
        switch (type) {
            case 0:
                return experienceList;
            case 1:
                return fresherList;
            case 2:
                return intershipList;
        }
        return null;
    }

    public static void addNew(Candidate candidate, int type) {
        ArrayList<Candidate> list = getList(type);
        list.add(candidate);
    }

    public static void delete(Candidate candidate, int type) {
        ArrayList<Candidate> list = getList(type);
        list.remove(candidate);
    }

    private static ArrayList<Candidate> findById(ArrayList<Candidate> list, String id, boolean matchCase, boolean matchWord) {
        ArrayList<Candidate> findList = new ArrayList<>();
        list.forEach(candidate -> {
            if (matchWord) {
                if (matchCase) {
                    if (candidate.getId().equals(id)) {
                        findList.add(candidate);
                    }
                } else {
                    if (candidate.getId().equalsIgnoreCase(id)) {
                        findList.add(candidate);
                    }
                }
            } else {
                if (matchCase) {
                    if (candidate.getId().contains(id)) {
                        findList.add(candidate);
                    }
                } else {
                    if (candidate.getId().contains(id.toUpperCase())) {
                        findList.add(candidate);
                    }
                }
            }
        });
        return findList;
    }

    private static ArrayList<Candidate> findByName(ArrayList<Candidate> list, String name, boolean matchCase, boolean matchWord) {
        ArrayList<Candidate> findList = new ArrayList<>();
        list.forEach(candidate -> {
            if (matchWord) {
                if (matchCase) {
                    if (candidate.getFirstName().equals(name)
                            || candidate.getLastName().equals(name)) {
                        findList.add(candidate);
                    }
                } else {
                    if (candidate.getFirstName().equalsIgnoreCase(name)
                            || candidate.getLastName().equalsIgnoreCase(name)) {
                        findList.add(candidate);
                    }
                }
            } else {
                if (matchCase) {
                    if (candidate.getFirstName().contains(name)
                            || candidate.getLastName().contains(name)) {
                        findList.add(candidate);
                    }
                } else {
                    if (candidate.getFirstName().toLowerCase().contains(name.toLowerCase())
                            || candidate.getLastName().toLowerCase().contains(name.toLowerCase())) {
                        findList.add(candidate);
                    }
                }
            }
        });
        return findList;
    }

    public static ArrayList<Candidate> find(String id, String name, boolean matchCase, boolean matchWord, int type) {
        ArrayList<Candidate> list = getList(type);
        if (!id.isEmpty()) {
            list = findById(list, id, matchCase, matchWord);
        }
        if (!name.isEmpty()) {
            list = findByName(list, name, matchCase, matchWord);
        }
        return list;
    }

    public static Object[] getPropertiesById(String id, int type) {
        ArrayList<Candidate> list = getList(type);
        return findById(list, id, true, true).get(0).toArrayOfProperties();
    }

    public static ArrayList<String> getIdList(int type) {
        ArrayList<Candidate> list = getList(type);
        ArrayList<String> idList = new ArrayList<>();
        list.forEach(candidate -> {
            idList.add(candidate.getId());
        });
        return idList;
    }
}
