import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsultDoctor {
    Scanner sc = new Scanner(System.in);
    public void DrConsult() {
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Enter your phone no");
        sc.nextLine();
        String num = sc.nextLine();
        Pattern ptr = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptr.matcher(num);
        boolean valid = (match.find() && match.group().equals(num));
        sc.nextLine();
        if (valid==true){
            System.out.println("Enter The Difficulties Or Symptoms you are facing");
            String symp=sc.nextLine();
            System.out.println("Request Registered\n\t\tDoctor Will Reach Within 30mins");
        }
        else{
            System.out.println("Please Check Your Number");
        }
    }
}
