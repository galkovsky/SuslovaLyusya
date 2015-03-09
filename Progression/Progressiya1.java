package progressiya1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucy
 */
public class Progressiya1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
 
        List<Integer> list = new ArrayList<>();
 
        System.out.print("Vvedite razmernost` progressii, kotoruyu hotite proverit`: ");
        int count = sc.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Vvedite "+(i+1)+"-y element: ");
            list.add(sc.nextInt());
        }
        if (arifmetProg(list) == true)
            System.out.println("Progressiya yavlyaetsya algebraicheskoy");
                else
                    System.out.println("Progressiya ne yavlyaetsya algebraicheskoy");
        
        if (geometProg(list) == true)
            System.out.println("Progressiya yavlyaetsya geometricheskoy");
                else
                    System.out.println("Progressiya ne yavlyaetsya geometricheskoy");
        
    }
 
    public static boolean geometProg(List enterList) {
        List<Integer> list = enterList;
        int temp = 0;
        int temp2 = 0;
        temp = list.get(1) / list.get(0);
        for (int i = 1; i < list.size(); i++) {
            temp2 = list.get(i) / list.get(i - 1);
            if (temp2 != temp) {
                return false;
            }
        }
        return true;
    
    }
    
    public static boolean arifmetProg(List enterList) {
        List<Integer> list = enterList;
 
        // Proverka progressii
        int temp = 0;
        int temp2 = 0;
        temp = list.get(1) - list.get(0);
        for (int i = 1; i < list.size(); i++) {
            temp2 = list.get(i) - list.get(i - 1);
            if (temp2 != temp) {
                return false;
            }
        }
        return true;
    }

}
