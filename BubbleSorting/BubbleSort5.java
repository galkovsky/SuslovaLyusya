import java.util.Scanner;

class BubbleSort5 {

public static void bubsort(int[] arr, int v) { 

        switch (v){
            case 1:
                for (int i = 0; i < arr.length-1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j] > arr[j+1]) 
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            break;
            case 2:
        for (int i = 0; i < arr.length-1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j] < arr[j+1]) 
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            break;
            default:
                System.out.print("Net takogo varianta vivoda");
                break;
      }
      
    
    System.out.println("Sortirovanniy massiv:");
    
    for (int i = 0; i < arr.length; i++) 
      System.out.print(arr[i]+" ");
}
    
    
  public static void main(String []args) {
    int lastel, i, j,v;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Vvedite razmer celochislennogo massiva");
    lastel = input.nextInt();
    int arr[] = new int[lastel];
 
    System.out.println("Vvedite celochislennie elementi massiva: ");
    
    for (i = 0; i < lastel; i++) 
        arr[i] = input.nextInt();
 
    System.out.println("Viberite variant sortirovki massiva:\n"
        +"\t1.Po vozrostaniyu\n"
        +"\t2.Po ubivaniyu\n");
    v = input.nextInt();
    
    bubsort(arr,v);
  }
}

