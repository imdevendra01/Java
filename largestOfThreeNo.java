import java.util.*;
public class largestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a= sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        System.out.println("Enter value of c:");
        int c = sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("largest value is a:" + "" + a);
        } else if (b>=c) {
            System.out.println("largest value is b:" + "" + b);

        }
        else System.out.println("largest value is c:" + "" + c);
    }
}
