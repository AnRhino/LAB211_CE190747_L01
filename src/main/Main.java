/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Main class to launch the application.
 */
public class Main {

    /**
     * The entry point of the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view.MenuFrame menu = new view.MenuFrame(); // Create a new MenuFrame
        menu.setVisible(true); // Set the MenuFrame to be visible
    }

}
