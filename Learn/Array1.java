import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

     //Declare an array
     int arr[] = new int[5];
     int i;
     Scanner k =new Scanner(System.in);
     for(i=0;i<=4;i++){
        arr[i]=k.nextInt();
        System.out.println(arr[i]+ "");
     }

     k.close();

     
        
    }
    
}
