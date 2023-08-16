import java.util.Scanner;

public class Worker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter worker details  :");
        System.out.println("Enter worker first name :");
        String fName= sc.next();
        System.out.println("Enter worker surname :");
        String sName= sc.next();
        System.out.println("Enter worker id :");
        int wId= sc.nextInt();
        System.out.println("Enter worker experience in decimal format");
        double wExp= sc.nextDouble();
        System.out.println("Enter worker quarterly goal in one line"
        );
        sc.next();
        String goal= sc.nextLine();
        System.out.println("Enter if she/he qualifies for reward , 'y' or 'n' ");
        char reward= sc.next().charAt(0);
        System.out.println("Enter worker details :");
        System.out.println("----------");
        System.out.println("worker full name : "+fName+" "+sName);
        System.out.println("worker Id :"+wId+ " worker Experience : "+wExp);
        System.out.println("worker goal :"+goal);
        System.out.println("Is she/he eligible for reward :" +reward);
        System.out.println("----------");

    }
}
