import java.util.Scanner;

public class If_else_p1 {

    public static void main(String[] args){
        //Write your code here
        float s,c;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the value of c: ");
        s=k.nextFloat();
        if(s>=1000){
            c=s*10/100;
            System.out.println("The commission is: "+c);

        }
        else{
            System.out.println("No commission");
        }

        k.close();

    }
    
}
