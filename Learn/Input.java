import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        //String input
        String name = obj.nextLine();

        System.out.println("Enter your age: ");
        //Integer input
        int age = obj.nextInt();

        System.out.println("Enter your salary: ");
        //Float input
        float salary = obj.nextFloat();

        System.out.println("Your name is: " + name + "\nYour age is: " + age + "\nYour salary is: " + salary);

    }
}