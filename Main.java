import java.util.Scanner;

public class Main {

    //When you divide a number by 10. its first remainder would be first reverse number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();

        while(num>0){
            var res= num % 10; // this logic will take remainder
            num = num /10; // this will reduce the number .
            System.out.println(res);
    }

    }

}