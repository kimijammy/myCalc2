import java.util.Scanner;
public class myCalculator {
    static int add(int num1,int num2){
        return num1 + num2;
    }
    static int sub(int num1,int num2){
        return num1 - num2;
    }
    static int times(int num1,int num2){
        return num1 * num2;
    }
    static int div(int num1,int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = Integer.parseInt(read.next());
        System.out.println("Enter Second Number");
        int num2 = Integer.parseInt(read.next());

        System.out.println("The sum when adding numbers "+num1 +"+"+num2 + " together is: "+add(num1,num2));
        System.out.println("The sum when subtracting numbers "+num1 +"-"+num2 + " together is: "+sub(num1,num2));
        System.out.println("The sum when multiplying numbers "+num1 +"x"+num2 + " together is: "+times(num1,num2));
        System.out.println("The sum when dividing numbers "+num1 +"/"+num2 + " together is: "+div(num1,num2));
    }
}
