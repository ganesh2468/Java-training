import java.util.Scanner;
//WAP to create your own exception class and show the usage of throw and throws keywords as well as try catch finally block
class InvalidAgeException  extends Exception
        {
            public InvalidAgeException (String str)
        {
            super(str);
        }
        }
public class OwnException
{
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        try
        {

            validate(age);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

            System.out.println("Exception occurred: " + ex);
        }
    }
}