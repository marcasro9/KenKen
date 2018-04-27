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
        int x=5;
        int y=5;
        prueba.createEstructure(x,y);
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               System.out.print(prueba.matriz[i][j]+"      "); 
            }
            System.out.println();
        }
    }
    
}
