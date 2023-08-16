import java.util.Scanner;

public class Scannerdemo1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter name");
        String name= input.next();
        System.out.println("Please enter age");
        int age= input.nextInt();
        boolean isMajor;
        if (age > 18) {
            System.out.println(name + "is a Major");
        }
        else {
            System.out.println(name + "is a Minor");
        }

    }
}
