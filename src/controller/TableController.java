/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PeterNguyen
 */
public class TableController {

    private final JTable table;

    public TableController(JTable table) {
        this.table = table;
    }

    public void display(java.util.ArrayList<database.Candidate> list) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        list.forEach(candidate -> {
            tableModel.addRow(candidate.toArrayOfProperties());
        });
    }
}
