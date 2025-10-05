import java.util.*;
public class checkNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two no. ");
        int a =  sc.nextInt();
        int b =  sc.nextInt();
        if(a>b){
            System.out.println("a is greater ");
        }else if(a<b){
            System.out.println("b is greater ");
        }
        else {
            System.out.println("both are equal");
        }
    }
}
