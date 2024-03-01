import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        int a,b;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a=k.nextInt();
        b=k.nextInt();
        abc(a,b);
    }

    public static void abc(int x, int y){
        System.out.println(x+y);
    }
    
}
