package Week2Assigment1.Problem1;
import java.util.*;

public class ExceptionHandling {
    static void main() {
        Scanner input=new Scanner(System.in);


            try {
                System.out.print("Enter first number : ");
                int num1=input.nextInt();
                System.out.print("Enter second number : ");
                int num2= input.nextInt();
                int c= num1/num2;
                System.out.println("Result is : "+c);
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException has been occured");
            }
            catch (InputMismatchException ie){
                System.out.println("InputMismatchException has been occured");
            }

            finally {
                System.out.println("Program execution completed");
            }

    }

}
