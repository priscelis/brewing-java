package level4;
import java.util.Scanner;

/*
    Given a string, count how many vowels it has.
        Example: "hello" → 2
        Example: "java" → 2
*/

public class VowelCounter {
    private Scanner scan;
    private String word;

    /* 
    What do I need?
        1. I need a variable that stores the word I'm writing down. 
        2. A counter variable, this has to count the amount of vowels. 
        3. a method so it can find the vowels on the word
    What do I want to do?
        I'll be using a for loop so it can iterate the whole word.

        I have to use a method like indexOf, or charAt to iterate or find the vowels

    What are my steps?

        1. Add the word and store the word I write
        2. Use the for loop with the length of the word
        3. Use an if-else to make sure if there are or not a vowel.
        4. Show the result

    */

    // First Part: Entering a word
    public VowelCounter(){
        scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = scan.next();
    }

    // Second Part: The for loop
    public void Counter(){
        int count = 0;
        // This iterates the word
        for(int x = 0; x < word.length(); x++){
            if(word.charAt(x) == 'a' ||word.charAt(x) == 'e' || word.charAt(x) == 'i' || word.charAt(x) == 'o' ||word.charAt(x) == 'u' ){
                count++;
            }

        }
        // Third Part: Print the word count.
        System.out.println("The amount of vowels on the word are: "+ count);
    }


    
    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        counter.Counter();
    }
}
