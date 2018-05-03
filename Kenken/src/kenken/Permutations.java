/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kenken;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Israel Padilla
 */
public class Permutations {
    
    /*
    Funcion para permutaciones de potencia, orden de n.
    */
    public static ArrayList<byte[]> powerPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        if(figure==1){
           for(a=0; a<=grid;a++){
               if(Math.pow(a,3)==target){
                   byte [] S={a};
                   permutes.add(S); 
               }
            }
        }
        return permutes;
    }
    
    /*
    Funcion para permutaciones de modulo, orden de n
    */
    public static ArrayList<byte[]> moduloPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        if(figure==2){
            for(a=1;a<=grid;a++){
                if(grid % a==target){
                    byte [] S={grid,a};
                    byte [] S2={a,grid};
                    permutes.add(S);
                    permutes.add(S2);
                }
            }
        }
        return permutes;
    }
    /*
    funcion para sacar permutaciones de division, esta es de orden n^2
    */
    public static ArrayList<byte[]> divisionPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        byte b;
        byte c;
        byte d;
        if(figure==2){
            for(a=grid;a>0;a--){
                for(b=grid;b>0;b--)
                    if(a / b==target){
                        byte [] S={a,b};
                        byte [] S2={b,a};
                        permutes.add(S);
                        permutes.add(S2);
                }
            }
        }
        else if (figure==4){
            for(a=1; a<=grid;a++){
                for(b=1;b<=grid;b++){
                    for(c=1;c<=grid;c++){
                        for(d=1;d<=grid;d++){
                            if((d/c/b/a)==target){
                                byte[] S={d,c,b,a};
                                permutes.add(S);
                            }
                        }
                    }
                }
            }
        }
        
        
        return permutes;
    }
    
    /*
    Funcion para multiplicacion si figura es de 2 entonces n^2 si figura es de 4 entonces n^4
    */
    public static ArrayList<byte[]> multiPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        byte b;
        byte c;
        byte d;
        if (figure==2){
            for(a=1;a<=grid;a++){
                for(b=1;b<=grid;b++)
                    if(a*b==target){
                        byte [] S={a,b};
                        permutes.add(S);
                }
            }
        }
        else if(figure>2){
            for(a=1; a<=grid;a++){
                for(b=1;b<=grid;b++){
                    for(c=1;c<=grid;c++){
                        for(d=1;d<=grid;d++){
                            if((a*b*c*d)==target){
                                byte[] S={a,b,c,d};
                                permutes.add(S);
                            }
                        }
                    }
                }
            }
        }
        
        
        return permutes;
    }
    
    /*
    Funcion para permutaciones de restas, si son cuadros de 2 es n^2 si son figuras de 4 es n^4.
    */
    public static ArrayList<byte[]> subtractionPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        byte b;
        byte c;
        byte d;
        if(figure==2){
            for(a=0;a<=grid;a++){
                for(b=0;b<=grid;b++)
                    if(b-a==target){
                        byte [] S={b,a};
                        byte [] S2={a,b};
                        permutes.add(S);
                        permutes.add(S2);
                }
            }
        }
        else if(figure>2){
            for(a=0; a<=grid;a++){
                for(b=0;b<=grid;b++){
                    for(c=0;c<=grid;c++){
                        for(d=0;d<=grid;d++){
                            if((d-c-b-a)==target){
                                byte[] S={d,c,b,a};
                                permutes.add(S);
                            }
                        }
                    }
                }
            }
        }
        return permutes;
    }
    /*
    Funcion para permutaciones de Suma, n si es de dos, n3 si es de 4.
    */
    public static ArrayList<byte[]> aditionPermutations(byte grid, byte target, byte figure){
        ArrayList<byte[]> permutes=new  ArrayList<>();
        byte a;
        byte targetTemp;
        byte figTemp;
        //caso donde se usan dos casillas, se incluye las operaciones elementales mas modulo.
        if(figure==2){
            for(a=0; a<=target;a++){
                targetTemp=(byte) (target-a);
                if(a<=grid && targetTemp<=grid){
                    byte [] S={a,(targetTemp)};
                    permutes.add(S);
                }
            }
        }
        else if(figure>2){
            for(a=0; a<=target;a++){
                targetTemp=(byte) (target-a);
                figTemp=(byte) (figure-1);
                for(byte[] c: aditionPermutations(grid,targetTemp,figTemp)){
                    if(a<=grid){
                        byte [] S=new byte[figure];
                        S[0]=a;
                        for(int i=1;i<figure;i++){
                            S[i] = c[i-1];
                        }
                        permutes.add(S);
                    }
                }
            }
        }
        return permutes;
    }
    
    public static void print(ArrayList<byte[]> list){
        for(byte[] i:list){
            for(byte x:i){
                System.out.println(x + " ");
            }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        byte grid=12;
        byte target=40;
        byte f=4;
        ArrayList<byte[]> prueba=new ArrayList<>();
        prueba= multiPermutations(grid,target,f);
        print(prueba);
    }


}
