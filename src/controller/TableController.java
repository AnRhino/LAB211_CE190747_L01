/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTable; // Import JTable for displaying data
import javax.swing.table.DefaultTableModel; // Import DefaultTableModel for table data model

/**
 * L01 - Create a Java console program to manage Candidates of company
 * 
 * @author Nguyen Ho Phuoc An - CE190747
 * 
 * Last modified: 5/2/2025
 */
/**
 * TableController is responsible for managing the display of candidate data in
 * a JTable.
 */
public class TableController {

    private final JTable table; // Declare a JTable to display candidate data

    /**
     * Constructs a TableController for the specified JTable.
     * 
     * @param table the JTable to be controlled
     */
    public TableController(JTable table) {
        this.table = table; // Initialize the table
    }

    /**
     * Displays the list of candidates in the JTable.
     * 
     * @param list the list of candidates to display
     */
    public void display(java.util.ArrayList<database.Candidate> list) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel(); // Get the table model
        while (tableModel.getRowCount() > 0) { // While there are rows in the table
            tableModel.removeRow(0); // Remove the first row
        }
        list.forEach(candidate -> { // For each candidate in the list
            tableModel.addRow(candidate.toArrayOfProperties()); // Add candidate properties as a new row
        });
    }
}
