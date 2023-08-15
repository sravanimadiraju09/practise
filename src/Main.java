import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter Employee Name");
        String name= input.next();
        System.out.println("Please enter Age");
        int age= input.nextInt();
        System.out.println("Please enter Employee Id ");
        int id= input.nextInt();

        boolean isEligable;

        if(age>30){
            System.out.println(name+ "is Eligible");
        }
        else{
            System.out.println(name+ "is not Eligible");
        }
    }
}