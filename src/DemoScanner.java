import java.util.Scanner;
public class DemoScanner {
    public static void main(String[]args){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your full name");
        //declaring a string object to store name of user
        String name = object.nextLine();
        System.out.println("Enter your age");
        byte age = object.nextByte();
        System.out.println("Enter 4-digit secret code");
        short code = object.nextShort();
        System.out.println("Enter your cpi");
        double cpi = object.nextDouble();
        System.out.println("Enter your mobile number");
        long number = object.nextLong();
        System.out.println("Enter your Status as true for pass or false for fail");
        boolean status = object.nextBoolean();
        //to close scanner call close method
        object.close();
        //output
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("4-digit code : " +code);
        System.out.println("CPI: " +cpi);
        System.out.println("Mobile no: " +number);
        System.out.println("Status: " +status);

    }
}
