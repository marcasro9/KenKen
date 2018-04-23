/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

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
        Figure figure=new Figure();
        Coordinate[] coordinate=figure.corto();
        for(int i=0;i<figure.corto().length;i++){
            System.out.println("("+coordinate[i].x+","+coordinate[i].y+")");
        }
    }
    
}
