import java.util.Scanner;
import java.util.Arrays;
import java.io.Console;
 
public class LoginMain1 {
 
public static void main(String[] args) {
 
    String Username;
    String Password;
 
    Password = "Amireddi";
    Username = "Kiran";
	boolean granted = false;
    for(int i = 0; i < 3; i++) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String user = input1.next();
 
    Scanner input2 = new Scanner(System.in);
	Console console = System.console();
    char[] pd = console.readPassword("Enter password :");  
    #Arrays.fill(pd, '*');
    #System.out.println("Enter Password : ");
   # String pd1 = input2.next();
 
    if (Username.equals(user) && Password.equals(new String(pd))) {
 
        granted = true;
        break;
    }
 
    else if (Username.equals(user)) {
        System.out.println("Invalid Password!");
    } else if (Password.equals(new String(pd))) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
}
   if(granted)
       System.out.println("Access Granted! Welcome!");
    else
       System.out.println("Access Denied! You have reached the maximum number of attempts");
       System.exit(0);
}
 
}