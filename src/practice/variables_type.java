package practice;

public class variables_type {

    static int a=10;
    static void main (String[] args) {
        a=78;               // it will print a value as 78 bcz local variable is first preference in the method
        System.out.println(a);
        System.out.println(b);
        System.out.print(variables_type2.y);   // we are printing y value from the other class
    }

    static int b=19;


}

 class variables_type2{
    static int y=12;

}