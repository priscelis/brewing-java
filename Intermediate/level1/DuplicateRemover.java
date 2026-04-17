package Intermediate.level1;

import java.util.Random;
import java.util.Scanner;

/* Given an array of numbers, remove the duplicates and return only the unique numbers.
Example: [1, 2, 2, 3, 4, 4, 5] → [1, 2, 3, 4, 5]
Example: [7, 7, 7, 1, 2] → [7, 1, 2]*/


/*
    What do I need?
        1. Two arrays: one for the original numbers (box), one for the unique numbers (removedbox)
        2. A counter (cont) to track how many unique numbers we have
        3. A boolean (exists) to check if a number is already in removedbox
        4. A do-while to make sure the array size is between 5 and 10

    What do I want to do?
        Take an array of numbers entered by the user, compare each number
        against the unique numbers already found, and only keep it if it
        hasn't appeared before.

    What are my steps?
        1. Use a do-while to generate a random size between 5 and 10
        2. Initialize box with that size
        3. Ask the user to fill box with numbers
        4. Initialize removedbox with the same size as box (worst case: no duplicates)
        5. For each number in box:
            a. Set exists = false
            b. Loop through removedbox (up to cont) to check if number already exists
            c. If found → set exists = true and break
            d. If exists is false → add number to removedbox and increment cont
        6. Print removedbox from index 0 to cont (ignore the empty positions)
*/
public class DuplicateRemover {
    private Scanner sc; 
    private Random random = new Random();
    private int[] box;
    private int[] removedbox;  
    private int cont; 

    public DuplicateRemover(){
        sc = new Scanner(System.in);
        random = new Random();
        int number;
        do{
        number = random.nextInt(10);  // Este es null
        System.out.println(number);
              }while(number <= 5 );
        // I forgot to iterate the array
        box = new int[number];
        for(int x = 0; x < box.length; x++){
            System.out.println("Enter a number: ");
            box[x] = sc.nextInt();
        }

        System.out.println();
    }

    public void print(){
        System.out.println("The array is: ");
        for (int x =0; x < box.length; x++) {
            System.out.print(box[x]+ " ");
        }
        System.out.println();
    }

    public void remover(){
      cont = 0;
      removedbox = new int[box.length];
    for (int x = 0; x < box.length; x++) {
    boolean exists = false;

    // buscar si box[x] ya está en removedbox
    for (int y = 0; y < cont; y++) {
        if (box[x] == removedbox[y]) {
            exists = true;
            break;
        }
    } 

    // si no existe, agregarlo
    if (!exists) {
        removedbox[cont] = box[x];
        cont++;
    }
}
        System.out.println();
    }

    public void printRemover(){
        System.out.println("The other array removed: ");
        for (int x = 0; x < cont; x++) {
            System.out.print(removedbox[x] + " ");
        }
    }
    
    public static void main(String[] args) {
        DuplicateRemover remove = new DuplicateRemover();
        remove.print();
        remove.remover();
        remove.printRemover();
    }
}
