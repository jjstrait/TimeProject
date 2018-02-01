/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeproject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jstra
 */
public class TimeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeService time =  new TimeService("11:40","8:37");
        try {
            System.out.println(time.getDifferanceInTime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
