package practice;

import java.util.Scanner;

public class CountOfNumber {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number to be count");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num = num/10;
            count ++;

        }
        System.out.println("C0unt of the given mumber is = " + count);
    }
}
