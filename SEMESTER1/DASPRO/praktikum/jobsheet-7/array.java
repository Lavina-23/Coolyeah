import java.util.Scanner;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        arr = new int[6];
        for (int i = 0; i <= 7; i++) {
        arr[i] = i + 1;
        }
    }
}
