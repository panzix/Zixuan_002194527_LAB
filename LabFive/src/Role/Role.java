/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;
import AppSystem.*;
import javax.swing.JFrame;
/**
 *
 * @author Panzi
 */
public abstract class Role {
    static String[] roles = {"sysadmin", "customer", "librarian" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(AppSystem appSystem, UserAccount useraccount);
}
