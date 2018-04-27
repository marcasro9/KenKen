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
    
    public  static void permute(int start, int[] input ) {
        if (start == input.length) {
            //System.out.println(input);
            for(int x: input){
            System.out.print(x);
            }
        System.out.println("");
        return;
        }
        for (int i = start; i < input.length; i++) {
            // swapping
            int temp = input[i];
            input[i] = input[start];
            input[start] = temp;
            // swap(input[i], input[start]);
            
            permute(start + 1, input);
            // swap(input[i],input[start]);

            int temp2 = input[i];
            input[i] = input[start];
            input[start] = temp2;
        }
    }

    public static void main(String[] args) {

        int[] a={1,2,3};
        permute(0, a);    
}


}
