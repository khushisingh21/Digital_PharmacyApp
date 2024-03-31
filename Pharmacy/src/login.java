import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login {
    public String email;
    public String phone;
    public String name;
    public String address;
    public  boolean gmail(){
        System.out.println("Enter your Email Id");
        Scanner sc = new Scanner(System.in);
        String Gmail = sc.nextLine();
        Pattern ptr = Pattern.compile("^[a-z][A-Za-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,6}$");
        Matcher match = ptr.matcher(Gmail);
        boolean valid = (match.find() && match.group().equals(Gmail));
        this.email=Gmail;
        return valid;
    }
    public  boolean PhoneNumber() {
        System.out.println("Enter your phone no");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Pattern ptr = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptr.matcher(num);
        boolean valid = (match.find() && match.group().equals(num));
        phone = num;
        return valid;
    }
    public void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String FirstName = sc.nextLine();
        System.out.println("Enter your Last Name");
        String lastName = sc.nextLine();
        name=FirstName+" "+lastName;
    }
    public void address() {
        System.out.println("Enter The Flat/House No/Floor/Building");
        Scanner sc = new Scanner(System.in);
        String flat = sc.nextLine();
        System.out.println("Enter The Area/Sector/Locality");
        String area = sc.nextLine();
        System.out.println("Enter The Nearby Landmark");
        String landmark = sc.nextLine();
        System.out.println("Enter Your Pincode");
        String Pincode = sc.nextLine();
        address = flat +" "+ area +" "+ landmark +" "+ Pincode;
    }
    public void det() {
        if (name != null) {
            System.out.println("Name: " + name);
        }
        if (email != null) {
            System.out.println("Email: " + email);
        }
        if (phone != null) {
            System.out.println("Phone: " + phone);
        }
        if (address != null) {
            System.out.println("Address: " + address);
        }
    }

}
