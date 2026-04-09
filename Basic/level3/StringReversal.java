package level3;
import java.util.Scanner;

public class StringReversal {
    private Scanner word;
    private String usedWord;

    public void storeWord(){
        word = new Scanner(System.in);
        System.out.println("Enter a word: ");
        usedWord = word.next();
    }

    public void Reverse(){
        
        String result = "";

        //  If I don't use length() - 1, it throws StringIndexOutOfBoundsException because indices start at 0, not 1
        for(int x = usedWord.length()- 1; x >= 0 ; x--){
            result = result + usedWord.charAt(x);
        }
        System.out.println("The reversal word is: "+ result);
       
    }

    
    public static void main(String[] args) {
        StringReversal string = new StringReversal();
        string.storeWord();
        string.Reverse();
    }
}
