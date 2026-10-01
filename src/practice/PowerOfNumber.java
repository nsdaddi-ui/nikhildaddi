package practice;

import java.util.Scanner;

public class PowerOfNumber {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number");
        int num = sc.nextInt();

        System.out.println("Please enter the power of number");
        int pow = sc.nextInt();
        int result =1;
        for (int i=1;i<=pow;i++){
            result = result * num;
        }
        System.out.println(result);
    }
}
