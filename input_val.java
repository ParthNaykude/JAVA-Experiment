import java.util.*;
import java.io.*;

class input_val{
    public static void main(String args[])
    {
        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number Num1");
        num1 = sc.nextInt();

        System.out.println("Enter number 2");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("Result:- " + sum);
    }
}