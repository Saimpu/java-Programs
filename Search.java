import java.util.Scanner;
class Sear {
    void searchElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Element is found");
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Element is not found");
        }
      
    }
}

public class Search {
    public static void main(String args[]) {
        Sear b = new Sear();
        b.searchElement();
    }
}
	
