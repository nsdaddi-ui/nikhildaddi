package practice;

import java.util.Scanner;

public class Flows {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the UserName");
        String un= sc.next();
        System.out.println("Please ent he pssword");
        String pw= sc.next();

        if(un.equals("abc") && pw.equals("abc@123")){
            System.out.println("Login to the phone");
        }
        else {
            System.out.println("Error");
        }
        // // given num is +ve or -ve or 0
        int num =sc.nextInt();
        System.out.println("Please enter the number");
        if (num > 0){
            System.out.println("num is +ve");
        }
        else if (num == 0){
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Number is -ve");
        }
    }
}
