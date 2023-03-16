import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static int lonelyinteger(List<Integer> list) {
        int result = 0;
        for (int num : list) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.print("Ingrese el número de elementos en la lista: ");
            int n = scanner.nextInt();
    
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                int element = scanner.nextInt();
                list.add(element);
            }
    
            int unique = lonelyinteger(list);
            System.out.println("El elemento único es: " + unique);
        } finally {
            scanner.close();
        }
    }
}    