import java.util.Scanner    ;

public class Loop {

    public static void main(String[] args) {
        int od=1,i,n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=obj.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Odd number is : "+od);
            od=od+2;
        }

        obj.close();
    }
    
}
