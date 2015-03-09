
package bubblesort100500;

import java.util.Scanner;

/**
 *
 * @author lucy
 */
public class BubbleSort100500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first, last, middle, search;
    
    // Неотсортированная заготовка массива
    int[] f = {8, 11, 216, 22, 405, 907, 69, 313, 504, 7, 13, 48, 28, 900, 57, 24};
    System.out.println("Ishodniy massiv: ");
        for (int z = 0; z < f.length; z++) {
            System.out.print(f[z] + " ");
        }    
    //Ввод искомого элемента
    Scanner Input = new Scanner(System.in);
        System.out.print("\nVvedite chislo index kotorogo hotite uznat` = ");
        int c = Input.nextInt();
        Input.close();
        
    //Поиск индекса в неотсортированном массиве    
    for (int w=0; w<=f.length; w++){
            if(f[w]==c){
            System.out.println("Index chisla " + c + " v neotsortirovannom massive raven " + w);
            break;
            }
        }
    
    //Пузырьковая сортировка массива
    boolean swapped = true;
        int temp;
        int j = 0;
        do {
            swapped = false;
            j++;// инкремент
            for(int i = 0; i < f.length - 1; i++) {
                if(f[i] > f[i + 1]) {
                    temp = f[i];
                    f[i] = f[i + 1];
                    f[i + 1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
               
        System.out.println("\nOtsortirovanniy massiv: ");    
        for(int h = 0; h < f.length; h++) {
        System.out.print(f[h] + " ");
            }
    //Поиск индекса в отсортированном массиве
    first = 0;
    last = f.length - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
        if ( f[middle] < c )
            first = middle + 1;    
        else
            if ( f[middle] == c ) 
            {
                System.out.println("\nIndex chisla " + c + " v otsortirovannom massive raven " + middle + ".");
                break;
            }
            else
                last = middle - 1;
 
                middle = (first + last)/2;
    }
    if ( first > last )
        System.out.println("Chislo " + c + " ne nahoditsya v dannom massive ili massiv ne sortirovan.\n");
    }
    
}

 
