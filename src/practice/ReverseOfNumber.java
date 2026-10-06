package practice;

public class ReverseOfNumber {
    static void main(String[] args) {

        int num = 456;
        int revn =0;
        while (num>0){

            int l = num %10;
            num= num/10;
            revn = revn *10 + l;
        }
        System.out.println(revn);

    }
}


