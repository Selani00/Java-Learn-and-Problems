import java.util.Scanner;

public class OutPut_formatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String formattedNumber = String.format("%03d",x);
                String formatting=String.format("%-15s%-16s",s1,formattedNumber);
                System.out.println(formatting);       
            }
            System.out.println("================================");

    }
    
}

// %-15s: Left-justified string with a minimum width of 15 characters (s1).
// %-16s: Left-justified string with a minimum width of 16 characters (formattedNumber).
