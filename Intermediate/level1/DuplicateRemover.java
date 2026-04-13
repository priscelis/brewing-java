package Intermediate.level1;

import java.util.Random;
import java.util.Scanner;

/* Given an array of numbers, remove the duplicates and return only the unique numbers.
Example: [1, 2, 2, 3, 4, 4, 5] → [1, 2, 3, 4, 5]
Example: [7, 7, 7, 1, 2] → [7, 1, 2]*/


/* 
    What do I need?
       
       1. I need an array 
       2. I have to repeat numbers on the array
       3. I have to use a conditional to compare between numbers
    
    What do I want to do?
        I'm thinking to use an array and put numbers in the array and then do the comparison with a conditional and erase the number with a function.

        Voy a pensarlo en español, no se si funcionara, tener dos arrays en donde uno sea el que tu mismo coloques los numeros , usar la condicional para comparar si son iguales o diferentes (depende de la condicion), y dentro de la condicional como poner que se agregen los datos que cumplen la condicion (que son diferentes al valor), ahi adentro tenemos una variable en donde sustituimos el valor 

    What are my steps?

        
    */
public class DuplicateRemover {
    private Scanner sc; 
    private Random random = new Random();
    private int[] box;
    private int[] removedbox;  


    public DuplicateRemover(){
        sc = new Scanner(System.in);
        
       int number = 5+random.nextInt(10);  // Este es null
        System.out.println(number);
        // To make sure we are using high number 
        if(number >= 5 && number <= 10){
            // initialize the array
            box = new int[number];
        }else{
            // Esta lanzando numeros mayores a 10 o menores a 5
            System.out.println("Try again...");
        }
        
        for(int x = 0; x < box.length; x++){
            System.out.println("Enter a number: ");
            box[x] = sc.nextInt();
        }

        System.out.println();
    }

    public void print(){
        System.out.println("The array is: ");
        for (int x : box) {
            System.out.print(box[x]+ " ");
        }
        System.out.println();
    }

    public void remover(){
        int number = box[0];
        int cont = 0;
        
        for(int x = 1; x < box.length; x++){
            if(number != box[x]){
                number = box[x];
                cont = cont + 1;
                for(int y = 0; y < cont; y++){
                    removedbox[y] = number; 
                }
            }
        }
        System.out.println();
    }

    public void printRemover(){
        for (int x : removedbox) {
            System.out.print(removedbox[x]);
        }
    }
    
    public static void main(String[] args) {
        DuplicateRemover remove = new DuplicateRemover();
        remove.print();
        remove.remover();
    }
}
