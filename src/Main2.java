//day45 2
import java.util.*;

public class Main2 {
    public static boolean isBro(String s1,String s2) {


        List<Character> list = new ArrayList<>();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for (char x : arr1) {
            list.add(x);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (list.contains(arr2[i])) {
                list.remove(list.indexOf(arr2[i]));

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n<=1000) {
                String[] arr = new String[n];
                for (int i = 0;i<n;i++) {
                   arr[i] = scanner.next();
                }
                String s = scanner.next();
                int m = scanner.nextInt();
                Arrays.sort(arr);
                int count = 0;
                List<String> list = new ArrayList<>();
                for(int i = 0;i<arr.length;i++) {
                    if((isBro(arr[i],s)||isBro(s,arr[i]))&&(!arr[i].equals(s))&&(arr[i].length() == s.length())) {
                        list.add(arr[i]);
                        count++;
                    }
                }
                String bro = list.get(m-1);

                System.out.println(count);
                if (bro.length()<=50) {
                    System.out.println(bro);
                }
            }
        }
    }
}
