/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * L01 - Create a Java console program to manage Candidates of company
 * 
 * @author Nguyen Ho Phuoc An - CE190747
 * 
 * Last modified: 5/2/2025
 */
/**
 * InternshipPanel is a GUI panel for managing internship candidates.
 */
public class InternshipPanel extends javax.swing.JPanel {

    private final controller.TableController tableController; // Controller for managing table data
    private final int candidateType = 2; // Type for internship candidates
    private boolean canAdd; // Flag to check if a candidate can be added

    /**
     * Creates new form InternshipPanel.
     */
    public InternshipPanel() {
        initComponents(); // Initialize components
        tableController = new controller.TableController(tbData); // Create a new TableController
        tbData.setVisible(true); // Make the table visible
        setVisible(true); // Make the panel visible
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtBirthYear = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMajor = new javax.swing.JTextField();
        txtUniversity = new javax.swing.JTextField();
        btnAddNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtFindId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFindName = new javax.swing.JTextField();
        cbMatchCase = new javax.swing.JCheckBox();
        cbMatchWord = new javax.swing.JCheckBox();
        btnFindAll = new javax.swing.JButton();
        btnCancel2 = new javax.swing.JButton();

        tbData.setAutoCreateRowSorter(true);
        tbData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First name", "Last name", "Birth year", "Address", "Phone", "Email", "Major", "Semester", "University"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.getTableHeader().setReorderingAllowed(false);
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbDataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INTERNSHIP");

        jLabel1.setText("Id *");

        jLabel3.setText("First name *");

        jLabel4.setText("Last name *");

        jLabel5.setText("Birth year *");

        jLabel6.setText("Address");

        jLabel7.setText("Phone");

        jLabel8.setText("Email");

        jLabel9.setText("Major");

        jLabel10.setText("Semester");

        btnAddNew.setText("Add New");
        btnAddNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddNewMousePressed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });

        btnCancel1.setText("Cancel");
        btnCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancel1MousePressed(evt);
            }
        });

        jLabel11.setText("University");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMajor)
                    .addComponent(txtEmail)
                    .addComponent(txtPhone)
                    .addComponent(txtAddress)
                    .addComponent(txtBirthYear)
                    .addComponent(txtLastName)
                    .addComponent(txtFirstName)
                    .addComponent(txtId)
                    .addComponent(txtUniversity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSemester)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNew)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)))
        );

        jLabel12.setText("Id");

        jLabel13.setText("Name");

        cbMatchCase.setText("Match case");

        cbMatchWord.setText("Match whole words");

        btnFindAll.setText("Find All");
        btnFindAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFindAllMousePressed(evt);
            }
        });

        btnCancel2.setText("Cancel");
        btnCancel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFindId)
                    .addComponent(txtFindName)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMatchWord)
                    .addComponent(cbMatchCase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFindAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtFindName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbMatchCase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMatchWord)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFindAll))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clears all input fields when the cancel button is pressed.
     */
    private void btnCancel1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCancel1MousePressed
        // Clear the ID field
        txtId.setText("");
        // Clear the first name field
        txtFirstName.setText("");
        // Clear the last name field
        txtLastName.setText("");
        // Clear the birth year field
        txtBirthYear.setText("");
        // Clear the address field
        txtAddress.setText("");
        // Clear the phone field
        txtPhone.setText("");
        // Clear the email field
        txtEmail.setText("");
        // Clear the major field
        txtMajor.setText("");
        // Clear the semester field
        txtSemester.setText("");
        // Clear the university field
        txtUniversity.setText("");
    }// GEN-LAST:event_btnCancel1MousePressed

    /**
     * Validates input fields and adds a new internship candidate when the add
     * button is pressed.
     */
    private void btnAddNewMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAddNewMousePressed
        try {
            // Validate the ID
            String id = database.Validation.checkId(txtId.getText(), candidateType);
            // Validate the first name
            String firstName = database.Validation.checkName(txtFirstName.getText());
            // Validate the last name
            String lastName = database.Validation.checkName(txtLastName.getText());
            // Validate the birth year
            int birthYear = database.Validation.checkBirthYear(txtBirthYear.getText());
            // Validate the phone number
            String phone = database.Validation.checkPhone(txtPhone.getText());
            // Validate the email
            String email = database.Validation.checkEmail(txtEmail.getText());
            // Add the new internship candidate to the database
            database.Query.addNew(new database.Internship(
                    id,
                    firstName,
                    lastName,
                    birthYear,
                    txtAddress.getText(),
                    phone,
                    email,
                    txtMajor.getText(),
                    txtSemester.getText(),
                    txtUniversity.getText()), candidateType);
            // Set the flag indicating a successful addition
            canAdd = true;
            // Refresh the displayed candidate list
            tableController.display(database.Query.getList(candidateType));
            // Clear input fields
            btnCancel1MousePressed(evt);
        } catch (Exception e) {
            // Set the flag indicating a failed addition
            canAdd = false;
            // Show an error message
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_btnAddNewMousePressed

    /**
     * Populates input fields with the selected candidate's data from the table when
     * a row is clicked.
     */
    private void tbDataMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbDataMousePressed
        // Get the selected row index
        int row = tbData.getSelectedRow();
        // Get the ID of the selected candidate
        String id = (String) tbData.getValueAt(row, 0);
        // Retrieve candidate data by ID
        Object[] data = database.Query.getPropertiesById(id, candidateType);
        // Populate the ID field
        txtId.setText((String) data[0]);
        // Populate the first name field
        txtFirstName.setText((String) data[1]);
        // Populate the last name field
        txtLastName.setText((String) data[2]);
        // Populate the birth year field
        txtBirthYear.setText((int) data[3] + "");
        // Populate the address field
        txtAddress.setText((String) data[4]);
        // Populate the phone field
        txtPhone.setText((String) data[5]);
        // Populate the email field
        txtEmail.setText((String) data[6]);
        // Populate the major field
        txtMajor.setText((String) data[7]);
        // Populate the semester field
        txtSemester.setText((String) data[8]);
        // Populate the university field
        txtUniversity.setText((String) data[9]);
    }// GEN-LAST:event_tbDataMousePressed

    /**
     * Deletes selected candidates from the table when the delete button is pressed.
     */
    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDeleteMousePressed
        // Get the selected rows
        int[] rows = tbData.getSelectedRows();
        // Loop through each selected row
        for (int i = 0; i < rows.length; i++) {
            // Get the ID of the candidate to delete
            String id = (String) tbData.getValueAt(rows[i], 0);
            // Find the candidate in the database
            database.Candidate candidate = database.Query.find(id, "", true, true, candidateType).get(0);
            // Delete the candidate from the database
            database.Query.delete(candidate, candidateType);
        }
        // Refresh the displayed candidate list
        tableController.display(database.Query.getList(candidateType));
        // Clear input fields
        btnCancel1MousePressed(evt);
    }// GEN-LAST:event_btnDeleteMousePressed

    /**
     * Updates the selected candidate's information by deleting the old entry and
     * adding a new one.
     */
    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnUpdateMousePressed
        // Get the selected row index
        int row = tbData.getSelectedRow();
        // Get the ID of the old candidate
        String oldId = (String) tbData.getValueAt(row, 0);
        // Find the old candidate in the database
        database.Candidate oldCandidate = database.Query.find(oldId, "", true, true, candidateType).get(0);
        // Delete the old candidate from the database
        database.Query.delete(oldCandidate, candidateType);
        // Add the new candidate
        btnAddNewMousePressed(evt);
        // If the addition failed, re-add the old candidate
        if (!canAdd) {
            database.Query.addNew(oldCandidate, candidateType);
        }
    }// GEN-LAST:event_btnUpdateMousePressed

    /**
     * Clears the search fields and refreshes the candidate list when the cancel
     * button is pressed.
     */
    private void btnCancel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCancel2MousePressed
        // Clear the ID search field
        txtFindId.setText("");
        // Clear the name search field
        txtFindName.setText("");
        // Uncheck the match case checkbox
        cbMatchCase.setSelected(false);
        // Uncheck the match word checkbox
        cbMatchWord.setSelected(false);
        // Refresh the displayed candidate list
        tableController.display(database.Query.getList(candidateType));
    }// GEN-LAST:event_btnCancel2MousePressed

    /**
     * Searches for candidates based on the provided criteria and displays the
     * results.
     */
    private void btnFindAllMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnFindAllMousePressed
        // Find candidates based on the search criteria
        java.util.ArrayList<database.Candidate> list = database.Query.find(
                txtFindId.getText(),
                txtFindName.getText(),
                cbMatchCase.isSelected(),
                cbMatchWord.isSelected(),
                candidateType);
        // Display the search results
        tableController.display(list);
    }// GEN-LAST:event_btnFindAllMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbMatchCase;
    private javax.swing.JCheckBox cbMatchWord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFindId;
    private javax.swing.JTextField txtFindName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMajor;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtUniversity;
    // End of variables declaration//GEN-END:variables
}
