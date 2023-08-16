import java.util.Scanner;

public class Employeedemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee details  :");

        System.out.println("Enter employee first name :");
        String fName= sc.next();
        System.out.println("Enter employee last name :");
        String lName= sc.next();
        System.out.println("Enter employee id :");
        int empId= sc.nextInt();
        System.out.println("Enter employee experience in decimal format :");
        double empExp= sc.nextDouble();
        System.out.println("Enter employee quarterly goal in one line :");
        sc.next();
        String goal= sc.nextLine();
        System.out.println("Enter if she/he qualifies for bonus , 'y' or 'n' ");
        char bonus= sc.next().charAt(0);
        System.out.println("Enter employee details are as follows :");
        System.out.println("----------");
        System.out.println("Employee full name : "+fName+" "+lName);
        System.out.println("Emplouee Id :"+empId+ " Employee Experience : "+empExp);
        System.out.println("Employee goal :"+goal);
        System.out.println("Is she/he eligible for bonus :"+bonus);
        System.out.println("----------");


    }
}
