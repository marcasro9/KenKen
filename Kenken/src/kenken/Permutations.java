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
    Funcion para permutaciones de potencia.
    */
    public static ArrayList<int[]> powerPermutations(int grid, int target, int figure){
        ArrayList<int[]> permutes=new  ArrayList<>();
        int a;
        if(figure==1){
           for(a=0; a<=grid;a++){
               if(Math.pow(a,3)==target){
                   int [] S={a};
                   permutes.add(S); 
               }
            }
        }
        return permutes;
    }
    
    /*
    Funcion para permutaciones de modulo
    */
    public static ArrayList<int[]> moduloPermutations(int grid, int target, int figure){
        ArrayList<int[]> permutes=new  ArrayList<>();
        int a;
        if(figure==2){
            for(a=1;a<=grid;a++){
                if(grid % a==target){
                    int [] S={grid,a};
                    int [] S2={a,grid};
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
    public static ArrayList<int[]> divisionPermutations(int grid, int target, int figure){
        ArrayList<int[]> permutes=new  ArrayList<>();
        int a;
        int b;
        if(figure==2){
            for(a=grid;a>0;a--){
                for(b=grid;b>0;b--)
                    if(a / b==target){
                        int [] S={a,b};
                        int [] S2={b,a};
                        permutes.add(S);
                        permutes.add(S2);
                }
            }
        }
        return permutes;
    }
    
    /*
    Funcion para permutaciones de Suma
    */
    public static ArrayList<int[]> aditionPermutations(int grid, int target, int figure){
        ArrayList<int[]> permutes=new  ArrayList<>();
        int a;
        int targetTemp;
        //caso donde se usan dos casillas, se incluye las operaciones elementales mas modulo.
        if(figure==2){
            for(a=0; a<=target;a++){
                targetTemp=target-a;
                if(a<=grid && targetTemp<=grid){
                    int [] S={a,(targetTemp)};
                    permutes.add(S);
                }
            }
        }
        else if(figure>2){
            for(a=0; a<=target;a++){
                for(int[] c: aditionPermutations(grid,target-a,figure-1)){
                    if(a<=grid){
                        int [] S=new int[figure];
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
    
    public static void print(ArrayList<int[]> list){
        for(int[] i:list){
            for(int x:i){
                System.out.println(x + " ");
            }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int grid=6;
        int target=2;
        int f=2;
        ArrayList<int[]> prueba=new ArrayList<>();
        prueba= divisionPermutations(grid,target,f);
        print(prueba);
    }


}
