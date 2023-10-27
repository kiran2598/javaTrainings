import java.io.*;
 
import java.util.Scanner;
 
 
// mask password with asterisk java console
 
class ThreadDisappear implements Runnable {
 
    private boolean end;
 
 
    public ThreadDisappear(String prompt) {
 
        System.out.print(prompt);
 
    }
 
 
    public void run() {
 
        end = true;
 
        while (end) {
 
            System.out.print("\010*");
 
            try {
 
                Thread.currentThread().sleep(1); //
 
            } catch (InterruptedException ie) {
 
                ie.printStackTrace();
 
            }
 
        }
 
    }
 
 
    public void maskEnd() {
 
        this.end = false;
 
 
    }
 
 
}
 
 
class Main {
 
    public static void main(String[] args) {
 
 
        String Username;
 
        String Password;
 
 
        Password = "1234";
 
        Username = "admin";
 
        Scanner input1 = new Scanner(System.in);
 
        System.out.println("Enter Username : ");
 
        String user = input1.next();
 
 
        ThreadDisappear td = new ThreadDisappear("Enter your password: ");
 
        Thread t = new Thread(td);
 
        t.start();
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String password = null;
 
        try {
 
            password = br.readLine();
 
            td.maskEnd();
 
           // System.out.println("\nYour password is: " + password);
 
        } catch (IOException ioe) {
 
            ioe.printStackTrace();
 
        }
 
 
        if (Username.equals(user) && Password.equals(password)) {
 
 
            System.out.println("Access Granted! Welcome!");
 
        }
 
     
 
        else if (Username.equals(user)) {
 
            System.out.println("Invalid Password!");
 
        } else if (Password.equals(password)) {
 
            System.out.println("Invalid Username!");
 
        } else {
 
            System.out.println("Invalid Username & Password!");
 
        }
 
 
    }
 
}