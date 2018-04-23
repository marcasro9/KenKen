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
    
    public Coordinate[] elePos1(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=0;
        coordinate[2].y=2;
        
        coordinate[3].x=1;
        coordinate[3].y=2;
        
        return coordinate;
    }
    public Coordinate[] elePos2(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=2;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=2;
        coordinate[3].y=1;
        
        return coordinate;
    }
    public Coordinate[] elePos3(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=1;
        coordinate[1].y=0;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=1;
        coordinate[3].y=2;
        
        return coordinate;
    }
    public Coordinate[] elePos4(){
        
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
        
        coordinate[3].x=0;
        coordinate[3].y=1;
        
        return coordinate;
    }
    
    public Coordinate[] tePos1(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=1;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=2;
        coordinate[3].y=1;
        
        return coordinate;
    }
    public Coordinate[] tePos2(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=1;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=1;
        coordinate[3].y=2;
        
        return coordinate;
    }
    public Coordinate[] tePos3(){
        
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
        
        coordinate[3].x=1;
        coordinate[3].y=1;
        
        return coordinate;
    }
    public Coordinate[] tePos4(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=0;
        coordinate[3].y=2;
        
        return coordinate;
    }
    
    public Coordinate[] zetaPos1(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=1;
        coordinate[1].y=0;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=2;
        coordinate[3].y=1;
        
        return coordinate;
    }
    public Coordinate[] zetaPos2(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=1;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=1;
        coordinate[2].y=1;
        
        coordinate[3].x=0;
        coordinate[3].y=2;
        
        return coordinate;
    }
    
    public Coordinate[] largoPos1(){
        
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
        
        coordinate[3].x=3;
        coordinate[3].y=0;
        
        return coordinate;
    }
    public Coordinate[] largoPos2(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        coordinate[2].x=0;
        coordinate[2].y=2;
        
        coordinate[3].x=0;
        coordinate[3].y=3;
        
        return coordinate;
    }
    
    public Coordinate[] medioPos1(){
        
        Coordinate[] coordinate= new Coordinate[2];
        for(int i=0;i<2;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=1;
        coordinate[1].y=0;
        
        return coordinate;
    }
    public Coordinate[] medioPos2(){
        
        Coordinate[] coordinate= new Coordinate[2];
        for(int i=0;i<2;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=0;
        coordinate[1].y=1;
        
        return coordinate;
    }
    
    public Coordinate[] corto(){
        
        Coordinate[] coordinate= new Coordinate[1];
        for(int i=0;i<1;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;      
        
        return coordinate;
    }
    
    public Coordinate[] cuadrado(){
        
        Coordinate[] coordinate= new Coordinate[4];
        for(int i=0;i<4;i++){
            coordinate[i]=new Coordinate();
        }
        coordinate[0].x=0;
        coordinate[0].y=0;
        
        coordinate[1].x=1;
        coordinate[1].y=0;
        
        coordinate[2].x=0;
        coordinate[2].y=1;
        
        coordinate[3].x=1;
        coordinate[3].y=1;
        
        return coordinate;
    }
}
