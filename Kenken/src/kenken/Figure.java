/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Armando
 */
public class Figure implements Comparable<Figure>{
    
    public int operacion;
    public int total;
    public Integer cuadritos;
    public int id;
    public String nombre;
    public ArrayList<int[]> posiblesRes=new  ArrayList<>();
    public ArrayList<Coordinate> posiciones=new  ArrayList<>();

    public Figure(int operacion, int total, int cuadritos, int id, String nombre) {
        this.operacion = operacion;
        this.total = total;
        this.cuadritos = cuadritos;
        this.id = id;
        this.nombre = nombre;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCuadritos() {
        return cuadritos;
    }

    public void setCuadritos(int cuadritos) {
        this.cuadritos = cuadritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<int[]> getPosiblesRes() {
        return posiblesRes;
    }

    public void setPosiblesRes(ArrayList<int[]> posiblesRes) {
        this.posiblesRes = posiblesRes;
    }

    public ArrayList<Coordinate> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ArrayList<Coordinate> posiciones) {
        this.posiciones = posiciones;
    }
    
    @Override
    public int compareTo(Figure t) {
        return cuadritos.compareTo(t.getCuadritos());
    }
  
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
