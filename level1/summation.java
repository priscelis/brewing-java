package level1;
import java.util.Scanner;

public class summation {
   private Scanner tec; 
    
    public void storeNumbers(){
        tec = new Scanner(System.in);
        int value, sum = 0;

        System.out.print("Add a four-digit number");
        value = tec.nextInt();

        int res = 0;

        // 
        while (value > 0){
         // Saving the module value using the variable called res
            res = value % 10;
            sum = res + sum;

            value = value / 10;
        }

        System.out.println("The total of all numbers is: "+ sum);
        
    }

    public static void main(String[] args) {
        summation sum = new summation();
        sum.storeNumbers();
    }
}