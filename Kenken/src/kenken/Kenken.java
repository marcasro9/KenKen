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
        Estructure prueba=new Estructure();
        prueba.createEstructure(5,5);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               System.out.print(prueba.matriz[i][j]+"      "); 
            }
            System.out.println();
        }
    }
    
}
