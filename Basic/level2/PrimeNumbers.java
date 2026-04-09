package level2;
import java.util.Random; 

public class PrimeNumbers {
    private int number;
    // I call the Random Class
    

    public void numbers(){

        Random rand = new Random(); 
        
        number = rand.nextInt(20);

        System.out.println("The number we printed is: "+ number);
        
    }

    public void PrimeNumberVerification (){
        boolean isPrime = true; 
        for (int x = 2; x < number; x++){
            if(number % x == 0){
                isPrime = false;
                break;
            }  
        }
        if(isPrime){
          System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        } 
    }

    public static void main(String[] args) {
        PrimeNumbers numbers = new PrimeNumbers();
        numbers.numbers();
        numbers.PrimeNumberVerification();
    }

}
