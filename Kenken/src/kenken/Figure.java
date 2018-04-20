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
public class Figure {
      
    public Coordinate[] cuadrado(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        coordinate[1].x=0;
        coordinate[1].y=1;
        coordinate[2].x=1;
        coordinate[2].y=0;
        coordinate[3].x=1;
        coordinate[3].y=1;
        
        return coordinate;
    }
    
    public Coordinate[] ele(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        coordinate[1].x=1;
        coordinate[1].y=0;
        coordinate[2].x=2;
        coordinate[2].y=0;
        coordinate[3].x=2;
        coordinate[3].y=1;
        
        return coordinate;
    }
    
}
