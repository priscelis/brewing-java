package Intermediate.level2;
import java.util.Random;
/*
Given an array of numbers, sort it from smallest to largest without using any built-in sorting method.
Example: [5, 3, 8, 1, 4] → [1, 3, 4, 5, 8]
Example: [9, 2, 7, 3] → [2, 3, 7, 9] 

What do I need? — variables, arrays, estructuras

un array vacio 
colocar lo datos
una variable auxiliar
otra variable para guardar el primer numero

What do I want to do? — explicar la lógica en tus palabras

Quiero hacer algo que vaya comparando entre los numeros que esta dentro del array y que con una variable auxiliar vayan cambiando de sitio poco a poco. Es como reemplazar el numero que esta en ese lugar y guardar el otro numero en otra variable para no perderlo

What are my steps? — el proceso paso a paso

el constructor para meter lo datos
se colocan los datos

un metodo para poder compararlos, creando las variables en donde uno le ponermos el valor del primer numero del array y el otro solo lo declaramos. 

hacemos dos for anidados y en el que esta asdentro le ponemos la condicion para mover los digitos dentro del array
*/

public class BubbleSort {
    private Random random; 
    private int[] number;

    public BubbleSort(){
        // Declaramos el random 
        random = new Random(11); 
        
        // Agregamos los valores
        for(int x = 0; x < 6; x++){
            number[x] = random.nextInt();
        }

        System.out.println("El array es el siguiente: ");
        System.out.println();
        for(int y = 0; y < number.length; y++){
            System.out.print(number[y]+", ");
        }
    }

    
    public void rearrange(){
        for(int x = 0; x < number.length; x++){
            for()
        }

    }

    public static void main(String[] args) {
        
    }
}
