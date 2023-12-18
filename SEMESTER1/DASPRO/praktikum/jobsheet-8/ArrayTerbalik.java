import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Array ke - " + i + " : ");
            array[i] = sc.nextInt();
        }
        
        int arrayT = array.length - 1; 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[arrayT]);
            arrayT = arrayT - 1;
        }
        sc.close();
    }
}
