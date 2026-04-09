package level5;
import java.util.Random; // Add random numbers 

/*Given an array of numbers, find the largest number without using .max() or any built-in sorting method.

Example: [3, 7, 1, 9, 4] → 9
Example: [10, 25, 3, 8] → 25 
*/

public class MaxFinder {
    /*
     What do I need?

        I need a Math.Random or a variable inicialized with new Random().
        The array with a limit of five numbers.
        I need to compare between all this numbers and see which one is the largest number.
     What do I want to do?
        I need to create an array of 5 numbers, in my case, I want them to be random numbers everytime I test this exercise.
      What are my steps?
        1. Initialize an array
        2. Inicialize a variable with the new random 
        3. Use a for loop to iterate the array and add numbers with de random variable
        4. Being the array with number, use a for loop traverse the array
        5. Inside, I need to use an id to compare the first position with the next position to see between them who's the largest number. 

    */   
    private Random random = new Random();
    private int[] numbers;

    public void storeNumbers(){
        numbers = new int[5];
            
           for (int x = 0 ; x < 5; x++){
            // I'm adding number to the existing array
            // Numbers between 0 - 30
                numbers[x] = random.nextInt(30); 
           } 

    }

    public void printNumbers(){
        // To print the numbers before the comparison 

        System.out.println("Complete array: ");
        for (int numbers : numbers) { // this is a foreach
            System.out.print(numbers+ " ");
        }
        System.out.println();
    }

    public void largestNumber(){
        // I'm doing a for loop if a conditional

        // I declare a new variable with the value of the first position so it cam compare with the others values
        int largestNumber = numbers[0];
        for (int x = 1; x < numbers.length; x++) {
            if(numbers[x] > largestNumber){
                // If the condition is met, the number is replaced with the new value
                largestNumber = numbers[x];

            }
        }
        System.out.println("The largest number on this array is: "+ largestNumber);    
    }
    public static void main(String[] args) {
        MaxFinder max = new MaxFinder();
        max.storeNumbers();
        max.printNumbers();
        max.largestNumber();
    }
}
