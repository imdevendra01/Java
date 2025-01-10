import java.util.*;
public class calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:");
    int a = sc.nextInt();
        System.out.println("Enter value of B:");
    int b = sc.nextInt();
        System.out.println("Enter value of operator:");
    char operator = sc.next().charAt(0);
    switch(operator){
        case '+': System.out.println(a+b);
            break;
        case '-': System.out.println(a-b);
            break;
        case '*' :  System.out.println(a*b);
        break;
        case '/' :System.out.println(a/b);
        break;
        case '%' : System.out.println(a%b);
        default:
            System.out.println("Invaild Input");
    }
    }
}
