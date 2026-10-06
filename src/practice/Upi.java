package practice;

import java.util.Scanner;

public class Upi {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count<=2){
            System.out.println("Enter the UPI");
            int upi = sc.nextInt();
            if (upi ==1234){
                System.out.println("open");
                break;
            }
            else {
                count ++;
            }
        }

        if (count==3){
            System.out.println("Locked");
        }
    }
}
