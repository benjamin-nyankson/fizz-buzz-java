import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
       int numb =  scanner.nextInt();

       if((numb % 3 ==0) && (numb % 5 == 0)){
            System.out.println("FizzBuzz");
        } else if (numb % 3 == 0) {
           System.out.println("Buzz");

       } else if (numb % 5 == 0) {
           System.out.println("Fizz");
       } else {
           System.out.println(numb);

       }
    }
}