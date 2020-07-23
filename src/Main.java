//day45 1
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            boolean contain = true;
            String s1 = scanner.next();
            String s2 = scanner.next();
            List<Character> list = new ArrayList<>();
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            for(char x:arr1) {
                list.add(x);
            }
            for (int i = 0;i<arr2.length;i++) {
                if (list.contains(arr2[i])) {
                    list.remove(list.indexOf(arr2[i]));

                }else {
                    System.out.println("No");
                    contain = false;
                    break;
                }
            }
            if (contain) {
                System.out.println("Yes");
            }
        }
    }
}
