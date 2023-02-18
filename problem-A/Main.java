
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws NumberFormatException,ArithmeticException{
            Scanner scan = new Scanner(System.in);
        try{

            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            Calculator obj1 = new Calculator(n1, n2);
            Calculator obj2 = new Calculator(n1, n2);
            Calculator obj3 = new Calculator(n1, n2);
            Calculator obj4 = new Calculator(n1,n2);

            System.out.println("Addition :" + obj1.Add());
            System.out.println("Subtraction :" + obj2.Subtract());
            System.out.println("Multiplicatin :" + obj3.Multiplay());
            System.out.println("Division :" + obj4.Divide());

        }
        catch(NumberFormatException n){
            System.out.println("You didn't enter an integer");
        }

    }}
