import java.util.Scanner;

public class If_else {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);  

        int N= obj.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0 && (N>=2 && N<=5)){
            System.out.println("Not Weird");
        }
        else if(N%2==0 && (N>=6 && N<=20)){
            System.out.println("Weird");
        }
        else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }

    }
    
}
