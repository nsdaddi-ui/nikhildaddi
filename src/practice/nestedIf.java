package practice;

import java.util.Scanner;

public class nestedIf {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the phone pin=");
        int phpin = sc.nextInt();
        if (phpin ==2365){
            System.out.println("Logged in to the phone");
            System.out.println("Please ent the whatsapp pin");
            int whpin= sc.nextInt();
            if (whpin == 7894){
                System.out.println("Logged in to the whstapp");
            }
            else{
                System.out.println("Incorrect whatsapp Pin");
            }



        }
        else {
            System.out.println("Wrong Phone pin");
        }
    }
}
