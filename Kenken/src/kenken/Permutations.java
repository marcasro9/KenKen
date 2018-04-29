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
    
    public static ArrayList<int[]> permute(int n, int figure){
        ArrayList<int[]> permutes=new  ArrayList<>(); 
        if(figure==2){
               int a=0;
               int b=n;
               for(a=0; a<=n;a++){
                   int [] S={a,n-a};
                   permutes.add(S);               
               }
        }
        else if(figure>2){
            int a=0;
               int b=n;
               for(a=0; a<=n;a++){
                    for(int[] c: permute(n-a,figure-1)){
                        int [] S=new int[figure];
                        S[0]=a;
                        for(int i=1;i<figure;i++){
                           S[i] = c[i-1];
                        }
                        permutes.add(S);
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
        int n=15;
        int f=2;
        ArrayList<int[]> prueba=new ArrayList<>();
        prueba= permute(n,f);
        print(prueba);
    }


}
