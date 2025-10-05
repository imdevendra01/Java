
import java.util.*;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        String res = (n%2==0)?"even":"odd";
        System.out.println(res);
    }
}
