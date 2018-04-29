/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import Interface.Principal;

/**
 *
 * @author Armando
 */
public class Kenken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba
        //Prueba del master
        new Principal().setVisible(true);
        Structure prueba=new Structure();
        int x=5;
        int y=5;
        prueba.createEstructure(x,y);
    }  
}
