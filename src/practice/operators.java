package practice;

public class operators {
     static void  main(String[] args){
        int a=21;
        int b= 7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        int y= 12/30%2+4*+-2;
        System.out.println(y);

        a=10;
        b=12;
        System.out.println(a++); // a value is 10 after this step executes a value will store as 11
        System.out.println(b--); // b values is 12 after this line execution a values will be stored as 11
        System.out.println(++a); // in this line earlier a value is 11 and here its pre increment a value will be 12
        System.out.println(--b); // b value is store as 11 in the above line so in this it will be re increment value will be 10
        System.out.println(a++ + ++b); // a value is 12 + 11 (as b value is pre increment it will be sotred as 10 to 11)

         a= 44;
         b= 24;
         if (a > b){
             System.out.println("A is greater than B");
         }
         else {
             System.out.println("A is not greater than B");
         }

         a= 10;
         b=6;
         System.out.println(a>b);
         System.out.println(a<b);
         System.out.println(a<=b);
         System.out.println(a!=b);
    }
}
