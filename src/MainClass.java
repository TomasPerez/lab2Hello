import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by DELL on 7/11/2017.
 */
public class MainClass {
    public static void main(String[]args){

        System.out.println("Hello User");

        Scanner scnr = new Scanner(System.in);

     int userInput;


     System.out.println("Please enter a Number between 1 thru 100");
     userInput = scnr.nextInt();

         //   System.out.println("Number not valid. Enter a number 1-100");  if(userInput < 1 || userInput > 100)


     if((userInput % 2 != 0) && (userInput < 60))
     {
         System.out.println("odd");
     }
     else if((userInput % 2 != 1) && (userInput >= 2) && (userInput<=25))
        {
            System.out.println("Even and less than 25");
        }
        else if ((userInput % 2 !=1) && (userInput >= 26) && (userInput<=60))
        {
            System.out.println("Even");
        }
        else if ((userInput % 2 != 1) && (userInput >= 60))
     {
         System.out.println(userInput + " Even");
     }
     else if ((userInput % 2 != 0) && (userInput >60))
     {
         System.out.println(userInput + " Odd and over 60");
     }







    }

}
