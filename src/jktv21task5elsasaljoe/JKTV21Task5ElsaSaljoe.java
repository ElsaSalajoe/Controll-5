/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task5elsasaljoe;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV21Task5ElsaSaljoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] Array = new int[5][];
        Array[0] = new int[3];
        Array[1] = new int[5];
        Array[2] = new int[7];
        Array[3] = new int[8];
        Array[4] = new int[9];
        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array[i].length; j++){
                Array[i][j] = ((int)(Math.random() * 50)+50);
            }
        }
        //вывод несортированного зубчатого массива
        System.out.println("Array(unsorted) = ");
        for(int i = 0; i < Array.length; i++){
            System.out.print(Arrays.toString(Array[i]));
            System.out.println();
        }
        //вывод сортированного зубчатого массива
        boolean isSorted = false;
        int buf;
        while (!isSorted) {            
            isSorted = true;
            for (int i = 0; i < Array.length-1; i++) {
                for(int j = 0; j < Array[i].length-1; j++){
                    if(Array[i][j] > Array[i][j+1]){
                        isSorted = false;
                        buf = Array[i][j];
                        Array[i][j] = Array[i][j+1];
                        Array[i][j+1] = buf;
                    }  
                }
            }
        }
        System.out.println("Array(sorted) = ");
        for(int i = 0; i < Array.length; i++){
                System.out.print("[");
            for(int j = 0; j < Array[i].length; j++){
                System.out.print(Array[i][j]);
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    
}
