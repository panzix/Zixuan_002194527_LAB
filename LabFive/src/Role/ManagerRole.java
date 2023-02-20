/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.*;
import UI.ManagerWorkArea.ManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Panzi
 */
public class ManagerRole extends Role{
    public ManagerRole() {
    }

    
    @Override
    public JFrame getWorkArea(AppSystem appSystem, UserAccount useraccount) {
        return new ManagerJFrame(appSystem, useraccount);
    }
}
