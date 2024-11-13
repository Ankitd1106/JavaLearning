import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number = ");
        int start= scanner.nextInt();
        System.out.print("Enter count = ");
        int count= scanner.nextInt();

        // Get the next even and odd numbers starting from the start number
        int evenStart = (start % 2 == 0) ? start : start + 1;
        int oddStart = (start % 2 != 0) ? start : start + 1;

        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < count; i++) {
//            System.out.print(evenStart + (2 * i)+"\n");
            even.add(evenStart + (2 * i));
        }
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < count; i++) {
//            System.out.print(oddStart + (2 * i)+"\n");
            odd.add(oddStart + (2 * i));
        }

        System.out.print("Even numbers: "+even);
        System.out.print("\n"+"Odd numbers: "+odd);


    }
}
