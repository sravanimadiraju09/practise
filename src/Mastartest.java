public class Mastartest {
    public static void main(String[] args) {
        String test= "Welcome to I.T MASTAR";
        String x= test.substring(15,17);
        System.out.println(x);
//        output = MA
        char word= x.charAt(0);
        char word1= x.charAt(1);
        String letter= String.valueOf(Character.toLowerCase(word1));
        String output= word+letter;
        System.out.println(output);
//output = Ma
        System.out.println(x);
        char word2= x.charAt(0);
        System.out.println(word2);
        System.out.println(letter);
        System.out.println(x+letter);
// output = MAa
        System.out.println(test.substring(17,21));
        String y= test.substring(16,21);
        String z= String.valueOf(test.charAt(17)+y.toLowerCase());
        System.out.println(z);
        String op=output+z;
        System.out.println(op);
//        System.out.println(output+z);
//        output = STAR, Sastar, MaSastar

//        System.out.println(z);
        String op1=op.substring(0,3);
        String op2=op.substring(5);
        String finalOutput=op1+op2;
        System.out.println(finalOutput);
//        output = MaStar
    }
}
